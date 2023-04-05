public class Student {
    private String name;
    private Integer registerNo;

    public Student(String name, Integer registerNo) {
        this.name = name;
        this.registerNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public Integer getRegisterNo() {
        return registerNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegisterNo(Integer registerNo) {
        this.registerNo = registerNo;
    }

    public void display(Course obj) {
        System.out.println(this.name + " is learning the " + obj.getName() + " course");
    }
}
