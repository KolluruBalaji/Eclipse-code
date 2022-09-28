package UserInput;

public class nestedif {

	public static void main(String[] args) {
		String ExamStatus="pass";
		if(ExamStatus.equals("pass")) {
			System.out.println("wait for the further rounds");
			String Round1="pass";
			if(Round1.equals("pass")) {
				System.out.println("you have clared the round1 interview please wait for round 2");
			}
			else {
				System.out.println("you can go the home");
			}
			String Round2="pass";
			if(Round2.equals("Fail")) {
				System.out.println("you have cleared the round 2 please wait hr round ");
				
			}
			else {
				System.out.println("you can go home ");
			}
		}
		else {
			System.out.println("you can go home ");
		}

	}

}
