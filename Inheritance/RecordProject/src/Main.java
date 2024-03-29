public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            Student s = new Student("hxj230011" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "01/31/1998", "Java Master Class");
        }
    }
}
