

public class polinomio {
	   monomio inicio = null;
	   // monomio pivote=null;
	    public void insertar(int coeficiente,int exponente){
	        monomio nuevo = new monomio();
	        nuevo.coeficiente = coeficiente;
	        nuevo.exponente = exponente;
	        
	        if(inicio != null){
	            nuevo.siguiente = inicio;
	        }
	        inicio = nuevo;
	    }
	     public void recorrer(){
	        
	        monomio aux = inicio;
	        
	        while(aux!=null){
	            System.out.print("  ");
	            if((aux.coeficiente == 1)||(aux.coeficiente == -1 )) {
	            	
	            }else {
	            System.out.print(aux.coeficiente);
	            }
	            if(aux.exponente == 1){
	                System.out.print("x");
	            }else if(aux.exponente >1){
	                System.out.print("x^"+ aux.exponente);
	            }
	            aux =  aux.siguiente;
	        }
	    }
	    public void simplificar(){
	    	int p=0;
	    	polinomio salvador= new polinomio();
	    	if(inicio!=null) {
	    	monomio aux = inicio;
	    	while (aux!=null) { //Busca el exponente mas alto
	    			if(p<aux.exponente) { 		
	    				p = aux.exponente;
	    			}
	             aux = aux.siguiente;
	         }
	    	 }
	    	if(inicio!=null) {	
	    	while(p!=-1) {
	    		monomio aux1=inicio;
	    		int aco=0;
	    		
	    		while(aux1!=null) {
	    			if(aux1.exponente==p) {
	    				aco=aco+aux1.coeficiente;
	    			}
	    			aux1=aux1.siguiente;
	    		}
	    		
	    		//System.out.println(p);
	    		monomio temp= new monomio();
	    		temp.exponente=p;
	    		//System.out.println(aco);
	    		temp.coeficiente=aco;
	    		if(temp.coeficiente!=0) {
	    		salvador.insertar(temp.coeficiente, temp.exponente);//salavador salva que se pierda algo cuando insertamos lo simplificado
	    		}
	    		p--;
	    	}
	    	}
	    	inicio=salvador.inicio;
	    }
	   
	 public polinomio suma(polinomio x, polinomio y) {
		 monomio a = x.inicio;
		 monomio a1= y.inicio;
		 polinomio nuevo = new polinomio();
		 while(a!=null) {
			 nuevo.insertar(a.coeficiente,a.exponente);
			 a=a.siguiente;
		 }
		 while(a1!=null) {
			 nuevo.insertar(a1.coeficiente, a1.exponente);
			 a1=a1.siguiente;
		 }
		 nuevo.simplificar();
		 return nuevo;
	 }
	   
	 public polinomio restar(polinomio minuendo, polinomio substraendo) {
		 monomio a= minuendo.inicio;
		 monomio b= substraendo.inicio;
		 polinomio nuevo = new polinomio();
		 while(a!=null) {
			 nuevo.insertar(a.coeficiente, a.exponente);
			 a=a.siguiente;
		 }
		 while(b!=null) {
			 nuevo.insertar((-1*b.coeficiente), b.exponente);
			 b=b.siguiente;
		 }
		 nuevo.simplificar();
		 return nuevo;
	 }
	 public polinomio mux(polinomio multiplo1,polinomio multiplo2) {
		 polinomio nuevo=new polinomio();
		 monomio a=multiplo1.inicio;
		 monomio b=multiplo2.inicio;
		 while(a!=null) {
			 int coeficiente=0,exponente=0;
			 b=multiplo2.inicio;
			 while(b!=null) {
				 coeficiente=a.coeficiente*b.coeficiente;
				 exponente=a.exponente+b.exponente;
				 
				 nuevo.insertar(coeficiente, exponente);
				 
				 b=b.siguiente;
				 
			 }
			 a=a.siguiente;
		 }
		 nuevo.simplificar();
		 return nuevo;
	 }
}

