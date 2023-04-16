package Question11;

import java.util.*;

class House {
	private List<Room> rooms;

	public House() {
		this.rooms = new ArrayList<>();
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public List<Room> getRooms() {
		return rooms;
	}
}