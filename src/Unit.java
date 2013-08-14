/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 8/14/13
 * Time: 7:25 AM
 * To change this template use File | Settings | File Templates.
 */
public enum Unit {
    FOOT(12), INCH(1), MILE(63360), YARD(36);

    private final int conversionFactor;

    Unit(int conversionFactor) {
        this.conversionFactor = conversionFactor;
    }


    public int conversion() {
        return this.conversionFactor;
    }
}
