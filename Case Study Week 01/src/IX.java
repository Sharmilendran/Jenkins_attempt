import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IX {



    public static List<Students>ListS=new ArrayList<Students>();                                                    ///List type of arrays are used to avoid using wrapper classes and to store and return the grades,Names and marks of the students
    public static List<String>Supplement=new ArrayList<>();
    public static List<String>Retake=new ArrayList<>();




    public Double[] Component1;
    public Double[] Component2;                                                                                         // Instance Variables
    public Double[] Component3;
    private Double Assign01,Assign02, MinAssign,Design,Implementation,project,ExamF,ModMark;
    private static Double AssignAvg=0.0,ProjectAvg=0.0,FinalExamAvg=0.0,ModuleAverage=0.0;
    private static Double ComponentOne=0.0,ComponentTwo=0.0,ComponentThree=0.0,ComponentFour=0.0,ComponentFive=0.0,ComponentSix=0.0;
    private static String ComponentOneS,ComponentTwoS,ComponentThreeS,ComponentFourS,ComponentFiveS,ComponentSixS;
    private String Grade;
//    public static String choice;


    public double  MinAssign(Double Assign1,Double Assign2){                                                //Method used to calculate the Assignment Component marks
        Double Assign=Assign1;
        this.Assign01=Assign1;
        this.Assign02=Assign2;

        MinAssign=(Assign01*0.06)+(Assign02*0.09);
        return MinAssign;

    }

    public double  Project(Double Design,Double Implementaion){                                             //Method used to calculate the Project Component marks
        this.Design=Design;
        this.Implementation=Implementaion;

        project=(Design*(0.15))+(Implementation*(0.20));
        return project;

    }

    public double  FinalExam(Double Exam){                                                                  //Method used to calculate the Final Exam Component marks
        this.ExamF=(Exam*(0.5));
        return ExamF;

    }

    public double FinalGrade(double ExamF,double project,double MinAssign){                                 //Method used to calculate the Module  marks
        this.ModMark=ExamF+project+MinAssign;
        return ModMark;
    }


    public String grading(double modMark){
        if((ExamF*1.5> 50.0) && (project+MinAssign>=35)&& (modMark>=50)){                                   //Method used to Find the grading

            if(modMark>50 && modMark<60){
                Grade = "Pass";
            }
            else if(modMark>=60 && modMark<70){
                Grade = "Credit";
            }
            else if(modMark>=70 && modMark<80){
                Grade = "Distinction";
            }
            else if(modMark>=80 && modMark<=100){
                Grade = "Higher Distinction";
            }



        }
        else if((modMark>50)  && (ExamF<50 )){
            Grade="I";

        }
        else if(modMark<50){
            System.out.println("Need to Resit");
            Grade="F";
        }
        return Grade;
    }





    public static void Average(List<Students> array){                                                                       ////method to find the Average marks of all components
        for(Students student:array){
            System.out.println(student.getminorAssign01());
            AssignAvg+=(student.getminorAssign01()+student.getminorAssign02());
            ProjectAvg+=(student.getDesign()+student.getImplementation());
            FinalExamAvg+=(student.getFinalExam());
//            ModuleAverage+=(student.getminorAssign01()+student.getminorAssign02())+(student.getDesign()+student.getImplementation())+(student.getFinalExam());
        }

        AssignAvg=AssignAvg*(0.15)/array.size();
        ProjectAvg=ProjectAvg*(0.35)/array.size();
        FinalExamAvg=FinalExamAvg*(0.5)/array.size();
        ModuleAverage=(AssignAvg+ProjectAvg+FinalExamAvg)/array.size();

        System.out.println("Assignment Average in class: "+AssignAvg);
        System.out.println("Project Average in class: "+ProjectAvg);
        System.out.println("Final Exam Average in class: "+FinalExamAvg);
        System.out.println("Module Marks Average in class:"+ ModuleAverage);


    }
    public static void HighestScorer(List<Students> Students){                                                          /////////////method to find the highest scorers of the module components
        for(Students  performer :Students){
            if(performer.getminorAssign01()>ComponentOne){
                ComponentOne=performer.getminorAssign01();
                ComponentOneS=performer.getFName();
            }
            if(performer.getminorAssign02()>ComponentTwo){
                ComponentTwo=performer.getminorAssign02();
                ComponentTwoS=performer.getFName();
            }
            if(performer.getDesign()>ComponentThree){
                ComponentThree=performer.getDesign();
                ComponentThreeS=performer.getFName();
            }
            if(performer.getImplementation()>ComponentFour){
                ComponentFour=performer.getImplementation();
                ComponentFourS=performer.getFName();
            }
            if(performer.getFinalExam()>ComponentFive){
                ComponentFive=performer.getFinalExam();
                ComponentFiveS=performer.getFName();
            }
            if(performer.getModMarks()>ComponentSix){
                ComponentSix=performer.getModMarks();
                ComponentSixS=performer.getFName();
            }

        }

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<       Best Performers     >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Assignment One highest Score:          "+ ComponentOne + "      Student Name:  "+ComponentOneS);
        System.out.println("Assignment Two highest Score:          "+ ComponentTwo + "      Student Name:  "+ComponentTwoS);
        System.out.println("Project:Design highest Score:           "+ ComponentThree +"    Student Name:  "+ComponentThreeS);
        System.out.println("Project:Implementation highest Score:   "+ ComponentFour + "    Student Name:  "+ComponentFourS);
        System.out.println("Final Exam Highest Score:               "+ ComponentFive + "    Student Name:  "+ComponentFiveS);
        System.out.println("Module highest Score:                   "+ ComponentSix + "     Student Name:  "+ComponentSixS);


        System.out.println("\n\n\n\n\n");

    }


    public static void SupplementE(List<Students> supplementE){                                                                     ////////////////method finds the students who are eligible to face supplement exams
        for( Students SupplementE :supplementE ){
            if(SupplementE.getGrade().equals("I")){
                Supplement.add(SupplementE.getFName()+" " + SupplementE.getLName());
            }continue;

        }
        System.out.println("<<<<<<<<<< List of Students who are Eligible to take a Supplement >>>>>>>>>>>>>>");
        for(String Names:Supplement ){
            System.out.println(Names);

        }System.out.println("\n\n\n");

    }

    public static void Retake(List<Students> retake) {                                                                          //Method used to calculate the Students who need to retake the module
        for (Students RetakeE : retake) {
            if (RetakeE.getGrade().equals("F")) {
                Retake.add(RetakeE.getFName() + " " + RetakeE.getLName());
            }

        }
        System.out.println("<<<<<<<<<< List of Students who  Need to Ret-Take Module >>>>>>>>>>>>>>");
        for(String Names:Retake ){
            System.out.println(Names);

        }System.out.println("\n\n\n");
    }



    public static List  StudentLister(List<Students> Student){                                                                   /////Method used to list the students in the Descending order

        int Size=Student.size();
        Students temporary;
        {
            for(int n=0;  n<Size-1   ;n++){
                for( int j= 0; j< Size-n-1 ; j++){

                        if(Student.get(j).getModMarks()<Student.get(j+1).getModMarks()){
                            temporary=Student.get(j);
                            Student.set(j,Student.get(j+1));
                            Student.set(j+1,temporary);
                        }

                }
            }
        }


        return Student;

    }

    public static void ListPrinter(List<Students> Student){

        for(Students student : Student){
            if(student.getModMarks()>50){
                System.out.println("Student Name:  "+ student.getFName()+" "+student.getLName()+"           Module Grade: "+student.getGrade()+"         Module Marks:  "+student.getModMarks());

            }

        }
        System.out.println("\n\n\n\n\n\n\n\n\n");


    }


        public static void main (String args[]){
            String choice = "null";

            do {

                Scanner Option = new Scanner(System.in);
                System.out.println("Enter Option(Y/N)");

                Students student = new Students();
                IX ix1 = new IX();


                if (Option.hasNextLine()) {
                    choice = Option.next();
                    if (choice.equals("Y")) {
                        Scanner Name = new Scanner(System.in);
                        while (true) {

                            System.out.println("Please enter First Name!");
                            String FirstName = Name.nextLine();
                            try {
                                student.setFName(FirstName);

                                break;
                            } catch (IllegalArgumentException ExceptType1) {
                                System.out.println("Invalid Entry!");
                            }

                        }
                        while (true) {
                            System.out.println("Please enter Last Name");
                            String LastName = Name.nextLine();
                            try {
                                student.setLName(LastName);

                                break;
                            } catch (IllegalArgumentException ExceptType1) {
                                System.out.println("Invalid Entry!");


                            }
                        }

                        while (true) {
                            System.out.println("Please enter Reg.NO");
                            String RegNo = Name.nextLine();
                            try {
                                student.setRegNo(RegNo);

                                break;

                            } catch (IllegalArgumentException ExceptType1) {
                                System.out.println("Invalid Entry!");

                            }
                        }
                        Scanner result = new Scanner(System.in);

                        while (true) {
                            System.out.println("Please enter Minor Assignment 01 Marks");
                            Double MinorAssign = result.nextDouble();
                            try {
                                student.setminorAssign01(MinorAssign);

                                break;

                            } catch (IllegalArgumentException ExceptType2) {
                                System.out.println("Invalid Entry!");

                            }
                        }
                        while (true) {
                            System.out.println("Please enter Minor Assignment 02 Marks");
                            Double MinorAssign2 = result.nextDouble();
                            try {
                                student.setminorAssign02(MinorAssign2);

                                break;

                            } catch (IllegalArgumentException ExceptType2) {
                                System.out.println("Invalid Entry!");

                            }
                        }

                        Scanner result2 = new Scanner(System.in);

                        while (true) {
                            System.out.println("Please enter Project Design Mark");
                            Double ProjectDes = result.nextDouble();
                            try {
                                student.setDesign(ProjectDes);

                                break;

                            } catch (IllegalArgumentException ExceptType3) {

                                System.out.println("Invalid Entry!");

                            }
                        }
                        while (true) {
                            System.out.println("Please enter Implementation Marks");
                            Double Implementation = result.nextDouble();
                            try {
                                student.setImplementation(Implementation);

                                break;

                            } catch (IllegalArgumentException ExceptType3) {
                                System.out.println("Invalid Entry!");

                            }
                        }
                        Scanner result3 = new Scanner(System.in);
                        while (true) {
                            System.out.println("Please enter Final Marks");
                            Double FinalMark = result.nextDouble();
                            try {
                                student.setFinalExam(FinalMark);

                                break;

                            } catch (IllegalArgumentException ExceptType4) {
                                System.out.println("Invalid Entry!");

                            }
                        }


                        ix1.ModMark= ix1.FinalGrade(ix1.FinalExam(student.getFinalExam()), ix1.Project(student.getDesign(), student.getImplementation()), ix1.MinAssign(student.getminorAssign01(), student.getminorAssign02()));
                        System.out.println(ix1.grading(ix1.ModMark));
//               FName,LName,regNo,Grade;
//    private Double minorAssign01,minorAssign02,Design,Implementation,FinalExam;
                        Students student2 = new Students(student.getFName(), student.getLName(), student.getregNo(), ix1.grading(ix1.ModMark), student.getminorAssign01(), student.getminorAssign02(), student.getDesign(), student.getImplementation(), student.getFinalExam(), ix1.ModMark);
                        ListS.add(student2);
                        for (Students studentz : ListS) {
                            System.out.println(
                                    " Student FName: " + studentz.getFName() + " Student LName: " + studentz.getLName() + "  Registration No: " + studentz.getregNo() + "  Grading: " + ix1.grading(ix1.ModMark) + "     Mod Marks: " + ix1.ModMark);


                        }

                        ix1.Average(ListS);


//                Students stud1 = new Students(FirstName);
//                ListS.add(stud1);

//                System.out.println(ListS.size());
                    }
//            else{
//                System.out.println("Enter Appropriate values!");
//            }

                } else {
                    System.out.println("Please enter Valid Input!");
                }

            } while (!choice.equals("N"));




            HighestScorer(ListS);
            SupplementE(ListS);
            Retake(ListS);
            ListPrinter(StudentLister(ListS));






        }






}


























//            for (Students student : ListS) {
//                System.out.println("Student Name  :" + student.getFName());
//                System.out.println("Student Grade:  " + student.getGrade());
//            }

//            System.out.println();