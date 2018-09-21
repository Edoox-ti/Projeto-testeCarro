
package testecarro;

 
public class TesteCarro {

    
    public static void main(String[] args) {
    		Carro c1;	
        c1 = new Carro();
		Carro c2 = new Carro();
		

		c1.Cor = "azul";
		c2.Cor = "prata";
		c1.modelo = "Passat";
		c2.modelo = "Maverick";
		c1.motor = "2.0";
		c2.motor = "V8";
		
		c1.acelerar();
		c2.mudarMarcha();
		c1.brecar();
		c2.brecar();
		c2.desligar();
		
		c1.imprimirDados();
		c2.imprimirDados();
			
	}
}
   
    

