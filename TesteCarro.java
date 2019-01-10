
package testecarro;

 
public class TesteCarro {
	
//MODIFICADOR DE ACESSO DO METODO
    public static void main(String[] args) {
    		Carro c1;	
        c1 = new Carro();
		Carro c2 = new Carro();
		
//DECLARAÇÃO DE VARIAVEIS
		c1.Cor = "azul";
		c2.Cor = "prata";
		c1.modelo = "Passat";
		c2.modelo = "Maverick";
		c1.motor = "2.0";
		c2.motor = "V8";
//ATRIBUINDO METODOS		
		c1.acelerar();
		c2.mudarMarcha();
		c1.brecar();
		c2.brecar();
		c2.desligar();
		
	    //IMPRESSÃO DOS DADOS
		c1.imprimirDados();
		c2.imprimirDados();
			
	}
}
   
    

