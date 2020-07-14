package com.msrit.problem11;

class CreditLimitException extends Exception {
	private static final long serialVersionUID = 1L;
	private int credit;

	CreditLimitException(int credit) {
		this.credit = credit;
	}

	public String toString() {
		return "Credit Exception Credit greater Than 30 i.e [" + credit + "]";
	}
}
