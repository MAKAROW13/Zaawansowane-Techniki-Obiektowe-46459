package devices;

import java.util.Date;
import com.company.Human;
import com.company.Sellable;

public abstract class Device implements Sellable{

    public String model;
    public String marka;
    final String producer;
    public Date date;

    protected Device(String name, String make, double value, double money) {
        this.producer= "Producent";
    }

    @Override
    public String toString() {
        return "Device{" +
                "Model='" + model + '\'' +
                ", Marka='" + this.marka + '\'' +
                ", Producent='" + this.producer + '\'' +
                ", Data=" + this.date +
                '}';
    }

    public abstract void turnOn();

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        return true;
    }
}
