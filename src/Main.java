import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double  result=0;
        System.out.println("1-сложение, 2-вычитание, 3-умножение, 4-деление");
        System.out.print("Введите номер операции: ");
        int Number = scanner.nextInt();
        System.out.print("Введите первое число: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double operand2 = scanner.nextDouble();

        if (Number==1)
        {
            result=operand1+operand2;
        }
        if (Number==2)
        {
            result=operand1-operand2;
        }
        if (Number==3)
        {
            result=operand1*operand2;
        }
        if (Number==4)
        {
            result=operand1/operand2;
        }
        System.out.println("Результат: "+result);

    }
}

