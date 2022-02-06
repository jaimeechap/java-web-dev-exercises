package exercises.technology;

public class Computer extends AbstractEntity{

    public Computer() {
        super();
        this.ram = ram;
        this.storage = storage;
        this.manufacturer = manufacturer;
    }

    private int ram;
    private int storage;
    private String manufacturer = "Pineapple";

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public void addRam(int ramToAdd){
        setRam(ramToAdd);
    }
}
