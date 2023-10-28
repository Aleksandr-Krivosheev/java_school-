import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите натуральное число N: ");
        int n=0;
        if(scanner.hasNextInt()) {
          n = scanner.nextInt();
        } else {
          System.out.println("Вы ввели не число");
          System. exit(0);
        }

        int i = 0;    
        do {
            System.out.println(inputString);
            i++;
        }while(i < n);
        
        
    }
}