package insurance_policy;

public class life_insurance {
	private
	long policynumber;
	String policytype;
	double policyamount;
	
	public life_insurance(long policynumber, String policytype, double policyamount, String paymentmode) {
		super();
		this.policynumber = policynumber;
		this.policytype = policytype;
		this.policyamount = policyamount;
		this.paymentmode = paymentmode;
	}
	String paymentmode;
	
	
	public life_insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public life_insurance(long policynumber, String policytype, double policyamount, double premium,
			String paymentmode) {
		super();
		this.policynumber = policynumber;
		this.policytype = policytype;
		this.policyamount = policyamount;

		this.paymentmode = paymentmode;
	}



	public long getpolicynumber() {
		return policynumber;
	}
	public void setpolicynumber(long policynumber) {
		this.policynumber = policynumber;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
	public double getPolicyamount() {
		return policyamount;
	}
	public void setPolicyamount(double policyamount) {
		this.policyamount = policyamount;
	}
	
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	
}
