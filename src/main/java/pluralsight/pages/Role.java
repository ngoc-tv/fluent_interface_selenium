package pluralsight.pages;

public enum Role {
	BUSINESS_PROFRESSIONAL("Business Profressional"), 
	SOFTWARE_DEVELOPMENT("Software Development");
	//and other
	
	private String value;
	
	Role(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
