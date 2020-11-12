public class MobileDisplay implements Observer, DisplayElement {
    private float pressure;

    private Subject weatherData;

    public MobileDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Mobile Display - Pressure: " + pressure + "atm");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
