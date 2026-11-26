import java.util.Scanner;

public class Library {

    static String[] titles = new String[1000];
    static String[] authors = new String[1000];
    static boolean[] isIssued = new boolean[1000];
    static int count = 0;

    public static void addBook(String title, String author){
        titles[count] = title;
        authors[count] = author;
        isIssued[count] = false;
        count++;
    }

    public static void showBooks(){
        if(count == 0){
            System.out.println("Books are empty");
            return;
        }
        else {
            for(int i=0; i<count; i++){
                System.out.println((i+1) + ".Title: " + titles[i] + ", authors: " + authors[i]
                                    + ", Issued: " + (isIssued[i]? "Yes" : "No"));
            }
        }
    }

    public static void issueBook(int index){
        if (index >=0 && index < count){
            if(!isIssued[index]){
                isIssued[index] = true;
                System.out.println("Book issued successfully!");
            }
            else{
                System.out.println("Book is already isseud.");
        }
        }
        else{
            System.out.println("Invalid index!!!");

        }
    }

    public static void returnBook(int index){
        if (index >=0 && index < count){
            if(isIssued[index]){
                isIssued[index] = false;
                System.out.println("Book return successfully!");
            }
            else{
                System.out.println("Book was not issued.");
        }
        }
        else{
            System.out.println("Invalid index!!!");

        }
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while(choice!=5){
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    addBook(title, author);
                    break;
                case 2:
                    showBooks();
                case 3:
                    showBooks();
                    System.out.print("Enter the book number: ");
                    int issueIndex = input.nextInt() - 1;
                    issueBook(issueIndex);
                    break;
                case 4:
                    showBooks();
                    System.out.print("Enter the book number: ");
                    int returnIndex = input.nextInt() - 1;
                    returnBook(returnIndex);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("invalid!");
            }
        }
        input.close();
    }
}
