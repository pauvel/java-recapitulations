import java.util.Arrays;
import java.util.List;

public class GenericsWildcard {

    static Double sum(List< ? extends Number> nums){

        Double s = 0.0;
        for(Number element : nums){
            s += element.doubleValue();
        }

        return s;
    }

    public static void main(String[] args) {
        Double x = GenericsWildcard.sum(
                Arrays.asList(
                        1,
                        200,
                        new Integer(984),
                        new Float(52.76),
                        new Double(91.33)
                )
        );
        System.out.println("Sum = " + x);
        System.out.println("Sum = " + x);
    }

}
