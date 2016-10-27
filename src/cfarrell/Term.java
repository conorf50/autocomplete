package cfarrell;

public class Term implements Comparable<Term>{
	public String getTerm() {
		return term;
	}
	public double getWeight() {
		return weight;
	}
	String term;
	double weight;
	public Term(String term, double weight) {
		this.weight =weight;
		this.term = term;
		
	}
	@Override
	public int compareTo(Term t) {
		
		return Double.compare(this.getWeight(), t.getWeight());
	}
	

	
}
