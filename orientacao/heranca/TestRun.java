package heranca;
public class TestRun {
    
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.Started());

        c1.Start();
        System.out.println(c1.Started());

        System.out.println(c1.engine.rpm());

        //c1.close();

        c1.gas();
        c1.gas();
        c1.gas();

        System.out.println(c1.engine.rpm());

        c1.breaks();
        c1.breaks();
        c1.breaks();
        c1.breaks();
        c1.breaks();
        c1.breaks();
        c1.breaks();

        // faltou encapsular
        // se um usuario por c1.engine.fuelInjector = -30; quebraria o codigo

        System.out.println(c1.engine.rpm());
    }
}
