public class Bird implements Flyable, Singable {

    @Override
    public String fly() {
        return "Fly like bird";
    }

    public String walk() {
        return "walk like bird";
    }

    public String sing() {
        return "sing like bird";
    }

}
