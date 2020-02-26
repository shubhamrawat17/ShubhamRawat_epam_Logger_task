package InterestCalculator;

abstract public class InterestInfo {
    double p;
    float r;
    float t;
    protected InterestInfo(double p,float r,float t)
    {
        this.p = p;
        this.r = r;
        this.t = t;
    }
    abstract double CalculateInterest();
}
