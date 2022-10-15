import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}


class myBookClass extends Book {

    public myBookClass() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
    
}


public class MyBook{
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the title of a book:");
        String title=sc.nextLine();
        myBookClass new_novel=new myBookClass();
        new_novel.setTitle(title);
        System.out.println("The title is: "+"'"+new_novel.getTitle()+"'");
        sc.close();
        }
}