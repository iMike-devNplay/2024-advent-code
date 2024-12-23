package fr.home.mikedev.aoc2024;

import fr.home.mikedev.common.MainDay;

public class Main17 extends MainDay 
{
	long initRegisterA;
	long registerA;
	long registerB;
	long registerC;
	
	int[] program;
	
	int pointer;
	boolean halt;
	String output;
	
	public Main17(String title, String year) {super(title, year, "17");}
	
	public void retrieveData(boolean test)
	{
		if (test)
		{
			registerA = Long.valueOf(initRegisterA);
			registerB = Long.valueOf(0);
			registerC = Long.valueOf(0);
			program = new int[]{0, 3, 5, 4, 3, 0};
		}
		else
		{
			// min =  35 184 372 088 832L
			// max = 278 999 999 999 999L
			registerA = Long.valueOf(278999999999999L);
			registerB = Long.valueOf(0);
			registerC = Long.valueOf(0);
			program = new int[]{2,4,1,2,7,5,4,5,1,3,5,5,0,3,3,0};
		}
	}
	
	public void doPart1()
	{
		retrieveData(false);
		pointer = 0;
		
		halt = false;
		output = "";
		
		while (!halt)
		{
			if (pointer > program.length-1 || pointer+1 > program.length-1) halt = true;
			else
			{
				execute(program[pointer], program[pointer+1]);
			}
		}
		
		log("2,4,1,2,7,5,4,5,1,3,5,5,0,3,3,0,".length());
		setResultPart1(output.length());
		//log(output);
	}
	
	public void doPart2()
	{                //37 221 270 076 916
		/*String wantedOutput = "2,4,1,2,7,5,4,5,1,3,5,5,0,3,3,0,";
		initRegisterA = 1000000000000L;
		String temp = "";
		while (initRegisterA < 1000000000000000L || temp.length() < wantedOutput.length())
		{
			doPart1();
			initRegisterA = initRegisterA+1000000000;
			if (!temp.equals(output)) log(initRegisterA + " => " + output + " " + temp.length() + " " + wantedOutput.length());
			temp = output;
		}*/
	}
	
	/* TODO : find a better way than brute force */
	public void doPart2BruteForce()
	{
		retrieveData(false);
		String wantedOutput = "2,4,1,2,7,5,4,5,1,3,5,5,0,3,3,0,"; // 16car
		//String wantedOutput = "0,3,5,4,3,0,";
		long wantedRegisterA = 37221200000000L;
		while (!wantedOutput.equals(output))
		{
			registerA = wantedRegisterA;
			registerB = 0;
			registerC = 0;
			halt = false;
			output = "";
			pointer = 0;
			while (!halt)
			{
				if (pointer > program.length-1 || pointer+1 > program.length-1) halt = true;
				else
				{
					execute(program[pointer], program[pointer+1]);
				}
			}
			if (wantedRegisterA % 1000000 == 0) log(wantedRegisterA);
			wantedRegisterA++;
		}
		
		setResultPart2(wantedRegisterA-1); //37221270076916
	}
	
	public void execute(int opcode, int operand)
	{
		long value = operand;
		if (value == 4) value = registerA;
		else if (value == 5) value = registerB;
		else if (value == 6) value = registerC;
		else if (value == 7)
		{
			halt = true;
			return;
		}
		
		switch (opcode)
		{
			case 0:	
				registerA = Math.divideExact(registerA, (long)Math.pow(2, value));
				pointer = pointer + 2;
				break;
			case 1:
				registerB = registerB ^ value;
				pointer = pointer + 2;
				break;
			case 2: // bst
				registerB = value % 8;
				pointer = pointer + 2;
				break;
			case 3: //jnz
				if (registerA != 0)
				{
					pointer = (int)value;
				}
				else pointer = pointer +2;
				break;
			case 4:
				registerB = registerB ^ registerC;
				pointer = pointer + 2;
				break;
			case 5:
				output += value%8 + ",";
				pointer = pointer + 2;
				break;
			case 6:
				registerB = Math.divideExact(registerA, (long)Math.pow(2, value));
				pointer = pointer + 2;
				break;
			case 7:
				registerC = Math.divideExact(registerA, (long)Math.pow(2, value));
				pointer = pointer + 2;
				break;
				
		}
	}
}
