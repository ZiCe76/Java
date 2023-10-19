package heranca.desafio;

public class F40 extends Car implements Esportivo, Luxo {

    public boolean Ar;

    public void Gas() {
        if(engine.fuelInjector == 3.0 && gear < 7) {
           gear++;
           engine.fuelInjector = 0.5;
           delta = 10;
           mph += delta;
           
        } else {
           engine.fuelInjector += 0.5;
           mph += delta;
        }
        
    }
    public void nitroON (){
        delta = 25;
    }

    public void nitroOFF() {
        delta = 10;
    }
    public void ligarAr() {
        Ar = true;
    }
    
    
}
