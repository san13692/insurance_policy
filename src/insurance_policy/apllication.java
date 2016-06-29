package insurance_policy;

public class apllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		life_insurance li =new life_insurance(1234, "anand", 200000.0D, "QTR");
		policy_holder ph = new policy_holder("Surabhi","Dad");
		policy_agent pa = new policy_agent("Ramesh");
		
		double pay_premium = pa.calculate_premium(li);
		String message = ph.paypremium(pay_premium);
		System.out.println(message);
		
		
			
	}

}
