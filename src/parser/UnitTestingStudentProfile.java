package parser;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
Student st = new Student();
st.setFirstName("Mohammad");
st.setLastName("Hamid");
st.setScore("777");
st.setId("101");
        System.out.println(st.getFirstName() +" "+ st.getLastName()+" "+st.getScore() +" "+st.getId());
    }
}
