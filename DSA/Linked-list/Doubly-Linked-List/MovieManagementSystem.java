import java.util.Scanner;

class Movie
{
    String movietitle;
    String director;
    int yearOfRelease;
    float rating;
    Movie next = null;
    Movie prev = null;

    Movie(String movietitle, String director, int yearOfRelease, float rating)
    {
        this.movietitle = movietitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = next;
        this.prev = prev;
    }
}



public class MovieManagementSystem 
{
    private Movie head = null;
    public void addAtBeginning(String movietitle, String director, int yearOfRelease, float rating)
    {
        Movie newMovie = new Movie(movietitle, director, yearOfRelease, rating);
        newMovie.next = head;
        newMovie.prev = null;
        if(head != null)
        {
            head.prev = newMovie;
        }
        head = newMovie;
        System.out.println("Added at begenning.");
    }

    public void addAtEnd(String movietitle, String director, int yearOfRelease, float rating)
    {
        Movie newMovie = new Movie(movietitle, director, yearOfRelease, rating);
        if(head == null) head = newMovie;
        else
        {
            Movie temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newMovie;
            newMovie.prev = temp;
        }
        System.out.println("Added at last.");

    }

    public void removeByTitle(String movietitle)
    {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Movie temp = head;
        // If head needs to be removed
        if (head.movietitle.equals(movietitle)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println("Movie is removed.");
            return;
        }
        // Traverse to find the movie
        while (temp != null && !temp.movietitle.equals(movietitle)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }
        // Remove the node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        System.out.println("Movie is removed.");
    }

    public void displayInReverse()
    {
        if(head == null)
        {
            System.out.println("List is Empty.");
            return;
        }
        Movie temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;    
        }
        while (temp != null) 
        {
            System.out.println("---------------------------");
            System.out.println("Movie Title: " + temp.movietitle);
            System.out.println("Director: " + temp.director);
            System.out.println("Year Of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            temp = temp.prev; 
        }
        System.out.println("---------------------------");
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Movie temp = head;
        System.out.println("Movie Records:");
        while (temp != null) {
            System.out.println("---------------------------");
            System.out.println("Movie Title: " + temp.movietitle);
            System.out.println("Director: " + temp.director);
            System.out.println("Year of release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            temp = temp.next;
        }
        System.out.println("---------------------------");
    }








    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MovieManagementSystem list = new MovieManagementSystem();
        boolean exit = false;
        
        while(!exit)
        {
            System.out.println("\n Movie Record menu:");
            System.out.println("1. To add at the begenning.");
            System.out.println("2. To add at the last.");
            System.out.println("3. To remove by movie title.");
            System.out.println("4. To display all.");
            System.out.println("5. To print in reverse order.");
            System.out.println("6. To Exit");


            int choice = sc.nextInt();
            String movietitle, director;
            int yearOfRelease;
            float rating;

            switch (choice) {
                case 1:
                    System.out.println("Enter the movie name: ");
                    sc.nextLine();
                    movietitle = sc.nextLine().toLowerCase();
                    System.out.println("Enter the movie director name: ");
                    director = sc.nextLine().toLowerCase();
                    System.out.println("Enter the year of release : ");
                    yearOfRelease = sc.nextInt();
                    System.out.println("Enter the rating of the movie");
                    rating = sc.nextFloat();
                    sc.nextLine();
                    list.addAtBeginning(movietitle, director, yearOfRelease, rating);
                    break;
                
                case 2:
                    System.out.println("Enter the movie name: ");
                    sc.nextLine();
                    movietitle = sc.nextLine().toLowerCase();
                    System.out.println("Enter the movie director name: ");
                    director = sc.nextLine().toLowerCase();
                    System.out.println("Enter the year of release : ");
                    yearOfRelease = sc.nextInt();
                    System.out.println("Enter the rating of the movie");
                    rating = sc.nextFloat();
                    sc.nextLine();
                    list.addAtEnd(movietitle, director, yearOfRelease, rating);
                    break;

                case 3:
                    System.out.println("Enter the movie name: ");
                    sc.nextLine();
                    movietitle = sc.nextLine().toLowerCase();
                    list.removeByTitle(movietitle);
                    break;

                case 4:
                    list.displayAll();
                    break;

                case 5:
                    list.displayInReverse();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting....");
                    break;

                default:
                    break;
            }
        }
    }


}
