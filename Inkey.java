public class Inkey{
	//create a constructor
	public Inkey(String a){
		
		System.out.println(a);  //print pinky's value
	}
	
	public Inkey(String p,String q,String r){
		
		System.out.println(p + " " + r);  //pinky donkey
		System.out.println(r + " " + q);  //donkey monkey
		System.out.println(p + " " + r + " " +q);  //pinky donkey monkey
	}
	
	public static void main(String[] args){
		String blinky="Pinky";  //local variable
		String rinky="Monkey";  //local variabble
		String pinky="Donkey";  //local variable
		
		Inkey ponkey=new Inkey(pinky);  //create an object and call to constructor
		
		Inkey ponkey2=new Inkey(blinky,rinky,pinky);  //create another object and call to constructor
	}
	
	
}