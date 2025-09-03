import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Сумма от 1 до N Ввод: одно целое N (N ≥ 1).
        // Вывести: сумму 1 + 2 + … + N.
        /*int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);*/

        //Среднее арифметическое N чисел Ввод:
        // N, затем N целых.
        // Вывести: среднее с точностью,
        // например, до 3 знаков.
        /*int N = sc.nextInt();
        double sum = 0;
        double AvgN = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        AvgN = sum / N;
        System.out.printf("%.3f", AvgN);*/

        //Сумма цифр числа Ввод: неотрицательное целое n.
        // Вывести: сумму его цифр.
        // Подсказка: for (; n > 0; n /= 10) sum += n % 10;
        // (обработайте n==0 отдельно).
        int n = sc.nextInt();
        int sum = 0;
        for (; n > 0; n /= 10) {
            sum += n % 10;
            if (n == 0) break;
        }
        System.out.println(sum);

        asdfaasdfasdsdgf

    }
}