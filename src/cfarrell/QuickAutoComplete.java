package cfarrell;
public class QuickAutoComplete implements AutoComplete{

	@Override
	public double weightOf(String term) {
		System.out.println("Work In Progress");
		return 0;
	}

	@Override
	public String bestMatch(String prefix) {
		System.out.println("Work In Progress");

		return null;
	}

	@Override
	public Iterable<String> matches(String prefix, int k) {
		System.out.println("Work In Progress");

		return null;
	}
	
}
