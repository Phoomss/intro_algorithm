public class Cat extends Animal {
    public String Sleep() {
        return "Sleep like cat";
    }

    public String AdvanceSleep() {
        return this.Sleep() + " " + super.Sleep();
    }

}
