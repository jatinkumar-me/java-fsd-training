package com.jatin.my_app.model;

/**
 * Skill
 */
public class Skill {

	private int yoe;

	private String skillName;

	public Skill() { }

	public Skill(int yoe, String skillName) {
		this.yoe = yoe;
		this.skillName = skillName;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + ", experience=" + yoe + "yrs]";
	}

}
