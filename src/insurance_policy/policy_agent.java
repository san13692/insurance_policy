package insurance_policy;

public class policy_agent {
	private String agent_name;
	
	
	public policy_agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public policy_agent(String agent_name) {
		super();
		this.agent_name = agent_name;
	}


	public double calculate_premium(life_insurance policy){
		
		double premium= (policy.getPolicyamount()/10.0);
		return premium;
	}

	public String getAgent_name() {
		return agent_name;
	}

	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	
}
