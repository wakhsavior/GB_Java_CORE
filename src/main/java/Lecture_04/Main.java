package Lecture_04;

public class Main {
    enum Color {
        RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
        private String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public static void main(String[] args) {
//        for (Color c: Color.values()){
//            System.out.printf("%s(%s) ",c, c.getCode());
//        }
        Orange orange = new Orange();
        orange.squeezeJuice();
    }
}
