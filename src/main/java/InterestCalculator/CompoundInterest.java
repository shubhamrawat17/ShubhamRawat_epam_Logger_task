package InterestCalculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest extends InterestInfo{
    private static final Logger LOGGER = LogManager.getLogger(CompoundInterest.class);
    protected   CompoundInterest(double p,float r,float t)
    {
        super(p,r,t);
    }
    protected double CalculateInterest()
    {
        LOGGER.info("Entered CalculateInterest in CompoundInterest class");
        double c = p*(Math.pow(1+r/100,t));
        return c;
    }

}
