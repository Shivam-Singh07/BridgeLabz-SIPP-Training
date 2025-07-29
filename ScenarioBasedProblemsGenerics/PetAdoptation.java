import java.util.*;

class Pet<T> {
    private T type;
    private String name;
    private int quantity;

    public Pet(T type, String name, int quantity) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }

    public T getType() { return type; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void increment(int qty) { this.quantity += qty; }
    public void decrement() { if (quantity > 0) quantity--; }
}

class Inventory<T> {
    private Map<String, Pet<T>> pets = new HashMap<>();

    public void addPet(Pet<T> pet) {
        pets.put(pet.getName().toLowerCase(), pet);
    }

    public Pet<T> getPet(String name) {
        return pets.get(name.toLowerCase());
    }

    public Collection<Pet<T>> getAllPets() {
        return pets.values();
    }

    public void displayAvailablePets() {
        for (Pet<T> pet : pets.values()) {
            System.out.println(pet.getName() + " - " + pet.getQuantity() + " available");
        }
    }
}

class Customer {
    private String name;
    private List<String> adoptedPets = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void adoptPet(String petName) {
        adoptedPets.add(petName);
    }

    public String getName() { return name; }
    public List<String> getAdoptedPets() { return adoptedPets; }
}

public class PetAdoptation {
    private static Scanner sc = new Scanner(System.in);
    private static Inventory<String> dogInventory = new Inventory<>();
    private static Inventory<String> catInventory = new Inventory<>();

    public static void main(String[] args) {
        initializeInventories();
        while (true) {
            System.out.println("\n--- Welcome to the Pet Adoption Center ---");
            System.out.println("Select your role:\n1. Customer\n2. Admin\n3. Exit");
            int role = getIntInput("Enter your choice: ");
            switch (role) {
                case 1:
                    customerFlow();
                    break;
                case 2:
                    adminFlow();
                    break;
                case 3:
                    System.out.println("Thank you for visiting! Goodbye.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void initializeInventories() {
        dogInventory.addPet(new Pet<>("Dog", "German Shepherd", 3));
        dogInventory.addPet(new Pet<>("Dog", "Labrador", 4));
        dogInventory.addPet(new Pet<>("Dog", "Pit Bull", 2));
        dogInventory.addPet(new Pet<>("Dog", "Hound", 3));
        catInventory.addPet(new Pet<>("Cat", "Persian Cat", 4));
        catInventory.addPet(new Pet<>("Cat", "Ragdoll", 2));
        catInventory.addPet(new Pet<>("Cat", "Scottish Fold", 4));
    }

    private static void customerFlow() {
        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();
        Customer customer = new Customer(customerName);

        while (true) {
            System.out.println("\nSelect which pet you want to adopt:\n1. Dog\n2. Cat\n3. Logout");
            int choice = getIntInput("Enter your choice: ");
            if (choice == 3) {
                System.out.println("Logging out...");
                break;
            }
            Inventory<String> inventory = (choice == 1) ? dogInventory : (choice == 2) ? catInventory : null;
            if (inventory == null) {
                System.out.println("Invalid choice.");
                continue;
            }
            inventory.displayAvailablePets();
            int count = getIntInput("Enter the number of pets you want to adopt: ");
            for (int i = 0; i < count; i++) {
                System.out.print("Enter pet name you want to adopt: ");
                String petName = sc.nextLine();
                Pet<String> pet = inventory.getPet(petName);
                if (pet != null && pet.getQuantity() > 0) {
                    pet.decrement();
                    customer.adoptPet(pet.getName());
                    System.out.println("You adopted: " + pet.getName());
                } else {
                    System.out.println("Pet not available or out of stock.");
                }
            }
        }
    }

    private static void adminFlow() {
        while (true) {
            System.out.println("\nAdmin Menu:\n1. View Dogs\n2. View Cats\n3. Add Pet Stock\n4. Logout");
            int choice = getIntInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    dogInventory.displayAvailablePets();
                    break;
                case 2:
                    catInventory.displayAvailablePets();
                    break;
                case 3:
                    addPetStock();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addPetStock() {
        System.out.println("Add stock to:\n1. Dog\n2. Cat");
        int type = getIntInput("Enter your choice: ");
        Inventory<String> inventory = (type == 1) ? dogInventory : (type == 2) ? catInventory : null;
        if (inventory == null) {
            System.out.println("Invalid choice.");
            return;
        }
        inventory.displayAvailablePets();
        System.out.print("Enter pet name to add stock: ");
        String petName = sc.nextLine();
        Pet<String> pet = inventory.getPet(petName);
        if (pet != null) {
            int qty = getIntInput("Enter quantity to add: ");
            pet.increment(qty);
            System.out.println("Stock updated for " + pet.getName());
        } else {
            System.out.println("Pet not found.");
        }
    }

    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int val = Integer.parseInt(sc.nextLine());
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
    }
}
