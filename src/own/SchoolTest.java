package own;

class SchoolTest {
    public static void main(String[] args) {
        School school = new School(2);

        try {
            school.add(new Student(1,"Marian", "Kowalski"));
            school.add(new Student(2,"Daniel", "Nowak"));
            school.add(new Student(3,"Jan", "Koperek"));
        } catch (NoMoreSpaceException e) {
            System.err.println(e.getMessage());
        }


        try {
            Student student = school.find("Jan", "Koperek");
            System.out.println("Znaleziony student o id :" + student.getStudentId() );
        } catch (NoElementFoundException e) {
            System.err.println(e.getMessage());
        }


    }
}