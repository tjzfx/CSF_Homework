
public class Item {
	
	protected String title;
	protected Boolean isLoanable;
	protected Integer loanPeriodDays;

	public Item() {
		this.title = "unknown title";
		this.isLoanable = true;
	}
	
	public Item(String title, Boolean isLoanable) {
		this.title = title;
		this.isLoanable = isLoanable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getIsLoanable() {
		return isLoanable;
	}

	public void setIsLoanable(Boolean isLoanable) {
		this.isLoanable = isLoanable;
	}

	public Integer getLoanPeriodDays() {
		return loanPeriodDays;
	}

	public void setLoanPeriodDays(Integer loanPeriodDays) {
		this.loanPeriodDays = loanPeriodDays;
	}
	
	
}