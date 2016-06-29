package insurance_policy;

public class policy_holder {
	private String policyholder;
	private String nominee;
	
	
	
	
	public policy_holder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public policy_holder(String policyholder, String nominee) {
		
		super();
		this.policyholder = policyholder;
		this.nominee = nominee;
	}



	public String getPolicyholder() {
		return policyholder;
	}
	public void setPolicyholder(String policyholder) {
		this.policyholder = policyholder;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	public String paypremium(double premiumamount)
	{
		return premiumamount + "is the Premium paid ";
	}

	
}
