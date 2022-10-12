package org.lessons;

import java.util.Map;
import java.util.Objects;
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

	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
	

}

public class App {
	public static void main(String[] args) {
		Map<Code, String> lectures = new TreeMap<>();
		lectures.put(new Code("S01", "L03"), "Generics");
		lectures.put(new Code("S01", "L01"), "Files Under Java");
		lectures.put(new Code("S02", "L03"), "Network Programming");
		lectures.put(new Code("S01", "L07"), "OOPS");
		lectures.put(new Code("S01", "L05"), "Methods");
		lectures.put(new Code("S01", "L03"), "Expressions");
		for (Map.Entry<Code, String> entry : lectures.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
//		String name1 = new String("Kayen");
//		String name2 = new String("Kayen");
//		hashCode() is available to every object, which produces a unique HashCode for the object
//		This will show some inconsitent behaviour. This is the reason why when we are dealing with object comparison, it is always a good idea to override the hashCode() method
//		System.out.println("name1 hash : " + name1.hashCode() + " name2 hash : " + name2.hashCode());
//		The reason for this being false despite it being the same information, case included, is because of HashCode
//		Whenever we try to compare two objects in the background, HashCode is being compared. Only if the HashCodes being compared are the same will == return true
//		to resolve this issue. we will use .equals and always use this when comparing strings. Never make use of ==
//		System.out.println(name1 == name2);
//		System.out.println(name1.equals(name2));
//		It will not work for custom objects as the hashCodes are different
//		It will work for string because String class already overrides the .equals method
//		To fix this, we need to override the hashCode and equals methods
		Code code1 = new Code("S01", "L03");
		Code code2 = new Code("S01", "L03");
		System.out.println("code1 HashCode : " + code1.hashCode() + " code2 HashCode : " + code2.hashCode());
		System.out.println(code1==(code2));

	}

}
