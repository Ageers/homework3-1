import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/* // Сумма от 1 до N Ввод: одно целое N (N ≥ 1). Вывести: сумму 1 + 2 + … + N.
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= n; i++){
            res += i;
        }
        System.out.println(res);


*/
        //2 Сумма квадратов нечётных ≤ N Ввод: N. Вывести: 1² + 3² + 5² + ... ≤ N.
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i = i + 2){
            res += Math.pow(i, 2);
        }
        System.out.println(res);
    }
}