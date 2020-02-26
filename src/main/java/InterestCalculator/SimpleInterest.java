package InterestCalculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SimpleInterest extends InterestInfo{
    private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);

    protected SimpleInterest(double p,float r,float t)
    {
        super(p,r,t);

    }
    protected double CalculateInterest()
    {
        LOGGER.info("Entered interestCalculate in SimpleInterest Class");
        double s = p*r*t;
        s = s/100;
        return s;
    }
}
