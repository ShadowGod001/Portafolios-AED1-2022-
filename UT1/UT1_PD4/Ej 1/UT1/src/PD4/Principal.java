package PD4;
import PD4.Dia;
import PD4.EnumTest;

public class Principal {

	public static void main(String[] args) {
		
		
        EnumTest firstDay = new EnumTest(Dia.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Dia.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Dia.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Dia.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Dia.SUNDAY);
        seventhDay.tellItLikeItIs();
        
        int aNumber = 3;
        if (aNumber >= 0)
        	if (aNumber == 0)
        	System.out.println("first string");
        	else System.out.println("second string");
        	System.out.println("third string");
    }

}
