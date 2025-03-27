public class ShowEnum {
    // enum Grade {
    // A, B, C, D, F
    // }

    enum Role {
        ADMIN, STAFF, USER
    }

    public static void main(String[] args) {
        // for (Grade grad : Grade.values()) {
        // System.out.println(grad);
        // }

        Role role = Role.ADMIN;
        System.out.println(role);
        Grade grade = Grade.A;
        System.out.println(grade);
        System.out.println(grade.getPoint() + " points" + " " + grade.getGrade() + " grade");
    }
}
