package heranca.runs;

import heranca.desafio.F40;
import heranca.desafio.Silvia;

public class Run {
    public static void main(String[] args) {

        F40 F40 = new F40();
        System.out.println(F40.Started());

        F40.Start();
        System.out.println(F40.Started());

        System.out.println(F40.engine.rpm());

        Silvia Silvia = new Silvia();
        System.out.println(Silvia.Started());

        Silvia.Start();
        System.out.println(Silvia.Started());

        System.out.println(Silvia.engine.rpm());


       
        for( int i = 0; i<=10; i++) {
            F40.Gas();
            System.out.println("F40 Rpm: " + F40.engine.rpm());
            System.out.println("F40 Velocidade: " + F40.mph);
            System.out.println("F40 Gear: " + F40.gear);
            System.out.println("\n");
        }

        for( int i = 0; i<=10; i++) {
            Silvia.Gas();
            System.out.println("S15 Rpm: " + Silvia.engine.rpm());
            System.out.println("S15 Velocidade: " + Silvia.mph);
            System.out.println("S15 Gear: " + Silvia.gear);
            System.out.println("\n");
        }


        for(int j=0; j<6; j++) {
            F40.Break();
            System.out.println("Rpm: " + F40.engine.rpm());
            System.out.println("Velocidade: " + F40.mph);
            System.out.println("Gear: " + F40.gear);
            System.out.println("\n");
        }

        for(int j=0; j<6; j++) {
            Silvia.Break();
            System.out.println("Rpm: " + Silvia.engine.rpm());
            System.out.println("Velocidade: " + Silvia.mph);
            System.out.println("Gear: " + Silvia.gear);
            System.out.println("\n");
        }

    }
    
}
