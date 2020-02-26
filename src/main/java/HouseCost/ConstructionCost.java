package HouseCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Scanner;

public class ConstructionCost {
    private static final Logger LOGGER = LogManager.getLogger(ConstructionCost.class);
    static
    {
        LOGGER.info("Input the data from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quality i.e material standard,above standard or high standard ");
        String mstandard = sc.nextLine();
        System.out.println("Enter total area of the house");
        double tarea = sc.nextDouble();
        String automated = "no";
        if(mstandard=="high standard") {
            System.out.println("Type yes if fully automated house containing high standard material else no");
            automated = "yes";
        }
        LOGGER.info("Creating cost calculate constructor");
        CalculateCost cost = new CalculateCost(mstandard, tarea, automated);
        LOGGER.info("Calling cost Calculate method");
        double total = cost.costCalculation();
        System.out.println("The total cost of the house is "+total);
    }

}
