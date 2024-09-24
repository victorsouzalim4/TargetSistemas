package Testes.Questao01;
import java.util.Scanner;

public class IO {
    public static boolean isInFibonacci(int value){
        boolean flag = false;
        int v1 = 0;;
        int v2 = 1;

        while(value >= v2){
            System.out.print(v2 + " ");
            if(value == v2)flag = true;

            int tmp = v2;
            v2 = v2 + v1;
            v1 = tmp;   
        }
        System.out.println(v2);

        return flag;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int value = Sc.nextInt();

        if(isInFibonacci(value)){
            System.out.println("contains");
        }else{
            System.out.println("does not contain");
        }
        
    }
}