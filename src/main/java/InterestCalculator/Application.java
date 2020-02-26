package InterestCalculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    private static final Logger LOGGER = LogManager.getLogger(Application.class);

    static {

        LOGGER.info("Making new objects of Simple Interest Class");
        SimpleInterest si = new SimpleInterest(12000, 7, 6.5f);
        LOGGER.info("Calling interestCalculate method for calculating simple Interest");
        double simpleinterest = si.CalculateInterest();
        LOGGER.info("Making new object of Compound Interest Class");
        CompoundInterest ci = new CompoundInterest(25000, 4, 8);
        LOGGER.info("Calling interestCalculate method for calculating Compound Interest");
        double Compoundinterest = ci.CalculateInterest();
    }
    public static void main(String[] args) {


    }
}
