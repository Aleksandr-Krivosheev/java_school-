import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во воды в литрах: ");
        int x=0;
        if(scanner.hasNextInt()){
            x = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не число");
            System. exit(0);
        }

        System.out.print("Введите натуральное число студентов: "); //как студеты могуть быть не натуральными)???
        int n=0;
        if(scanner.hasNextInt()) { 
            n = scanner.nextInt(); 
        } else {
            System.out.println("Вы ввели не число");
            System. exit(0);
        }
        
        if ((x <= 0) || (n <= 0)){
            System.out.println("Введены некорректные данные");
            System. exit(0);
        }
        
        int multipy = n*x;
        for (int i = 1; i <= 16; i++){
            System.out.println("К " + i + " неделе будет выпито " + multipy + " литров жидкости");
            multipy = multipy + n*x;
        }
        
        
    }
}