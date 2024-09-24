package Testes.Questao02;
import java.util.Scanner;

public class IO {

    public static int countA(String str){
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'A')counter++;
        }

        return counter;
    }

    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);

        String str = Sc.nextLine();
        int occurrences = countA(str.toUpperCase());

        if(occurrences > 0){
            System.out.println("Exists\nNumber of occurrences: " + occurrences);
        }else{
            System.out.println("Does not exist");
        }
    }
}
