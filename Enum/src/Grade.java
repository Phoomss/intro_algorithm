public enum Grade {
    A, B, C, D, F;

    int getPoint() {
        switch (this) {
            case A:
                return 4;
            case B:
                return 3;
            case C:
                return 2;
            case D:
                return 1;
            case F:
                return 0;
            default:
                return 0;
        }
    }

    String getGrade() {
        switch (this) {
            case A:
                return "A";
            case B:
                return "B";
            case C:
                return "C";
            case D:
                return "D";
            case F:
                return "F";
            default:
                return "F";
        }
    }
}