package Question11;

public class AssociationAggregationCompositionDemo {

	public static void main(String[] args) {
		// Association
		Person person = new Person("John");
		Car car = new Car("Toyota");
		person.setCar(car);
		System.out.println(person.getName() + " owns a " + person.getCar().getBrand());

		// Aggregation
		School school = new School("ABC School");
		Teacher teacher1 = new Teacher("Mary");
		Teacher teacher2 = new Teacher("Tom");
		school.addTeacher(teacher1);
		school.addTeacher(teacher2);
		System.out.println(school.getName() + " has " + school.getTeachers().size() + " teachers.");

		// Composition
		House house = new House();
		Room livingRoom = new Room("Living Room");
		Room bedroom = new Room("Bedroom");
		house.addRoom(livingRoom);
		house.addRoom(bedroom);
		System.out.println("The house has " + house.getRooms().size() + " rooms.");
	}
}

