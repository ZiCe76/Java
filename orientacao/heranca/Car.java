package heranca;
public class Car {
    // construct engine and dors
    Engine engine = new Engine();
    Door door = new Door();


    // create interactions
    void gas() {
        if(door.Open = true){
            System.out.println("CLOSE THE FUCKING DOOR");
        }
        else {
        if(engine.fuelInjector < 2.6) {
        engine.fuelInjector += 0.4;
        }
    }
    }

    void breaks() {
        if(engine.fuelInjector > 0.5){
        engine.fuelInjector -=0.4;
        }
    } 

    void Start() {
        engine.start = true;
    }

    void desligar() {
        engine.start = false;
    }

    void close() {
        door.Open = false;
    }

    void open() {
        door.Open = true;
    }

    boolean Started() {
        return engine.start;
    }
}
