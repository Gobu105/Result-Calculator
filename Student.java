import java.util.Scanner;

public class Student {
    public static float cgpa(int marks, float gp){
        gp = marks/10.0f;
        return gp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maths, sci, hindi, english, computer;
        String name;
        System.out.print("Enter Student Name :: ");
        name = s.nextLine();
        start:
        System.out.println("Enter Maths Marks :: ");
        maths = s.nextInt();
        System.out.println("Enter Science Marks :: ");
        sci = s.nextInt();
        System.out.println("Enter Hindi Marks :: ");
        hindi = s.nextInt();
        System.out.println("Enter English Marks :: ");
        english = s.nextInt();
        System.out.println("Enter Computer Marks :: ");
        computer = s.nextInt();
        if (maths <= 100 && sci <= 100 && hindi <= 100 && english <= 100 && computer <= 100) {
            System.out.println("\n\n\n");
            System.out.println("Student Name :: " + name);
            int total = maths + sci + hindi + english + computer;
            float per=total/5.0f;
            float gp1 = 0, gp2 = 0, gp3 = 0,gp4 = 0, gp5 =0;
            gp1 = cgpa(maths, gp1);
            gp2 = cgpa(sci, gp2);
            gp3 = cgpa(english, gp3);
            gp4 = cgpa(hindi, gp3);
            gp5 = cgpa(computer, gp3);
            float cgp = (gp1 + gp2 + gp3 + gp4 + gp5) / 5.0f;
            if(per>=40 && per<50){
                System.out.println("\nPercentage :: " + per);
                System.out.println("CGPA :: " + cgp);
                System.out.println("Congratulation You Passed With Pass Class");
            }
            if(per>=50 && per<55){
                System.out.println("\nPercentage :: " + per);
                System.out.println("CGPA :: " + cgp);
                System.out.println("Congratulation You Passed With Second Class.");
            }
            if(per>=55 && per<60){
                System.out.println("\nPercentage :: " + per);
                System.out.println("CGPA :: " + cgp);
                System.out.println("Congratulation You Passed With Higher Second Class.");
            }
            if(per>=60 && per<70){
                System.out.println("\nTotal Percentage ::" + per);
                System.out.println("CGPA :: " + cgp);
                System.out.println("Congratulation You Passed With First Class.");
            }
            if(per>=70 && per<100){
                System.out.println("\nTotal Percentage ::" + per);
                System.out.println("CGPA :: " + cgp);
                System.out.println("Congratulation You Passed With First Class with Distinction.");
            }
        }
        else {
            System.out.println("Entered Value is Above limit Try Again....");
        }
    }
}
