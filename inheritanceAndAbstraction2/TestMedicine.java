package inheritanceAndAbstraction2;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine a[]=new Medicine[5];
		double b=Math.random()*4;
		
		int c=(int) b;
		
		switch(c)
		{
		case 1: a[0]=new Tablet(100, "21-JAN-2022");
				a[0].getdetails();
				a[0].displayLabel();
				break;
		case 2: a[1]=new Syrup(200, "25-JUNE-2022");
				a[1].getdetails();
				a[1].displayLabel();
				break;
		case 3: a[2]= new Ointment(300, "30-DEC-2022");
				a[2].getdetails();
				a[2].displayLabel();
				break;
		default: System.out.println("Enter Valid Choice");
		}

	}

}
