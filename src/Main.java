import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProgrammingBook[] progammingbook = new ProgrammingBook[5];
        progammingbook[0] = new ProgrammingBook(101,"nameBook1",10000,"Khaitrinh","Java","Libraries");
        progammingbook[1] = new ProgrammingBook(102,"nameBook2",11000,"Khaitrinh","Java","API");
        progammingbook[2] = new ProgrammingBook(103,"nameBook3",12000,"Khaitrinh","PHP","AJAX");
        progammingbook[3] = new ProgrammingBook(104,"nameBook4",13000,"Khaitrinh","C++","Security");
        progammingbook[4] = new ProgrammingBook(105,"nameBook5",15500,"Khaitrinh","PYTHON","Compilers");

        Book[] b = {};
        System.out.println("Danh sách Programmingbooks : ");
        for (Book i: progammingbook) {
            System.out.println(i);
        }

        // Khởi tạo 5 quyển fictionbook :

        FictionBook[] fictionbook = new FictionBook[5];
        fictionbook[0] = new FictionBook(201,"nameBookA",20000,"KhaiTrinh","Fiction1",18000);
        fictionbook[1] = new FictionBook(202,"nameBookB",19000,"KhaiTrinh","Fiction2",17100);
        fictionbook[2] = new FictionBook(203,"nameBookC",14000,"KhaiTrinh","Fiction3",12600);
        fictionbook[3] = new FictionBook(204,"nameBookD",22000,"KhaiTrinh","Fiction4",19800);
        fictionbook[4] = new FictionBook(205,"nameBookE",28000,"KhaiTrinh","Fiction5",25200);
        System.out.println(" Danh sách FictionBooks : ");
        for (Book i: fictionbook) {
            System.out.println(i);
        }

        // Tổng tiền sách Programmingbook và FictionBook:

        double tolalPrice = 0;
        for (Book i: progammingbook) {
            tolalPrice += i.getPrice();
        }
        for (Book j: fictionbook) {
            tolalPrice += j.getPrice();
        }
        System.out.println("\n"+"Tổng tiền : "+ tolalPrice + " VND");

        // Số sách Programmingbook có language là "java" :

        int countJava = 0;
        int countFiction = 0;
        int count100 = 0;
        for (ProgrammingBook i: progammingbook) {
            Object value = null;
            if (value instanceof ProgrammingBook) {
               if ( i.getLanguage() == "Java")
                   countJava++;
           }else if (value instanceof FictionBook) {
               if (((FictionBook) value).getCategory().equals("Fiction1")){
                   countFiction++;
               }
               if (((FictionBook) value).getPrice() > 100000)
                   count100++;
           }
        }
        System.out.println("\n"+"Total Java books : "+ countJava + " books");
        System.out.println("\n" +"Total Fiction books have category 'Fiction 1 is: " + countFiction + "books" );
        System.out.println("\n" + "Total fiction books have a price above 100.000 is" + count100);


        Scanner sc = new Scanner(System.in);
        String search;
        System.out.println("Enter the name of the book you check the price");
        System.out.println("Enter 'Exit' to quit the program");
        do {
            search = sc.nextLine();
            boolean check = false;
            for (Book book : b) {
                if (search.equals(book.getName())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                for (Book book : b) {
                    if (search.equals(book.getName())) {
                        System.out.println("The price of the book is" + book.getName() + " là: " + book.getPrice());
                        break;
                    }
                }
            }
            else
                System.out.println("Can't find your book");
        }while (!search.equals("Exit")) ;

    }
}
