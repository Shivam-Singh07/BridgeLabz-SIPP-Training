import java.util.*;

class Order<T> {
    private String itemName;
    private int quantity;
    private T category;

    public Order(String itemName, int quantity, T category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
    }

    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public T getCategory() { return category; }

    @Override
    public String toString() {
        return itemName + " | " + quantity + " | " + category;
    }
}

class OrderManager<T> {
    private Queue<Order<T>> orderQueue = new LinkedList<>();

    public void addOrder(String itemName, int quantity, T category) {
        orderQueue.offer(new Order<>(itemName, quantity, category));
    }

    public Order<T> deliverOrder() {
        return orderQueue.poll();
    }

    public List<Order<T>> filterByCategory(T category) {
        List<Order<T>> filtered = new ArrayList<>();
        for (Order<T> order : orderQueue) {
            if (order.getCategory().equals(category)) {
                filtered.add(order);
            }
        }
        return filtered;
    }

    public List<Order<T>> getAllOrders() {
        return new ArrayList<>(orderQueue);
    }
}

class MenuItem {
    String name;
    String category;

    MenuItem(String name, String category) {
        this.name = name;
        this.category = category;
    }
}

public class BakeryOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager<String> system = new OrderManager<>();

        List<MenuItem> menu = Arrays.asList(
            new MenuItem("Chocolate Cake", "cake"),
            new MenuItem("Vanilla Cake", "cake"),
            new MenuItem("Strawberry Pastry", "pastry"),
            new MenuItem("Black Forest Pastry", "pastry"),
            new MenuItem("Choco Chip Cookie", "cookie"),
            new MenuItem("Oatmeal Cookie", "cookie")
        );

        System.out.println("Welcome to the Bakery Order System!");
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d. %s (%s)%n", i + 1, menu.get(i).name, menu.get(i).category);
        }
        System.out.println("\nCommands:");
        System.out.println("order <itemNumber> <quantity>  - Place an order from menu");
        System.out.println("deliver                        - Deliver next order");
        System.out.println("filter <category>              - Show orders by category");
        System.out.println("all                            - Show all orders");
        System.out.println("exit                           - Exit");

        while (true) {
            System.out.print("\nEnter command: ");
            String input = sc.nextLine().trim();
            String[] parts = input.split(" ");
            if (parts[0].equalsIgnoreCase("order")) {
                if (parts.length < 3) {
                    System.out.println("Usage: order <itemNumber> <quantity>");
                    continue;
                }
                try {
                    int itemNum = Integer.parseInt(parts[1]);
                    int qty = Integer.parseInt(parts[2]);
                    if (itemNum < 1 || itemNum > menu.size()) {
                        System.out.println("Invalid item number.");
                        continue;
                    }
                    if (qty < 1) {
                        System.out.println("Quantity must be at least 1.");
                        continue;
                    }
                    MenuItem item = menu.get(itemNum - 1);
                    system.addOrder(item.name, qty, item.category);
                    System.out.println("Order placed: " + item.name + " x" + qty + " (" + item.category + ")");
                } catch (NumberFormatException e) {
                    System.out.println("Item number and quantity must be integers.");
                }
            } else if (parts[0].equalsIgnoreCase("deliver")) {
                Order<String> delivered = system.deliverOrder();
                if (delivered != null) {
                    System.out.println("Delivered: " + delivered);
                } else {
                    System.out.println("No orders to deliver.");
                }
            } else if (parts[0].equalsIgnoreCase("filter")) {
                if (parts.length < 2) {
                    System.out.println("Usage: filter <category>");
                    continue;
                }
                List<Order<String>> filtered = system.filterByCategory(parts[1]);
                if (filtered.isEmpty()) {
                    System.out.println("No orders found for category: " + parts[1]);
                } else {
                    System.out.println("Orders in category '" + parts[1] + "':");
                    for (Order<String> o : filtered) System.out.println(o);
                }
            } else if (parts[0].equalsIgnoreCase("all")) {
                List<Order<String>> all = system.getAllOrders();
                if (all.isEmpty()) {
                    System.out.println("No orders in the system.");
                } else {
                    System.out.println("All orders:");
                    for (Order<String> o : all) System.out.println(o);
                }
            } else if (parts[0].equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Bakery Order System!");
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }
        sc.close();
    }
}