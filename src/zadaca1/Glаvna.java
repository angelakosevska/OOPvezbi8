package zadaca1;
import java.util.TreeMap;
public class Glаvna {

	public static void main(String[] args) {
		TreeMap <String, String> recnik = new TreeMap<String, String>();
		recnik.put("Monday", "Ponedelnik");
		//recnik.put("Hi", "Zdravo");
		recnik.put("Sunday", "Nedela");
		recnik.put("Orange", "Portokal");
		recnik.put("Night", "Nokj");
		
		System.out.println(recnik.keySet()); //klucevi
		System.out.println(recnik.values()); //vrednosti
		System.out.println(recnik); //klucevi i soodvetni vrednosti
		if (recnik.containsKey("Hi"))
		{
			System.out.println(recnik.get("Hi"));
		}
		else 
		{
			System.out.println("Zborot ne postoi!");
		}
	}

}
