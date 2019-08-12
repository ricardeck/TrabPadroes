package app;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;

import negocio.AzeitonaDecorator;
import negocio.FrangoDecorator;
import negocio.Pizza;
import negocio.PizzaBasica;
import negocio.PizzaDecorator;
import negocio.PresuntoDecorator;

public class App {

//	public static void main(String[] args) {
//		Pizza pizzaCompleta = new FrangoDecorator(new AzeitonaDecorator(new PizzaBasica()));
//		pizzaCompleta.montar();
//	}

	public static void imp(DefaultListModel<?> model)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		File currentDir = new File("./src/plugins");
		String[] plugins = currentDir.list();
		int i;
		URL[] jars = new URL[plugins.length];
		for (i = 0; i < plugins.length; i++)
			try {
				jars[i] = (new File("./plugins/" + plugins[i])).toURL();
			} catch (MalformedURLException ex) {
				Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
			}
		URLClassLoader ulc = new URLClassLoader(jars);
		Pizza pizza = new PizzaBasica();
		PizzaDecorator pizzaDecorator = null;
		PizzaDecorator pizzaDecorator2 =null;
		for (i = 0; i < model.size(); i++) {
			pizzaDecorator2 = pizzaDecorator;
			pizzaDecorator = (PizzaDecorator) Class.forName("negocio" + "." + model.get(i) + "Decorator", true, ulc).newInstance();
			if (i == 0) {
				pizzaDecorator.setPizza(pizza);
			}else
				pizzaDecorator.setPizza(pizzaDecorator2);
		}
		pizzaDecorator.montar();

	}
}
