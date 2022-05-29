package com;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose the numbers between 1 to 7 to select a music instrument");
		int instrument=sc.newInt();
		string music Instrument;
		Switch(instrument){
			case1:
				musicInstrument="Guitar";
			break;
			case2:
				musicInstrument="Piano";
			break;
			case3:
				musicInstrument="Drums";
			break;
			case4:
				musicInstrument="Flute";
			break;
			case5:
				musicInstrument="Ukelete";
			break;
			case6:
				musicInstrument="Violin";
			break;
			case7:
				musicInstrument="Trumpet";
			break;
			default:
				musicInstrument="Invalid";
				break;
		}
		System.out.println("you have selected"+musicInstrument);
	}
}

}
		
		
	

	

