public abstract class HeatManager {

    protected int power;
    protected int temperature;


    public HeatManager(int power, int temperature, String color, Person person) {
        this.power = power;
        this.temperature = temperature;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int maxTemperature) {
        this.temperature = maxTemperature;
    }

}

