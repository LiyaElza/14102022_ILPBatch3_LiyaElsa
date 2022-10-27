package com.bank.utility;

import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Service service=BankService.createService();
			BankService.createRateCard(service);
			BankService.displayServiceDetails(service);
	}

}
