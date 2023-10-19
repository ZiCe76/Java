package heranca.desafio;

public class Engine {

    boolean start = false;
    double fuelInjector = 0.5;
    public int rpm() {
        if(!start) {
            return 0;
        } else {
        return (int) Math.round(fuelInjector * 3000);
    }
  }

}
