import java.util.Scanner;
class Book{
    String name, author;
    double price;
    int numpage;
    Book(String name , String author, double price, int numpage)
    {
        this.name =name;
        this.author =author;
        this.price =price;
        this.numpage =numpage;
    }
    Book(){
        this.name="";
        this.author ="";
        this.price =0.0;
        this.numpage =0;
    }
    void int_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of the book:");
        name = sc.next();
        System.out.println("enter author name:");
        author = sc.next();
        System.out.println("enter price:");
        price= sc.nextDouble();
        System.out.println("enter no of pages:");
        numpage =sc.nextInt();
    }
    void get_details(){
        System.out.println("name of the book:" +name);
        System.out.println("name of the author :" +author);
        System.out.println("price:"+price);
        System.out.println("no of pages in the book:"+numpage);
    }
    public String toString(){
        return"book name:" + name+ "\n "+ "author:" +author+ "\n"+ "price:" +price+ "\n"+ "no of pages:" +numpage;
    }
}
class myBook{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of books:");
        int n= sc.nextInt();
        Book[] books = new Book[n];
        for (int i=0;i<n;i++)
        {
            books[i] = new Book();
            books[i].int_details();
            books[i].get_details();
        }
        System.out.println("all book details:" );
        for(Book book: books)
        {
            System.out.println(book);
        }
    }
}