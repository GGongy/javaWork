package day0724;

public class Telphone {
	private double screen;
	private double cpu;
	private double mem;
	
	public Telphone(){
		System.out.println();
	}
	
	public Telphone(double newScreen,double newCpu,double newMem){
		if(newScreen < 3.5){
			System.out.println("enter err");
			newScreen = 3.5;
		}else{	
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
		System.out.println("you can de zhi xing");
		}
	}
}
