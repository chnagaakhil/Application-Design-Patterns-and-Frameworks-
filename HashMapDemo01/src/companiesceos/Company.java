package companiesceos;

import java.util.Objects;

public class Company {
	private String name;
	private String location;
	private int networth;
	public Company(String name, String location, int networth) {
		super();
		this.name = name;
		this.location = location;
		this.networth = networth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNetworth() {
		return networth;
	}
	public void setNetworth(int networth) {
		this.networth = networth;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", networth=" + networth + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(location, name, networth);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& networth == other.networth;
	}

}
