package own;

class SchoolTest {
    public static void main(String[] args) {
        School school = new School(3);

        school.add(new Student(1,"Marian", "Kowalski"));
        school.add(new Student(2,"Daniel", "Nowak"));
        school.add(new Student(3,"Jan", "Koperek"));

        Student student = school.find("Jan", "Koperek");

        if (student != null)
        System.out.println("Znaleziony student o id :" + student.getStudentId() );

    }
}