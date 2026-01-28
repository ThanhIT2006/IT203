public class BT4 {
    public static void main(String[] args) {

        String cardID = "TV202312345";

        if (!cardID.substring(0, 2).matches("[A-Z]{2}")) {
            System.out.println("Thiếu tiền tố chữ cái viết hoa!");
        }
        else if (!cardID.substring(2, 6).matches("[0-9]{4}")) {
            System.out.println("Năm không hợp lệ!");
        }
        else if (!cardID.substring(6).matches("[0-9]{5}")) {
            System.out.println("5 chữ số cuối không hợp lệ!");
        }
        else {
            System.out.println("Mã thẻ hợp lệ!");
        }
    }
}
