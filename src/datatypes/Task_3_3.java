package datatypes;

//Вычислить значение логического выражения при следующих значениях логических величин А, В и С: А = Истина, В = Ложь, С = Ложь
//не А и В; А или не В
public class Task_3_3 {
    public static void main(String[] args) {
        boolean a = true, b=false, c=false;
        boolean result = !a&&b;
        result = a||(!b);

    }
}
