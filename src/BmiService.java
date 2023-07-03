public class BmiService {

    public int calculate(int kg, double meter) {
        return (int) (kg / (meter * meter));
    }
}
