package fr.home.mikedev;

import fr.home.mikedev.aoc2024.Main12;

public class MainAoc 
{
	public static void main(String[] args) 
	{
		String year = args[0];
		MainAoc.log("##################################");
		MainAoc.log("####      Advent of Code      ####");
		MainAoc.log("##################################");
		MainAoc.log("####           " + year +"           ####");
		MainAoc.log("##################################");
		MainAoc.log("");
		/*Main01 m1 = new Main01("Historian Hysteria", "2024");
		m1.doPartAll();
		Main02 m2 = new Main02("Red-Nosed Reports", "2024");
		m2.doPartAll();
		Main03 m3 = new Main03("Mull It Over", "2024");
		m3.doPartAll();
		Main04 m4 = new Main04("Ceres Search", "2024");
		m4.doPartAll();
		Main05 m5 = new Main05("Print Queue", "2024");
		m5.doPartAll();
		Main06 m6 = new Main06("Guard Gallivant", "2024");
		m6.doPartAll();
		Main07 m7 = new Main07("Bridge Repair", "2024");
		m7.doPartAll();
		Main08 m8 = new Main08("Resonant Collinearity", "2024");
		m8.doPartAll();
		Main09 m9 = new Main09("Disk Fragmenter", "2024");
		m9.doPartAll();
		Main10 m10 = new Main10("Hoof It", "2024");
		m10.doPartAll();
		Main11 m11 = new Main11("Plutonian Pebbles", "2024");
		m11.doPartAll();*/
		Main12 m12 = new Main12("Garden Groups", "2024");
		m12.doPartAll();
		/*Main13 m13 = new Main13("", "2024");
		m13.doPartAll();
		Main14 m14 = new Main14("", "2024");
		m14.doPartAll();
		Main15 m15 = new Main15("", "2024");
		m15.doPartAll();
		Main16 m16 = new Main16("", "2024");
		m16.doPartAll();
		Main17 m17 = new Main17("", "2024");
		m17.doPartAll();
		Main18 m18 = new Main18("", "2024");
		m18.doPartAll();
		Main19 m19 = new Main19("", "2024");
		m19.doPartAll();
		Main20 m20 = new Main20("", "2024");
		m20.doPartAll();
		Main21 m21 = new Main21("", "2024");
		m21.doPartAll();
		Main22 m22 = new Main22("", "2024");
		m22.doPartAll();
		Main23 m23 = new Main23("", "2024");
		m23.doPartAll();
		Main24 m24 = new Main24("", "2024");
		m24.doPartAll();
		Main25 m25 = new Main25("", "2024");
		m25.doPartAll();*/
	}

	private static void log(String message)
	{
		System.out.println(message);
	}
}
