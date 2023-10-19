package heranca.desafio;

public class Silvia extends Car {
    
    public void Gas() {
        if(engine.fuelInjector == 3.0 && gear < 7) {
           gear++;
           engine.fuelInjector = 0.5;
           mph += 8;
           
        } else {
           engine.fuelInjector += 0.5;
           mph += 8;
        }
        
    }
    
}
