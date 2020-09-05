
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*NOTASSSSSSS
			IMPORTANTE, SI RESTARAS POLINOMIOS PRIMERO VA EL MINUENDO Y DESPUES EL SUBSTRAENDO*/
		 	polinomio a = new polinomio();
	        polinomio b = new polinomio();
	        polinomio op = new polinomio();
	        System.out.println("polinomio 1");
	        a.insertar(-12, 2);
	        a.insertar(-5, 1);
	        a.insertar(2, 1);
	        a.insertar(-1, 2);
	        a.insertar(-5, 2);
	        a.recorrer();
	        System.out.println(" ");
	        System.out.println("polinomio 1 simplificado");
	        a.simplificar();
	        a.recorrer();
	        
	        System.out.println(" ");
	        System.out.println("polinomio 2");
	        b.insertar(2,4);
	        b.insertar(3,2);
	        b.insertar(6,4);
	        b.recorrer();
	        System.out.println(" ");
	        System.out.println("polinomio 2 simplificado");
	        b.simplificar();
	        b.recorrer();
	        
	        
	        polinomio suma = op.suma(a, b);
	        System.out.println(" ");
	        System.out.println("Operacion suma");
	        suma.recorrer();
	        
	       
	        polinomio resta = op.restar(a, b);
	        System.out.println(" ");
	        System.out.println("Operacion resta");
	        resta.recorrer();
	        
	        
	        polinomio multi = op.mux(a, b);
	        System.out.println(" ");
	        System.out.println("Operacion multiplicar");
	        multi.recorrer();
	       
	}

}
