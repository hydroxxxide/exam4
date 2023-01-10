package task3;

public class Student {
    private String name;
    private String group;
    private Integer course;
    private Integer rating;

    public Student(String name, String group, Integer course, Integer rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
