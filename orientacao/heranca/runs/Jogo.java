package heranca.runs;

import heranca.Heroi;
import heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi hero = new Heroi();
        hero.x = 10;
        hero.y = 11;

        System.out.println("Start Monstro HP = " + monstro.vida);
        System.out.println("Start Hero HP = " + hero.vida);

        monstro.atacar(hero);
        hero.atacar(monstro);

        System.out.println("Monstro HP = "+ monstro.vida);
        System.out.println("Hero HP = " + hero.vida);


    }
}
