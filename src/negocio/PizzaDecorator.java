package negocio;

public class PizzaDecorator implements Pizza{

	public Pizza pizza;
	
	
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void montar() {
		this.pizza.montar();
	}

}
