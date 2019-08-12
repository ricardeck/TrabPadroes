package negocio;

public class PizzaBasica implements Pizza{

	@Override
	public void montar() {
		System.out.println("Farinha, Molho de tomate e mussarela");
	}

}
