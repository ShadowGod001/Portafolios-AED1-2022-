package PD4;
import PD4.Vocal;

public class EnumVocal {
    Vocal vocal;
    
    public EnumVocal(Vocal vocal) {
        this.vocal = vocal;
    }
    
    public void contarVocales() {
        switch (vocal) {
            case a: case e: case i: case o: case u:
                System.out.println("Vocal ");
                break;
                        
            default:
                System.out.println("Constante");
                break;
        }
    }
    
    
}