package OCAtasks.assesment1.namingFeatures;

/**
 * Created by veronika on 24.03.2019.
 */
public class NumberNamingFeature {
   /* double notAtStart = _1000.00; // DOES NOT COMPILE
    double notAtEnd = 1000.00_; // DOES NOT COMPILE
    double notByDecimal = 1000_.00; // DOES NOT COMPILE*/
    double annoyingButLegal = 1_00_0.0_0; // this one compiles
}
/*Thing you need to know about numeric literals is a feature added in Java 7. You
can have underscores in numbers to make them easier to read*/