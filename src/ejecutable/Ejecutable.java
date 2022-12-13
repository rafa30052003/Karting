package ejecutable;
import Controller.*;
import model.DAO.Circuito;
public class Ejecutable {

	public static void main(String[] args) {
		Circuito c = new Circuito("Jarama");
		ClienteController.switchPrincipal(c);
	}

}
