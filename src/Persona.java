import java.util.Random;

public class Persona {
	Integer x1;
	Integer y1;
	Integer x2 = 145;
	Integer y2 = 145;
	Boolean esFisica;
	Boolean recibe;
	String info;
	
	Persona(Boolean esFisica, Boolean recibe, String info){	
		this.esFisica=esFisica;
		this.recibe=recibe;
		this.info=info;
		
		//Recibe 200-600
		//Envia 800-1200
		//100-600
		Random r = new Random();
		/*Random r = new Random();
		int Low = 10;
		int High = 100;
		int Result = r.nextInt(High-Low) + Low;*/
		
		if(recibe) {
			x1 = r.nextInt(600-200) + 200;
		} else
		{
			x1 = r.nextInt(1200-800) + 800;
		}
			y1 = r.nextInt(500-100) + 100;
		
	}
	
}
