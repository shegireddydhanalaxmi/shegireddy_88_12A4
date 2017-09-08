import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		ID = id;
		this.fullName = fullName;
		DOB = birthDate;
		Marks = avgMark;

	}

	public int getId() {
           return id;
	}

	public void setId(int id) {

         ID=id;
	}

	public String getFullName() {
        return fullName;
	}

	public void setFullName(String fullName) {
        this.fullName = fullName;
	}

	public Date getBirthDate() {
          return birthDate;
	}

	public void setBirthDate(Date birthDate) {
          DOB= birthDate;
	}

	public double getAvgMark() {
        return avgMark;
	}

	public void setAvgMark(double avgMark) {
         Marks=avgMark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
        return true;
    }
    if (o == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    Advertisement o = (Advertisement) o;
    return this.getId().equals(o.getId());
}
}

	@Override
	public int hashCode() {
         return getId().hashCode();
	}

	@Override
	public int compareTo(Object o) {
		int cmp = getFullName().compareToIgnoreCase(g.getFullName());
       if (cmp != 0) return cmp;
        return (getId() < g.getId() ? -1 : getId() == g.getId() ? 0 : 1);
	}
}

	}
}
