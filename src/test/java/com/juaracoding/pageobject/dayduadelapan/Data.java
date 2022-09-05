package com.juaracoding.pageobject.dayduadelapan;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> firstData = new ArrayList<String>();
		List<String> secondData = new ArrayList<String>();
		List<String> thirdData = new ArrayList<String>();


		String H1 = ":T1:202112SOAL3";
		String H2 = ":T1:202111SOAL3";
		String H3 = ":T1:202110SOAL3";

		String Tag = ":T2:";

		String T1 = "SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";
		String T2 = "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";
		String T3 = "SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT";

		firstData.add(T1.substring(0, 17));
		firstData.add(T1.substring(18, 35));
		firstData.add(T1.substring(36, 53));
		firstData.add(T1.substring(54, 71));
		firstData.add(T1.substring(72));

		secondData.add(T2.substring(0, 17));
		secondData.add(T2.substring(18, 35));
		secondData.add(T2.substring(36, 53));
		secondData.add(T2.substring(54, 71));
		secondData.add(T2.substring(72));

		thirdData.add(T3.substring(0, 17));

		thirdData.add(T3.substring(18, 35));
		thirdData.add(T3.substring(36, 53));
		thirdData.add(T3.substring(54, 71));
		thirdData.add(T3.substring(72));

		String new_datasatu = firstData.get(2) + firstData.get(3) + firstData.get(4) + firstData.get(0) + firstData.get(1);

		String new_datadua = secondData.get(2) + secondData.get(3) + secondData.get(4) + secondData.get(0) + secondData.get(1);

		String new_datatiga = secondData.get(2) + secondData.get(3) + secondData.get(4) + secondData.get(0) + secondData.get(1);

		System.out.println(H1);
		System.out.println(Tag + new_datasatu);

		System.out.println(H2);
		System.out.println(Tag + new_datadua);

		System.out.println(H3);
		System.out.println(Tag + new_datatiga);

	}

}
