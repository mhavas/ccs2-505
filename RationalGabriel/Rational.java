public class Rational {
	
	//Declaration of Rational fields
	private int numerator;
	private int denominator;
	
	//Constructor
	public Rational(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	//Getters
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	//Addition methods
	public static Rational add(Rational r1, Rational r2) {
		int newNum;
		int newDem;
		newNum = r1.getNumerator() * r2.getDenominator() + r1.getDenominator() * r2.getNumerator();
		newDem = r1.getDenominator() * r2.getDenominator();
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	public Rational add(Rational r) {
		int newNum;
		int newDem;
		newNum = this.getNumerator() * r.getDenominator() + this.getDenominator() * r.getNumerator();
		newDem = this.getDenominator() * r.getDenominator();
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}

	public Rational add(int i) {
		int newNum;
		int newDem;
		newNum = this.getNumerator() * 1 + this.getDenominator() * i;
		newDem = this.getDenominator() * 1;
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	//Substraction methods
	public static Rational minus(Rational r1, Rational r2) {
		int newNum;
		int newDem;
		newNum = r1.getNumerator() * r2.getDenominator() - r1.getDenominator() * r2.getNumerator();
		newDem = r1.getDenominator() * r2.getDenominator();
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	public Rational minus(Rational r) {
		int newNum;
		int newDem;
		newNum = this.getNumerator() * r.getDenominator() - this.getDenominator() * r.getNumerator();
		newDem = this.getDenominator() * r.getDenominator();
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	public Rational minus(int i) {
		int newNum;
		int newDem;
		newNum = this.getNumerator() * 1 - this.getDenominator() * i;
		newDem = this.getDenominator() * 1;
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	//Multiplication methods
	public static Rational times(Rational r1, Rational r2) {
		int newNum;
		int newDem;
		newNum = r1.getNumerator() * r2.getNumerator();
		newDem = r1.getDenominator() * r2.getDenominator();
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	public Rational times(Rational r) {
		int newNum;
		int newDem;
		newNum = this.getNumerator() * r.getNumerator();
		newDem = this.getDenominator() * r.getDenominator();
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	public Rational times(int i) {
		int newNum;
		int newDem;
		newNum = this.getNumerator() * i;
		newDem = this.getDenominator() * 1;
		Rational ret = new Rational(newNum, newDem);
		return ret;
	}
	
	//Divide methods
	public static Rational divide(Rational r1, Rational r2) {
		Rational newR2 = r2.inverse();
		Rational ret = r1.times(newR2);
		return ret;
	}
	
	public Rational divide(Rational r) {
		Rational newR = r.inverse();
		Rational ret = this.times(newR);
		return ret;
	}
	
	public Rational divide(int i) {
		Rational ret = new Rational(this.getNumerator(),(this.getDenominator() * i));
		return ret;
	}
	
	//Other methods
	public String toString() {
		return String.format("%d / %d", numerator, denominator);
	}
	
	private Rational inverse() {
		Rational newR = new Rational(this.getDenominator(), this.getNumerator());
		return newR;
	}
	
	public Rational simplify() {
		int gcfNum = Rational.gcf(this.getNumerator(),this.getDenominator());
		int newNum = this.getNumerator() / gcfNum;
		int newDen = this.getDenominator() / gcfNum;
		return new Rational(newNum, newDen);
	}
	
	public double toDecimal() {
		double ret = (double)this.getNumerator() / (double)this.getDenominator(); 
		return ret;
	}
	
	public boolean equals(Rational eq) {
		Rational rSIM = this.simplify();
		Rational eSIM = eq.simplify();
		if ( (rSIM.getNumerator() == eSIM.getNumerator() ) && (rSIM.getDenominator() == eSIM.getDenominator() ) ) {
			return true;
		} else {
			return false;
		}
	}
	
	//To calculate the greatest common factor
	private static int gcf(int n1, int n2) {
		int gcf = 1;
		
		//Determine the biggest number of the two
		int biggestN = 1;
		if (n1 > n2) {
			biggestN = n1;
		} else {
			biggestN = n2;
		}
		//Start from this number and counting down until reaching a the greatest common factor
		for(int i = biggestN; i > 0; i--) {
			int remainderN1 = n1 % i;
			int remainderN2 = n2 % i;
			if ( (remainderN1 == 0) && (remainderN2 == 0)) {
				gcf = i;
				break;
			}
		}
		return gcf;
	}

	public static void main(String[] args) {
		/*Rational r1 = new Rational(1, 2);
		Rational r2 = new Rational(3, 4);
		Rational ra = r1.divide(r2);
		Rational rb = r2.divide(r1);
		Rational rc = Rational.divide(r1,r2);
		Rational rd = r1.divide(3);
		Rational re = r2.divide(3);
		System.out.println("r1.divide(r2) = " + ra);
		System.out.println("r2.divide(r1) = " + rb);
		System.out.println("Rational.divide(r1, r2) = " + rc);
		System.out.println("r1.divide(3)= " + rd);
		System.out.println("r2.divide(3)= " + re);*/
		Rational r1 = new Rational(22, 5);
		Rational r2 = new Rational(84, 20);
		Rational r2SIM = r2.simplify();
		System.out.println(r2SIM);
		System.out.println(r2SIM.toDecimal());
		System.out.println(r1.equals(r2));
	}
}
