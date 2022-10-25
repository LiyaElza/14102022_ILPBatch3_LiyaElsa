package com.experion.service;

import com.experion.entity.Account;

public interface SavingsAccountCurrentAccountService {
	public Account atmWithdrawal(Account account);
	public Account onlineBanking(Account account);

}
