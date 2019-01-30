package Oops;

 class Examplee  {
		
		   private int numOfEmployees = 0;
		   public void setNoOfEmployees (int count)
		   {
		       numOfEmployees = count;
		   }
		   public double getNoOfEmployees () 
		   {
		       return numOfEmployees;
		   }
		}


		class Encapsulation_Example
		{
		   public static void main(String args[])
		   {
		      Examplee obj = new Examplee();
		      obj.setNoOfEmployees(5613);
		      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
		    }
		}

		


