package Question11;

import java.util.*;
class School {
	private String name;
	private List<Teacher> teachers;

	public School(String name) {
		this.name = name;
		this.teachers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}
}
