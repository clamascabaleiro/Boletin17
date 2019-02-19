package boletin17_1;

/**
 *
 * @author clamascabaleiro
 */
public class Papagaio extends Ave implements IPodeVoar {

    @Override
    public void voar() {
        System.out.println("Vuelo bien");
    }

}
