package default;

public class SandBox{
	public static void main(String[] args) {

		double num1 = 10;
		double num2 = 20;		


		
		num2 = Math.pow(num2, num1);
		System.out.println("welp");
		//edit made from the web 
		System.out.println(num1);
		System.out.println(num2);


	}//end of main
		public void addComp(){
		bottomPanel.add(nameLabel);
		bottomPanel.add(nameJTF);
	
		topPanel.add(subjectLabel);
		num2 = Math.pow(num2, num1);
		System.out.println("welp");
		//edit made from the web 
		System.out.println(num1);
		System.out.println(num2);

		topPanel.add(subjectJCB);
		centerPanel.add(messageJTA, BorderLayout.CENTER);
		
		add(topPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
	}//end of add comp
	
	public void closeApp(){
		JOptionPane.showMessageDialog(centerPanel, "Email Sent", "Email Confirmaion", JOptionPane.PLAIN_MESSAGE);

		double num1 = 10;
		double num2 = 20;		

		this.dispose();
		
	}//end of message sent
	
	public static void main(String args[]){
		new Email();
	}//end of main
}//end of  class

}//end of class

