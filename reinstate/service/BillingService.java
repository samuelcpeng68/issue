package reinstate.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import reinstate.model.Bill;
import reinstate.model.BillType;
import reinstate.model.BillingInfo;

/**
 * Billing Service Stub to simulate Billing Info received from REST API.
 * 
 * @author samuel.c.peng
 *
 */
public class BillingService {
	
	public BillingInfo getBillingInfo()
	{
		BillingInfo bInfo = new BillingInfo();
		bInfo.setAccount("John Doe");
		List<Bill> bills = new ArrayList<Bill>();
		Bill bill1 = new Bill();
		bill1.setAmount(100);
		bill1.setBillType(BillType.OUTSTANDING);
		bill1.setDate(Date.valueOf("2021-10-10"));
		bills.add(bill1);
		Bill bill2 = new Bill();
		bill2.setAmount(200);
		bill2.setBillType(BillType.PAID);
		bill2.setDate(Date.valueOf("2019-10-10"));
		bills.add(bill2);
		Bill bill3 = new Bill();
		bill3.setAmount(400);
		bill3.setBillType(BillType.OUTSTANDING);
		bill3.setDate(Date.valueOf("2018-10-10"));
		bills.add(bill3);
		Bill bill4 = new Bill();
		bill4.setAmount(200);
		bill4.setBillType(BillType.PAID);
		bill4.setDate(Date.valueOf("2017-10-10"));
		bills.add(bill4);
		Bill bill5 = new Bill();
		bill5.setAmount(200);
		bill5.setBillType(BillType.OUTSTANDING);
		bill5.setDate(Date.valueOf("2016-10-10"));
		bills.add(bill5);
		bInfo.setBills(bills);
		
		return bInfo;
	}

}
