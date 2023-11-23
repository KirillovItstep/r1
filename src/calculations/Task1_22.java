package calculations;

public class Task1_22 {
    public static void main(String[] args) {
        /*
        1. Решение простых задач
        2. Чтение книг
        3. Посмотреть ролик
         */
        //Вычислить значение функции IO
        double x = 1.;
        double y = 7*x*x-3*x+6;
        System.out.println("y = "+y);

        x = 8.;
        System.out.println(Math.cbrt(x));

        double h=1.8, r=6350_000;
        double l=Math.sqrt((r+h)*(r+h)-r*r);
        System.out.println(l);
    }
}
