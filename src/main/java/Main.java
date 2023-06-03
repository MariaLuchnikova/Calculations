public class Main {
    public static void main(String[] args) {
        // с использованием классов-обёрток примитивных дипов данных
        System.out.println(Integer.MIN_VALUE + "  " + Integer.MAX_VALUE); // диапазон значений данных типа int
        System.out.println(Float.MIN_VALUE + "  " + Float.MAX_VALUE);    // диапазон значений данных типа float
        System.out.println(Double.MIN_VALUE + "  " + Double.MAX_VALUE);  // диапазон значений данных типа double

        System.out.println(Integer.MIN_VALUE - 1);

        System.out.println(!true && !false);
        System.out.println(true && false);
        System.out.println(false || true);
        System.out.println(!(10 > 10.55));
        System.out.println(Boolean.compare(true, false));

        System.out.println(11 / 5);
        System.out.println(10 + 10.55);
        System.out.println(10.55 - 10);
        System.out.println(10 * 10.55);
        System.out.println(10.55 / 10);
        System.out.println(10 % 10.55);
    }
}



