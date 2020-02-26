package HouseCost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateCost {
    private String mstandard;
    private String automated;
    private double tarea;
    private static final Logger LOGGER = LogManager.getLogger(CalculateCost.class);
    public CalculateCost(String mstandard,double tarea,String automated)
    {
        LOGGER.info("Inside CalculateCost constructor");
        this.mstandard = mstandard;
        this.tarea = tarea;
        this.automated = automated;
    }
    public double costCalculation()
    {
        LOGGER.info("Inside costCalculation method");
        double costperSqFt = 0;
        if(mstandard.equalsIgnoreCase("standard"))
            costperSqFt = 1500;
        else if(mstandard.equalsIgnoreCase("above standard"))
            costperSqFt = 1700;
        else if(mstandard.equalsIgnoreCase("high standard"))
        {
            costperSqFt = 2000;
            if(automated.equals("yes"))
                costperSqFt = 3500;
        }
        double total = costperSqFt*tarea;
        return total;
    }
}


