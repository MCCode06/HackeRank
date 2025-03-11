import java.util.Comparator;

class Student{
    private final int id;
    private final String fname;
    private final double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}


class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        if (a.getCgpa() != b.getCgpa()){
            return Double.compare(a.getCgpa(), b.getCgpa());
        }
        else if(!(a.getFname()).equals(b.getFname())){
            return (a.getFname()).compareTo(b.getFname());
        }
        else if(a.getId() != b.getId()){
            return Integer.compare(a.getId(), b.getId());
        }
        return 0;
    }
}