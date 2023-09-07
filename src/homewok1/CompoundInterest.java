package homewok1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompoundInterest {
	private int principal;
	private int period;
	private BigDecimal annualInterestRate;
	//複習模組27 Math類別
	
	public CompoundInterest() {
		
	}
	
	public CompoundInterest(int pv ,int n ,BigDecimal i) {
		
		annualInterestRate = i;
		if(pv > 0 && n > 0 && annualInterestRate.compareTo(BigDecimal.ZERO) > 0 ) {
			principal = pv;
			period = n;
			annualInterestRate = i;
		}else {
			System.out.println("請輸入正整數");
		}
	}
	
	public int getPrincipal() {
		return principal;
	}
	
	public void setPrincipal(int pv) {
		if(pv > 0) {
			principal = pv;
		}else {
			System.out.println("請輸入正整數");
		}
	}
	
	public int getPeriod() {
		return period;
	}
	
	public void setPeriod(int n) {
		if(n > 0) {
			period = n;
		}else {
			System.out.println("請輸入正整數");
		}
	}
	
	public BigDecimal getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(BigDecimal i) {
		if(i.compareTo(BigDecimal.ZERO) > 0) {
			annualInterestRate = i;
		}else {
			System.out.println("請輸入正數");
		}
	}
	
	public void calCompoundInterest() {
		BigDecimal pvBigDecimal = new BigDecimal(principal);
		BigDecimal one = new BigDecimal("1.0");
		
		BigDecimal fv = pvBigDecimal.multiply(one.add(annualInterestRate).pow(period));
		fv = fv.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("本金加利息共為：" + fv);
	}
	
	public static void main(String[] args) {
		
		CompoundInterest calFV = new CompoundInterest();
		calFV.setPrincipal(1_500_000);
		calFV.setPeriod(10);
		calFV.setAnnualInterestRate(new BigDecimal("0.02"));
		
		calFV.calCompoundInterest();
	}
	
	
}


