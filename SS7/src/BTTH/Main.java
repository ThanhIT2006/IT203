package BTTH;

public class Main {
    static void main(String[] args) {
        Students nguyenVanA = new Students("SV001", "Nguyễn Văn A");
        Students tranThiB = new Students("SV002", "Trần Thị B");
        Students loVanC = new Students("SV003", "Lò Văn C");
        Students nguyenThiD = new Students("SV004", "Nguyễn Thị D");
        Students hoangVanE = new Students("SV005", "Hoàng Văn E");

        nguyenVanA.display();
        tranThiB.display();

        Students.studentCount = 2;
        Students.showTotalStudent();

        Students[] nhom4 = {
                nguyenVanA,
                tranThiB,
                loVanC,
                nguyenThiD,
                hoangVanE
        };
        for (int i = 0; i < Students.studentCount; i++) {
            nhom4[i].display();
        }

        Students.studentCount = 5;
        Students.showTotalStudent();
    }
}