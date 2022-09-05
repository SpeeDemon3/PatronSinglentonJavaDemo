package ruiz;

public class Main {

    public static void main(String[] args) {



        Singleton superHeroe = Singleton.getInstance();

        Singleton superVillano = Singleton.getInstance();

        System.out.println("Tu amigo y vecino..." + superHeroe);
        System.out.println("Tu amigo y vecino..." + superVillano);

    }


}
