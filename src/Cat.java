public class Cat extends Animal {
    public Cat() {
        super();
    }
    public String getPet() {
        String info = "Here is the information about your cat... " + "\n";
        info += "Name: " + getName() + "\n";
        info += "Description: " + getDescription() + "\n";
        info += "Type: " + getType() + "\n";
        return info;
    }
}
