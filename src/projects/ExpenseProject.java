package projects;

public class ExpenseProject {




	public class ExepenceProject {
		private String name;
	    private double amount;
	    private String category;
	 public ExepenceProject(String name,double amount,String category) {
		 this.name=name;
		 this.amount=amount;
		 this.category=category;
				 
			 }
	 public String getName() {
		 return name;
	 }public double getAmount() {
		 return amount;
		 
	 }public String getCategory(){
		 return category;
	 
			}
	 public void display() {
		 System.out.println("Name:"+name);
		 System.out.println("Amount: "+amount);
		 System.out.println("Category: "+category);
	 }

	}


	}


