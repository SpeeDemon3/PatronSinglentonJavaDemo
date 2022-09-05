package ruiz;

public class Singleton {

    private static Singleton singleton;

    String superheroe;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(String superheroe) {
        this.superheroe = superheroe;
    }

}
