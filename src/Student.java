public class Student {
    private String name;
    private int age;
    private int grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("잘못된 나이입니다.");
        }
        else {
            this.age = age;
        }
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if (grade < 0) {
            System.out.println("잘못된 점수 입니다.");
        }
        else {
            this.grade = grade;
        }
    }
}
