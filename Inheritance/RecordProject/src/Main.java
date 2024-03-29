public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
//            Student s = new Student("hxj230011" + i,
//                    switch (i){
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Tim";
//                        case 4 -> "Harry";
//                        case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "01/31/1998", "Java Master Class");
//            System.out.println(s);

            // using record class
            // the output will be simillar but [] bracket
            LPAStudent s = new LPAStudent("hxj230011" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "01/31/1998", "Java Master Class");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923023", "Ann", "05/11/1985", "Java Master Class");
        LPAStudent recordStudent = new LPAStudent("S9342323", "Bill", "05/11/1985", "Java Master Class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + " , Java OCP Exam 829");
        // recordStudent.setClassList(pojoStudent.getClassList() + " , Java OCP Exam 829"); // this is not working

        System.out.println(pojoStudent.getName() + " is taking" + pojoStudent.getClassList());
        // System.out.println(recordStudent.getName() + " is taking" + recordStudent.getClassList()); // this is not going to work
        System.out.println(recordStudent.name() + " is taking" + recordStudent.classList()); // this one is correct
    }
}
