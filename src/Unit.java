/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 8/14/13
 * Time: 7:25 AM
 * To change this template use File | Settings | File Templates.
 */
public enum Unit {
    FOOT(12, UnitType.MEASUREMENT), INCH(1, UnitType.MEASUREMENT), MILE(63360, UnitType.MEASUREMENT), YARD(36, UnitType.MEASUREMENT), TEASPOON(1, UnitType.VOLUME), TABLESPOON(3, UnitType.VOLUME), OUNCE(6, UnitType.VOLUME), CUP(28, UnitType.VOLUME);

    private final int conversionFactor;
    private UnitType type;


    Unit(int conversionFactor, UnitType type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }


    public int conversionFactor() {
        return this.conversionFactor;
    }

    public UnitType getType() {
        return type;
    }
}
