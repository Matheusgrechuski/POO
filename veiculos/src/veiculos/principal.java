package veiculos;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        veiculo carro = new veiculo() {
            @Override
            public void mover() {
                System.out.println("O carro está se movendo rapidamente na estrada.");
            }
        };

        
        veiculo bicicleta = new veiculo() {
            @Override
            public void mover() {
                System.out.println("A bicicleta está sendo pedalada no parque.");
            }
        };

        
        veiculo caminhão = new veiculo() {
            @Override
            public void mover() {
                System.out.println("O caminhão está transportando carga pesada.");
            }
        };

       
        carro.mover();
        bicicleta.mover();
        caminhão.mover();

       
        veiculo moto = new veiculo() {
            @Override
            public void mover() {
                System.out.println("A moto está acelerando pela cidade.");
            }
        };

        veiculo onibus = new veiculo() {
            @Override
            public void mover() {
                System.out.println("O ônibus está transportando passageiros.");
            }
        };


        moto.mover();
        onibus.mover();
    

	}

}
