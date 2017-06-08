


import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.RequestProcessor;

public class ArvoreFinal {

	public static void main(String[] args) {
		Sintaxe root;
        Sintaxe node;
        Sintaxe exp1 = Sintaxe.createRoot("/");
        Sintaxe exp2 = Sintaxe.createRoot("*");
        exp1.leftNode = Sintaxe.createRoot("*");
        root = exp1.leftNode;
        root.leftNode = Sintaxe.createRoot("+");
        root.rightNode = Sintaxe.createRoot("4");
        node = root.rightNode;
        root = root.leftNode;
        root.leftNode = Sintaxe.createRoot("4");
        root.rightNode = Sintaxe.createRoot("3");
        node = root.rightNode;
        root = root.leftNode;
        exp1.rightNode = Sintaxe.createRoot("*");
        node = exp1.rightNode;
        node.leftNode = Sintaxe.createRoot("2");
        node.rightNode = Sintaxe.createRoot("3");
        System.out.println(orderRead(exp1));
        System.out.println(preOrderRead(exp1));
        System.out.println(posOrderRead(exp1));
        exp2.leftNode = Sintaxe.createRoot("+");
        root = exp2.leftNode;
        root.leftNode = Sintaxe.createRoot("8");
        root.rightNode = Sintaxe.createRoot("2");
        exp2.rightNode = Sintaxe.createRoot("/");
        root = exp2.rightNode;
        root.leftNode = Sintaxe.createRoot("8");
        root.rightNode = Sintaxe.createRoot("4");
        System.out.println(orderRead(exp2));
        System.out.println(preOrderRead(exp2));
        System.out.println(posOrderRead(exp2));
        
    }

    private static String orderRead(Sintaxe root) {
        String leitura = "";
        if (root != null) {
            leitura += orderRead(root.leftNode);
            leitura += root.value;
            leitura += orderRead(root.rightNode);
        }
        return leitura;
    }

    private static String preOrderRead(Sintaxe root) {
        String leitura = "";
        if (root != null) {
            leitura += root.value;
            leitura += preOrderRead(root.leftNode);            
            leitura += preOrderRead(root.rightNode);
        }
        return leitura;
    }

    private static String posOrderRead(Sintaxe root) {
        String leitura = "";
        if (root != null) {
            leitura += posOrderRead(root.leftNode);
            leitura += posOrderRead(root.rightNode);
            leitura += root.value;            
        }
        return leitura;
    }
		
	

}
