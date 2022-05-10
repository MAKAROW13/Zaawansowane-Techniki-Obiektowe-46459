package devices;

public abstract class Car extends Device {

    protected String Model;
    public final String Marka;
    final String Producer;
    protected String Color;
    public Double Value;

    public String getProducer() {
        return Producer;
    }

    public Car(String marka, String producer) {
        Marka = marka;
        Producer = producer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Marka='" + Marka + '\'' +
                ", Producer='" + Producer + '\'' +
                ", Color='" + Color + '\'' +
                ", Value=" + Value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Auto ma opcję włącz");
    }
    protected abstract void refuel();
}
