import java.util.Scanner; // importamos la libreria 

public class Codigo5 {
	public static void main(String[] args) { // se agrega public static void main para poder ejec
	    Scanner s = new Scanner(System.in); // Se agrega System.in
	    System.out.print("Introduzca un número:"); // se  corrigue la comilla 
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni); //pasamos el valor a numero entero ya que era String y no lo pasaba
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) { // sustituimos ni por C ya que se almacene en una nueva variable
		  int digito = c % 10; // se puede hacer directo ya no es necesario pasar de nuevoa entero
	      if (digito == 3 || digito == 7 || digito == 8 || (digito == 9)) { //quite parentesis puedo dejarlos como en el digito == 9
			afo++;
	      } else {
			noAfo++;
	      }//faltaba una llave para cerrar 
		  c /= 10; // ni se sustituye por c
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado."); //faltaba la t en println
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}