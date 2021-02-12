import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;
import java.util.Collection;


public class Students {

    private String FName,LName,regNo,Grade;
    private Double minorAssign01,minorAssign02,Design,Implementation,FinalExam,ModMarks;

    public void Student(){

    }
    public  Students(){

    }
    public Students(String FName,String LName,String regNo,String Grade,Double minorAssign01,Double minorAssign02,Double Design,Double Implementation,Double FinalExam,Double Modmarks){
        this.FName=FName;
        this.LName=LName;
        this.regNo=regNo;
        this.Grade=Grade;
        this.minorAssign01=minorAssign01;
        this.minorAssign02=minorAssign02;
        this.Design=Design;
        this.Implementation=Implementation;
        this.FinalExam=FinalExam;
        this.ModMarks=Modmarks;

    }

    public void setFName(String FName){
        boolean spaceP=false;
        char space=' ';
        char[] stuName=FName.toCharArray();
        int Length=FName.length();
        for(int i=0; i < Length;  i++ ){
            if(FName.charAt(i) ==space){
                spaceP=true;
                throw new IllegalArgumentException();
            }else{

                for(char Name: stuName){
                    if (Character.isLetter(Name)) {
                        this.FName=FName;
                    }else{
                        System.out.println("Name should only contain Alphabets!");
                        throw new IllegalArgumentException();

                    }
                }
            }
        }






    }
    public String getFName(){
        return FName;

    }


    public void setLName(String LName) {
        boolean spaceP = false;
        char space = ' ';
        char[] stuLName = LName.toCharArray();
        int Length = LName.length();
        for (int i = 0; i < Length; i++) {
            if (LName.charAt(i) == space) {
                spaceP = true;
                throw new IllegalArgumentException();
            } else {

                for (char Name : stuLName) {
                    if (Character.isLetter(Name)) {
                        this.LName = LName;
                    } else {
                        System.out.println("Name should only contain Alphabets!");
                        throw new IllegalArgumentException();

                    }

                }
            }
        }
    }


    public String getLName(){
        return LName;

    }

    public void setRegNo(String regNo){

        if(regNo.length()==6){
            if(regNo.substring(0,3).equals("STU")){
                this.regNo=regNo;
            }else{
                System.out.println("Registration Number Doesnt meet the Requirements");
                throw new IllegalArgumentException();

            }

        }else{
            System.out.println("RegNo too short!");
            throw new IllegalArgumentException();
        }

    }
    public String getregNo(){
        return regNo;


    }

    public void setminorAssign01(Double minorAssign01){
        if( minorAssign01<=100.0){
            this.minorAssign01=minorAssign01;
        }else{
            System.out.println("Entry Error!");
            throw new IllegalArgumentException();
        }

    }

    public Double getminorAssign01(){
        return minorAssign01;

    }
    public void setminorAssign02(Double minorAssign02){
        if( minorAssign02<=100.0){
            this.minorAssign02=minorAssign02;
        }else{
            System.out.println("Entry Error!");
            throw new IllegalArgumentException();
        }

    }

    public Double getminorAssign02(){
        return minorAssign02;

    }


    public void setDesign(Double Design){
        if( Design<=100.0){
            this.Design=Design;
        }else{
            System.out.println("Entry Error!");
            throw new IllegalArgumentException();
        }

    }

    public Double getDesign(){
        return Design;

    }
    public void setImplementation(Double Implementation){
        if( Implementation<=100.0){
            this.Implementation=Implementation;
        }else{
            System.out.println("Entry Error!");
            throw new IllegalArgumentException();
        }

    }

    public Double getImplementation(){
        return Implementation;

    }
    public void setFinalExam(Double FinalExam){
        if( FinalExam<=100.0){
            this.FinalExam=FinalExam;
        }else{
            System.out.println("Entry Error!");
            throw new IllegalArgumentException();
        }

    }
    public Double getFinalExam(){
        return FinalExam;

    }

    public String getGrade(){
        return Grade;
    }

    public void setModmark(Double ModMarks){
        if( ModMarks<=100.0){
            this.ModMarks=ModMarks;
        }else{
            System.out.println("Entry Error!");
            throw new IllegalArgumentException();
        }

    }

    public Double getModMarks(){
        return ModMarks;

    }







    public Students(String FName){
        this.FName=FName;


    }


}
