package com.qa.contructor;

public class Bank {

	private int accNumber;
	private String accType;
	private float balance;
	private String memorableWord;
	private float overDraft;

	public Bank() {
	};

	public Bank(int accNumber, String accType, float balance, String memorableWord, float overDraft) {

		this.accNumber = accNumber;
		this.accType = accType;
		this.balance = balance;
		this.memorableWord = memorableWord;
		this.overDraft = overDraft;

		System.out.println("New Account has been created!");
	}

	public int getaccNumber() {

		return accNumber;

	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;

	}

	public void setoverDraft(int overDraft) {
		this.overDraft = overDraft;
	}

	public float overDraft() {
		return overDraft;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getMemorableWord() {
		return memorableWord;
	}

	public void setMemorableWord(String memorableWord) {
		this.memorableWord = memorableWord;
	}

	public float getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(float overDraft) {
		this.overDraft = overDraft;
	}

	public int getAccNumber() {
		return accNumber;
	}

}
