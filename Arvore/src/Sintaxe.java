

public class Sintaxe {

	String value;
    Sintaxe leftNode;
    Sintaxe rightNode;
	
    public static Sintaxe createRoot(String value) {
		
		Sintaxe root = new Sintaxe();
	    root.value = value;
	    return root;
		
	}

}
