package file_java.semester2.Polimorphisme.Lat1;

public class AeroPlan extends vehicle {

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("Aeroplan Flying");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
