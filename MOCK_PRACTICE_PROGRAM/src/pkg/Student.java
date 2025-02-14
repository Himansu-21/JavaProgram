package pkg;

public class Student {
   
	int id;
    Double mark;

    public Student(int id, Double mark) {
        this.id = id;
        this.mark = mark;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student s = (Student) obj;
        return id == s.id;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    
    @Override
   	public String toString() {
   		return "Student [id=" + id + ", mark=" + mark + "]";
   	}
    
    
}