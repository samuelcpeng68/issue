package reinstate.model;

import java.util.List;

public class BillingInfo {
	
	private String account;
	private List<Bill> bills;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public List<Bill> getBills() {
		return bills;
	}
	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

}
