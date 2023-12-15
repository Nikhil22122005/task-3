import java.util.Scanner;

public class libraray {
    public static void main(String[] args) {




            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1.Admin");
                System.out.println("2.Users");
                System.out.println("3.Exit");
                int op = sc.nextInt();
                if (op == 1) {
                    admin();

                }
                if (op == 2) {
                    user();

                }
                if(op==3){
                    System.exit(0);
                }

        }
    }


        static String admin () {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1.Add book");
                System.out.println("2.Exit");
                int ex = sc.nextInt();
                if(ex==2){
                    return null;
                }
                if(ex==1) {
                    int v1 = 5;
                    v1++;
                    System.out.println("Enter book name:");
                    String name = v1 + "." + sc.next();
                    System.out.println(name + " book added  to library");
                }



            }
        }


    static String user() {
            Scanner sc = new Scanner(System.in);
            String book1 = null;
            String book2 = null;
            String book3 = null;
            String book4 = null;
            String book5 = null;
            while (true) {
                System.out.println("1.Book list");
                System.out.println("2.Issue a book");
                System.out.println("3.Return a book");
                System.out.println("4.Exit");
                int a = sc.nextInt();
                if(a==4){
                    System.exit(0);
                }
                if (a == 1) {
                    book1 = "1.Piranesi by Susanna Clarke";
                    System.out.println(book1);
                    book2 = "2.Project Hail Mary by Andy Weir";
                    System.out.println(book2);
                    book3 = "3.The Midnight Library by Matt Haigh";
                    System.out.println(book3);
                    book4 = "4.Klara and the Sun by Kazuo Ishiguro";
                    System.out.println(book4);
                    book5 = "5.The House in the Cerulean Sea by T.J. Klune";
                    System.out.println(book5);


                }
                if (a == 2) {
                    System.out.println("Enter the book :");
                    int books = sc.nextInt();
                    if (books == 1) {
                        System.out.println(book1 + "-----book is issued----");
                    }
                    if (books == 2) {
                        System.out.println(book2);
                        System.out.println(book1 + "-----book is issued----");
                    }
                    if (books == 3) {
                        System.out.println(book3);
                        System.out.println(book1 + "-----book is issued----");
                    }
                    if (books == 4) {
                        System.out.println(book4);
                        System.out.println(book1 + "-----book is issued----");
                    }
                    if (books == 5) {
                        System.out.println(book5);
                        System.out.println(book1 + "-----book is issued----");
                    }
                }
                if (a == 3) {
                    System.out.println("Enter book issued:");
                    int b = sc.nextInt();

                    if (b == 1) {
                        System.out.println(book1 + "-----book is Returned----");
                    }
                    if (b == 2) {
                        System.out.println(book2 + "-----book is Returned----");
                    }
                    if (b == 3) {
                        System.out.println(book3 + "-----book is Returned----");
                    }
                    if (b == 4) {
                        System.out.println(book4 + "-----book is Returned----");
                    }
                    if (b == 5) {
                        System.out.println(book5 + "-----book is Returned----");
                    }
                }
            }






    }
}


