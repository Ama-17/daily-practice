package Tructor;

public class Teachar2 extends People2 {
//public class Teachar2 {
    private String skill;

    public Teachar2() {}
    public Teachar2(String name, char sex, String skill) {
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
