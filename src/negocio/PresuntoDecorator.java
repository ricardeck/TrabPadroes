package negocio;

public class PresuntoDecorator extends PizzaDecorator{
	
//	public PresuntoDecorator(Pizza pizza) {
//		super.setPizza(pizza);
//	}
	
	@Override
	public void montar(){
	    super.montar();
	    System.out.println("Adicionando sabor presunto");
	}
	
}
