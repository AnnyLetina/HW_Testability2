public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(51,1.64);
        System.out.println(index);
    }
}