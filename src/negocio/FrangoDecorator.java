package negocio;

public class FrangoDecorator extends PizzaDecorator{
	
//	public FrangoDecorator(Pizza pizza){
//		super.setPizza(pizza);
//	  }
//	
	@Override
	  public void montar(){
	    super.montar();
	    System.out.println("Adicionando sabor frango");
	  }
	
}
