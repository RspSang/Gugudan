import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Gugudan e = new Gugudan();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.println("정수를 입력하십시오:");
        int number = scanner.nextInt();
        System.out.println("-----------------");

        if(number < 0){
            System.out.println("정수를 입력해주십시오");
        }else{

            int[] result = e.calculate(number);
            e.print(result);
            System.out.println();


        }
    }
}
