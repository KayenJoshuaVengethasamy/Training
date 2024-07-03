package org.lessons;

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
		Map<Code, String> lectures = new TreeMap<>();
		lectures.put(new Code("S01", "L03"), "Generics");
		lectures.put(new Code("S01", "L01"), "Files Under Java");
		lectures.put(new Code("S02", "L03"), "Network Programming");
		lectures.put(new Code("S01", "L07"), "OOPS");
		lectures.put(new Code("S01", "L05"), "Methods");
		lectures.put(new Code("S01", "L03"), "Expressions");
//		for (Map.Entry<Code, String> entry : lecturesCustom.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
//		}
//		this will crash as it is not available in the created map
//		System.out.println(lectures.get(1));
//		This will find the entry if we know the key value
		System.out.println(lectures.get(new Code("S01", "L05")));

//		This will find the entry if we do not know the key value but the actual value only
//		creating an object/reference
		Code code = null;
		for (Map.Entry<Code, String> entry : lectures.entrySet()) {
			if (entry.getValue().equals("OOPS")) {
				code = entry.getKey();
			}
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		System.out.println("The key for value \"OOPS\" " + code);
	}

}
