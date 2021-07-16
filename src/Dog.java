public class Dog extends Animal {
    public Dog() {
        super();
    }
    public String getPet(){
        String info = "Here is the information about your dog ..." + "\n";
        info += "name: " + this.getName() + "\n";
        info += "description: " + getDescription() + "\n";
        info += "type: " + getType() + "\n";
        return info;
    }

}
