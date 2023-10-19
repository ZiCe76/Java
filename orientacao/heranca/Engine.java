package heranca;
public class Engine {

    boolean start = false;
    double fuelInjector = 1;
    int rpm() {
        if(!start) {
            return 0;
        } else {
        return (int) Math.round(fuelInjector * 3000);
    }
  }

}
