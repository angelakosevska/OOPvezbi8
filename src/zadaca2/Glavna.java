package zadaca2;

import java.util.*;

public class Glavna {

	public static void main(String[] args) {
		TreeMap <String, String> recnik = new TreeMap<String, String>();
		recnik.put("Monday", "Ponedelnik");
		recnik.put("Hi", "Zdravo");
		recnik.put("Sunday", "Nedela");
		recnik.put("Orange", "Portokal");
		recnik.put("Night", "Nokj");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Za koj angliski zbor vi treba prevod? Vnesete: ");
		String zbor = sc.next();
		if (recnik.containsKey(zbor))
		{
			System.out.println(recnik.get(zbor));
		}
		else
		{
			System.out.println("Zborot ne postoi!");
		}
	}
	}


