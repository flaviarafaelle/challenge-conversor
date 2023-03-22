import javax.swing.*;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {

        // escolha de conversor
        String[] opcoes = {"Conversor de Moeda", "Conversor de Temperatura"};
    
        String inputMenu = (String)JOptionPane.showInputDialog(null, "Escolha uma opção", 
                "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        System.out.println(inputMenu);

        //moedas
        String[] moedas = {
            "Reais para Dólar",
			"Reais para Euro",
			"Reais para Libras Esterlinas",
			"Reais para Peso argentino",
			"Reais para Peso Chileno",
			"Dólar para Reais",
			"Euro para Reais",
			"Libras Esterlinas para Reais",
			"Peso argentino para  Reais",
			"Peso Chileno para Reais"
        };

        String inputMoedas = (String)JOptionPane.showInputDialog(null, "Escolha uma opção", 
                "Menu", JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[0]);
        System.out.println(inputMoedas);

        // valor a ser recebido
        String valor = JOptionPane.showInputDialog("Insira um valor:");
		Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
		Matcher m = p.matcher(valor);
		if (m.find()) {
	     JOptionPane.showMessageDialog(null, "Por favor, digite apenas números");
		}
        System.out.println(valor);

    }               
}