package ch05_ex;

class Km2Mile extends Converter {

	private double rate;
	
	 public Km2Mile(double rate) {
		 this.rate = rate;
	 }
	
	@Override
	protected double convert(double src) {		
		return src/rate;
	}

	@Override
	protected String srcString() {
		
		return "킬로미터";
	}

	@Override
	protected String destString() {
		return "마일";
	}
	
}

public class Ex04 {


	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6Km
		toMile.run();
	}

}
