package Test;

public class Engineer extends Employee{
	private String skillset;
	
	public Engineer(String name, String grade) {
		super(name, grade);
		name = "�����Ͼ�";
		grade = "1���";
		
	}
	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
}
