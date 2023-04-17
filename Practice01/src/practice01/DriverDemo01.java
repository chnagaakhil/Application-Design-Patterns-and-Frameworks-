package practice01;

public class DriverDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Welcome");
		String s2 = "Welcome";
		String s3 = "Welcome";
		String s4 = new String("Welcome");
		
		System.out.println("******String Comparison******");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)+"\n");
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3)+"\n");
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4)+"\n");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4)+"\n");
		
		PracticeDemo01 c1 = new PracticeDemo01("Prabhas","Anushka","Baahubali",165,400);
		PracticeDemo01 c2 = new PracticeDemo01("Yash","Srinidhi","KGF2",165,150);
		PracticeDemo01 c3 = new PracticeDemo01("Mahesh","Keerthi","SVP",145,80);
		PracticeDemo01 c4 = c2;
		PracticeDemo01 c5 = new PracticeDemo01("Bala","Sruthi","Veera",145,80);
		
		System.out.println("******Objects Comparison******");
		System.out.println((c2==c4));
		System.out.println((c2.equals(c4))+"\n");
		
		System.out.println((c2==c3));
		System.out.println((c2.equals(c3))+"\n");
		
		System.out.println((c2==c5));
		System.out.println((c2.equals(c5))+"\n");
	}

}
