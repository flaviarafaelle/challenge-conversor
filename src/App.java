import java.io.ObjectInputStream.GetField;

import javax.swing.* ;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // escolha de conversor
        String[] options = {"Conversor de Moeda", "Conversor de Temperatura"};
    
        String input = (String)JOptionPane.showInputDialog(null, "Escolha uma opção", 
                "Menu", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        System.out.println(input);

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
        // System.out.println(valor);
        // validar entrada
    }               
}
