public class BT3 {
    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        String time = "24/01/2026";

        long startSB = System.currentTimeMillis();

        StringBuilder reportSB = new StringBuilder();
        reportSB.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportSB.append("Ngày tạo: ").append(time).append("\n");

        for (int i = 0; i < transactions.length; i++) {
            reportSB.append("Giao dịch: ").append(transactions[i]).append("\n");
        }

        long endSB = System.currentTimeMillis();
        long timeSB = endSB - startSB;

        long startStr = System.currentTimeMillis();

        String reportStr = "";
        reportStr += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Ngày tạo: " + time + "\n";

        for (int i = 0; i < transactions.length; i++) {
            reportStr += "Giao dịch: " + transactions[i] + "\n";
        }

        long endStr = System.currentTimeMillis();
        long timeStr = endStr - startStr;

        System.out.println(reportSB.toString());
        System.out.println("Thời gian với StringBuilder: " + timeSB + " ms");
        System.out.println("Thời gian với String: " + timeStr + " ms");
    }
}
