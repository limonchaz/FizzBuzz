package chanchi.ninja.novice;


public class FizzBuzz {
	
	/**
	 * Devuelve la palabra "Fizz" si el parametro es multiplo de 3 y, a su vez, los múltiplos de 5 por "Buzz",
	 * los que al mismo tiempo son múltiplos de 3 y 5, utiliza el combinado "FizzBuzz", en caso de que no sea 
	 * multiplo de los anteriores devuelve el valor del parametro.
	 * @param numero el numero a evaluar.
	 * @return la cadena Fizz si el parametro es mutiplo de 3, Buzz si el parametro es mutiplo de 5, 
	 * FizzBuzz si el parametro es multiplo de 3 y 5 o el numero en caso de que ninguno  
	 * */
    public String isFizzBuzz( int numero ) {
    	StringBuilder str = new StringBuilder();
    	
    	if (isFizz(numero) && isBuzz(numero)) {
    		str.append("FizzBuzz");
    	} else if (isFizz(numero)) {
    		str.append("Fizz");
    	} else if (isBuzz(numero)){
    		str.append("Buzz");
    	} else {
    		str.append(numero);
    	}
    	
        return str.toString();
    }
    
    /**
     * Evalua si el numero es multiplo de 3.
     * @param n el numero a evaluar.
     * @return True en caso de que el numero sea multiplo de 3 false en caso contrario. 
     * */
    private boolean isFizz(int n) {
    	return ((n % 3) == 0);
    }
    
    /**
     * Evalua si el numero es multiplo de 5.
     * @param n el numero a evaluar.
     * @return True en caso de que el numero sea multiplo de 5 false en caso contrario. 
     * */
    private boolean isBuzz(int n) {
    	return ((n % 5) == 0);
    }
}
