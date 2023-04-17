package practice01;

public class PracticeDemo01 {
	private String hero;
	private String heroine;
	private String movie;
	private int screentime;
	private int budgetCR;
	public PracticeDemo01(String hero, String heroine, String movie, int screentime, int budgetCR) {
		super();
		this.hero = hero;
		this.heroine = heroine;
		this.movie = movie;
		this.screentime = screentime;
		this.budgetCR = budgetCR;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getScreentime() {
		return screentime;
	}
	public void setScreentime(int screentime) {
		this.screentime = screentime;
	}
	public int getBudgetCR() {
		return budgetCR;
	}
	public void setBudgetCR(int budgetCR) {
		this.budgetCR = budgetCR;
	}
	@Override
	public String toString() {
		return "PracticeDemo01 [hero=" + hero + ", heroine=" + heroine + ", movie=" + movie + ", screentime="
				+ screentime + ", budgetCR=" + budgetCR + "]";
	}
	
	
}
