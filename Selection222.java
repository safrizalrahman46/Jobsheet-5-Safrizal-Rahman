import java.util.Scanner;

public class Selection222 {
    public static void main(String[] args) {
        Scanner inputan22 = new Scanner(System.in);
        
        System.out.println("Score UAS : ");
        float finalExam = inputan22.nextFloat();
        System.out.println("Score UTS : ");
        float midExam = inputan22.nextFloat(); 
        System.out.println("Score Quis : ");
        float quiz = inputan22.nextFloat();
        System.out.println("Score Tugas : ");
        float assignment = inputan22.nextFloat();

        //CALLCULATION
        float total = (finalExam*0.4F)+(midExam*0.3F)+(quiz*0.2F)+(assignment*0.1F);
        String message = total < 65 ? "Retake ":"Pass"; 
        System.out.println("Final Grade = "+total+" and the decission is  "+message);
    }
}
