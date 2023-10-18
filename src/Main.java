public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100; // вес в килограммах
        double height = 1.52; // рост в метрах
        int index;
        index = service.calculate(weight, height);
        {

            System.out.println("Индекс массы тела равен: " + index + ".");
        }
    }}



