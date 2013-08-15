public class Measurement {
    private final int value;
    private final Unit unit;

    public Measurement(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public int getBaseUnits()
    {
        return this.value * this.unit.conversionFactor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        if (this.getUnitType()!= that.getUnitType()) throw new RuntimeException("Incomparable types");

        if (this.getBaseUnits() != that.getBaseUnits()) return false;

        return true;

    }

    private UnitType getUnitType() {
        return unit.getType();
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}
