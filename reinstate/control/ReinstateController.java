package reinstate.control;

import java.util.Collections;
import java.util.List;

import reinstate.model.Bill;
import reinstate.model.BillType;
import reinstate.model.BillingInfo;
import reinstate.service.BillingService;

public class ReinstateController {
	
	public int getReinstateAmount(boolean oldest) {
		
		BillingService bs = new BillingService();
		BillingInfo binfo = bs.getBillingInfo();
		
		
		if(oldest) {
			List<Bill> bills = binfo.getBills();
			Collections.reverse(bills);
			return bills.stream()		
				.filter( bill -> (bill.getBillType() == BillType.OUTSTANDING) )
				.limit(2)
				.map(obill -> obill.getAmount())
				.mapToInt(Integer::intValue)
				.sum();
		} else {
			return binfo.getBills().stream()		
			.filter( bill -> (bill.getBillType() == BillType.OUTSTANDING) )
			.limit(2)
			.map(obill -> obill.getAmount())
			.mapToInt(Integer::intValue)
			.sum();
		}
	}
	
	public static void main(String[] args) {
		
		ReinstateController c = new ReinstateController();
		System.out.println(c.getReinstateAmount(true));
		System.out.println(c.getReinstateAmount(false));
	}

}
