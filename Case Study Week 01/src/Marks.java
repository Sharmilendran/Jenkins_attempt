import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Marks {




    public void student(){
        Scanner Loop = new Scanner(System.in);
        System.out.println("Enter Choice (Y/N)");
        String entry = Loop.nextLine();

        do {
            Scanner list = new Scanner(System.in);
            System.out.println("Enter Student Name:");
            list.hasNextLine();


        } while (entry.equals("Y"));

//        if(entry.equals("Y")){
//            Scanner list = new Scanner(System.in);
//            System.out.println("Enter Student Name:");
//            list.hasNextLine();
//
//        }else{
//            System.out.println("Have a nice day!");
//        }



    }


//    public void student(String StudName, String RegNo, Integer age, Integer Mark1, Integer Mark2, Integer Mark3, Integer Mark4, Integer Mark5) {
//        this.Name = StudName;
//        this.RegiNo = RegNo;
//        this.Age = age;
//        this.Mrk1 = Mark1;
//        this.Mrk2 = Mark2;
//        this.Mrk3 = Mark3;
//        this.Mrk4 = Mark4;
//        this.Mrk5 = Mark5;





//        do {
//            Scanner list = new Scanner(System.in);
//            System.out.println("Enter Student Name:");
//            list.hasNextLine();
//
//
//        } while (P.equals("Y"));


//    }

    public static void main(String[] args) {

         Integer Age, Mrk1, Mrk2, Mrk3, Mrk4, Mrk5;
         String Name, RegiNo;

        Scanner Loop = new Scanner(System.in);
        System.out.println("Enter Choice (Y/N)");
        String entry = Loop.nextLine();

        if(entry.equals("Y")){
            Scanner list = new Scanner(System.in);
            System.out.println("Enter Student Name:");
            list.hasNextLine();

        }else{
            System.out.println("Have a nice day!");
        }


        Marks marks=new Marks();
        marks.student();

        new Marks().student();

    }
}
