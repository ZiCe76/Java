package heranca.desafio;

public class Car {
    
     // construct engine, Velocity and Gear 
     public Engine engine = new Engine();
     public int mph = 0;
     public int gear = 0;
     int delta;
     // create interactions
      void Gas() {
         if(engine.fuelInjector == 3.0 && gear < 7) {
            gear++;
            engine.fuelInjector = 0.5;
            mph += 5;
            
         } else {
            engine.fuelInjector += 0.5;
            mph += 5;
         }
         
     }
 
      public void Break() {
         if(engine.fuelInjector <= 1.5 && gear > 1){
         
         gear--;
         mph -= 5;
         engine.fuelInjector = 2;
         }

         else if(engine.fuelInjector > 0.5 && mph > 10){
            
            engine.fuelInjector -= 0.5;
            mph -= 5;
            

         } else {
            engine.fuelInjector -= 0.5;
            mph -= 5;
         }
         
     } 
 
     public void Start() {
         engine.start = true;
         gear++;
     }
 
      void Stop() {
         engine.start = false;
         gear = 0;
     }
 
     public boolean Started() {
         return engine.start;
     }
}
