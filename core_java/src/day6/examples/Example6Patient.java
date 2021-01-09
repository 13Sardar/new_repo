package day6.examples;
import java.util.*;

import day6.beans.Patient;

public class Example6Patient {
	public static void main(String[] args) {
		Patient patient1 = new Patient(21,"qqq","aaa");
		Patient patient2 = new Patient(63,"www","sss");
		Patient patient3 = new Patient(287,"eee","ddd");
		
		Map<Integer, Patient> patientDetails = new HashMap<Integer, Patient>();
		patientDetails.put(20, patient1);
		patientDetails.put(10, patient2);
		patientDetails.put(60, patient3);
		
		Set<Integer> keySet= patientDetails.keySet();
		System.out.println("-------------------------For-Each------------------------");
		for(int n : keySet) {
			Patient p = patientDetails.get(n);
			System.out.println(n+"    "+p); 
			
		}
		
		System.out.println("-------------------------Iterator------------------------");
		Iterator<Integer>iter = keySet.iterator();
		while (iter.hasNext()) {
			int x = iter.next();
			Patient p = patientDetails.get(x);
            System.out.println(x+"    "+p); 
		}
		
	}

}
