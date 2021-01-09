package day6.examples;
import java.util.*;
import day6.beans.HospitalBean;

public class Example1HospitalBean {
	
	public static void main(String[] args) {
		
		HospitalBean hospitalbean1=new HospitalBean(1,"AAA",900);
		HospitalBean hospitalbean2=new HospitalBean(23,"CCC",6000);
		HospitalBean hospitalbean3=new HospitalBean(45,"BBB",1000);
		
		ArrayList<HospitalBean> opDrDetails=new ArrayList<HospitalBean>();
		
		opDrDetails.add(hospitalbean1);
		opDrDetails.add(hospitalbean2);
		opDrDetails.add(hospitalbean3);
		
		
		for(int i=0;i<opDrDetails.size();i++) {
			HospitalBean j = opDrDetails.get(i);
			System.out.println(j);
		}

		
	}

}
