import java.util.Random;

public class Jar {

    private String itemName;
    private int capacity;
    private int itemCount;

    public Jar(String itemName, int capacity) {
        this.itemName = itemName;
        this.capacity = capacity;
    }

    public void fill() {
        Random random = new Random();
        itemCount = random.nextInt(capacity) + 1;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
