package com.zoumf77.abstractdemo;

/**参考Java与模式，模版方法**/
public abstract class AbstractAccount {
	
	public static int years=10;
	private double amount;
	public String notes;
	public double getAmount() {
		return amount;
	}

	public AbstractAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * 顶级逻辑
	 * @return
	 */
	final public double calculateInterest(){
		return amount*doInterest();
	}
	
	abstract protected double doInterest();/*在模板方法中需要具体类实现的方法用do开头，约定的，也比较好区别*/
	
	
}

