import java.util.Scanner;

public class Selection122 {
    public static void main(String[] args) {
        Scanner inputan22 = new Scanner(System.in);

        System.out.println("Input Your Number : "); 
        int number = inputan22.nextInt();

        String result;
        result = (number%2 == 0)? "is an even number" : "is an oddd number";
        System.out.println("number "+number +" "+ result);
        //     if (number%2 == 0){
        //         System.out.println("number "+number+" is an even number ");
        //     } else { 
        //         System.out.println("number "+number+" is an oddd number "); 
        // }
    }
}
