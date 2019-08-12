package negocio;

public class AzeitonaDecorator extends PizzaDecorator{
	
//	public AzeitonaDecorator(Pizza pizza){
//	    super.setPizza(pizza);
//	  }
	
	@Override
	  public void montar(){
	    super.montar();
	    System.out.println("Adicionando sabor azeitona");
	  }
	
}