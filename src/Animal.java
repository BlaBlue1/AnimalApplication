import javax.naming.Name;
import java.util.Scanner;

public abstract class Animal {

    private String name, type, description, isInStock;
    private float price;

    Scanner keyboard = new Scanner(System.in);

    //default constructor
    public Animal() {
    }
    public Animal(String name, String type, String description, String isInStock, float price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.isInStock = isInStock;
        this.price = price;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }
    public String getIsInStock() {
        return this.isInStock;
    }
    public void setPrice(float Price) {
        this.price = price;
    }

    abstract String getPet();




}
