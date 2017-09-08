public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner sc = new Scanner(System.in);
    private int id;
	private String fullname;
	private Date birthDate;
	private double avgMark;
		Date stdob;

		System.out.print("How many students would you like to enter?");
		n = sc.nextInt();
		sc.nextLine();
		ArrayList student = new ArrayList(n);
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Enter ID: ");
			  id = sc.nextInt();
			System.out.print("Enter name: ");
			fullname = sc.nextLine();
			System.out.print("Enter birthDate:");
			birthDate = sc.nextDouble();
			sc.nextInt();
			System.out.print("Enter marks:");
			avgMark = sc.nextLine();
			studentArray.add(new Student( id, fullName,birthDate,avgMark));
			
	   
		for (ListIterator s = student.listIterator(); s.hasNext(); ) {
			Student st = (Student)s.next();
			System.out.println(st);
		}
		
		ListIterator sl = studentArray.listIterator();
		
	    while (studentIterator.hasNext()) {
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}	
	}
}


}	
		
