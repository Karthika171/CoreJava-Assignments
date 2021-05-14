
import java.util.HashSet;
import java.util.LinkedHashSet;
public class DOB {

	public static void main(String[] args) {
		
		HashSet<String> n=new HashSet<>();
		n.add("pizza");
		n.add("burger");
		n.add("dosa");
		n.add("briyani");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		ln.add("pizza");
		ln.add("burger");
		ln.add("dosa");
		ln.add("briyani");		
		System.out.println("Orderd "+ln);
		
	}

}
