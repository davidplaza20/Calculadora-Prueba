package co.com.supergiros.maven.test;

import org.junit.Test;

import co.com.supergiros.demo.Calcular;

public class CalculadoraTest {

	Calcular app;
	double a = 5;
	
	 @Test
	    public void suma()
	    {
	        app = new Calcular();
	        double suma = app.suma(a,3);
	        System.out.println("El resultado de la suma es "+suma);
	    }
	 

	 @Test
	    public void division()
	    {
	        app = new Calcular();
	        double division = app.division(a,0);
	        if(division==0) {
	        System.out.println("El resultado de la division es "+division +" "+"ya que es una division por 0");
	        }
	        else {
	        	System.out.println("El resultado de la division es "+division);
	        }
	    }


}
