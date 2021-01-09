package day6.examples;

import java.util.*;

import day6.beans.PersonalInfo;

public class Example2PersonalInfo {
	
	public static void main(String[] args) {
		
		PersonalInfo personalInfo1 = new PersonalInfo("aaa","Um");
		PersonalInfo personalInfo2 = new PersonalInfo("bbb","Um");
		PersonalInfo personalInfo3 = new PersonalInfo("ccc","m");
		PersonalInfo personalInfo4 = new PersonalInfo("ddd","M");
		
		ArrayList<PersonalInfo> pDetails = new ArrayList<PersonalInfo> ();
		
		pDetails.add(personalInfo1);
		pDetails.add(personalInfo2);
		pDetails.add(personalInfo3);
		pDetails.add(personalInfo4);
		
		for(PersonalInfo c:pDetails) {
			System.out.println(c);
		}
		
	}

}
