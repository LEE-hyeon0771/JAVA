package Test;

public class Engineer extends Employee{
	private String skillset;
	
	public Engineer(String name, String grade) {
		super(name, grade);
		name = "엔지니어";
		grade = "1등급";
		
	}
	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
}
