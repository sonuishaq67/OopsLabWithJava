package com.msrit.problem11;

public class SGPAException extends Exception{
	private static final long serialVersionUID = 1L;
	private int SGPA;

	SGPAException(int SGPA) {
		this.SGPA = SGPA;
	}

	public String toString() {
		return "SGPA Exception Credit greater Than 30 i.e [" + SGPA + "]\n";
	}
}
