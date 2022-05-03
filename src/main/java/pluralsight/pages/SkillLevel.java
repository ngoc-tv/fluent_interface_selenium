package pluralsight.pages;

public enum SkillLevel {
	BEGINNER("Beginner"), INTERMEDIATE("Intermediate"), ADVANCE("Advance");
	
	private String value;
	
	SkillLevel(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
