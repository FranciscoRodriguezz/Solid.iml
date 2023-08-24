package COMPARENDOGRUPO2;

class TipoVehiculo {
    private int lowerLimit;
    private int intermediateLowerLimit;
    private int upperLimit;

    public TipoVehiculo(int lowerLimit, int intermediateLowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.intermediateLowerLimit = intermediateLowerLimit;
        this.upperLimit = upperLimit;
    }

    public int getComparendo(int velocidad) {
        if (velocidad <= lowerLimit) {
            return 0;
        } else if (velocidad >= intermediateLowerLimit && velocidad <= upperLimit) {
            return 1;
        }
        return 2;
    }
}
