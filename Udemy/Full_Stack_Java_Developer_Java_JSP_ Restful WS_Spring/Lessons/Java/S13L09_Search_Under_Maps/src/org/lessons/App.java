package org.lessons;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code> {

	private String sectionNo;
	private String lectureNo;

	public Code(String sectionNo, String lectureNo) {
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	public void setLectureNo(String lectureNo) {
		this.lectureNo = lectureNo;
	}

	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo() + o.getLectureNo();
		return code1.compareTo(code2);

	}

}

public class App {
	public static void main(String[] args) {

		System.out.println("HashMap");
		Map<Integer, String> lecturesHashMap = new HashMap<>();
		lecturesHashMap.put(3, "Generics");
		lecturesHashMap.put(1, "Files Under Java");
		lecturesHashMap.put(2, "Network Programming");
		lecturesHashMap.put(7, "OOPS");
		lecturesHashMap.put(5, "Methods");
		lecturesHashMap.put(2, "Expressions");
		for (Map.Entry<Integer, String> entry : lecturesHashMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		System.out.println("************************************************************");

		System.out.println("TreeMap");
		Map<Integer, String> lectures = new TreeMap<>();
		lectures.put(3, "Generics");
		lectures.put(1, "Files Under Java");
		lectures.put(2, "Network Programming");
		lectures.put(7, "OOPS");
		lectures.put(5, "Methods");
		lectures.put(2, "Expressions");
		for (Map.Entry<Integer, String> entry : lectures.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		System.out.println("************************************************************");

		System.out.println("Custom Object HashMap ");
		Map<Code, String> lecturesCustomHash = new HashMap<>();
		lecturesCustomHash.put(new Code("S01", "L03"), "Generics");
		lecturesCustomHash.put(new Code("S01", "L01"), "Files Under Java");
		lecturesCustomHash.put(new Code("S02", "L03"), "Network Programming");
		lecturesCustomHash.put(new Code("S01", "L07"), "OOPS");
		lecturesCustomHash.put(new Code("S01", "L05"), "Methods");
		lecturesCustomHash.put(new Code("S01", "L03"), "Expressions");
		for (Map.Entry<Code, String> entry : lecturesCustomHash.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		System.out.println("************************************************************");

		System.out.println("Custom Object TreeMap");
		Map<Code, String> lecturesCustom = new TreeMap<>();
		lecturesCustom.put(new Code("S01", "L03"), "Generics");
		lecturesCustom.put(new Code("S01", "L01"), "Files Under Java");
		lecturesCustom.put(new Code("S02", "L03"), "Network Programming");
		lecturesCustom.put(new Code("S01", "L07"), "OOPS");
		lecturesCustom.put(new Code("S01", "L05"), "Methods");
		lecturesCustom.put(new Code("S01", "L03"), "Expressions");
		for (Map.Entry<Code, String> entry : lecturesCustom.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		System.out.println("************************************************************");
	}

}
