public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private static int jObjek = 0;

    public Student() {
        name = "";
        address = "";
        age = 0;
        jObjek++;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jObjek++;
    }

    // Konstruktor tambahan dengan nilai mata pelajaran
    public Student(String n, String a, int ag, double math, double english, double science) {
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jObjek++;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(double math) {
        mathGrade = math;
    }

    public void setEnglish(double english) {
        englishGrade = english;
    }

    public void setScience(double science) {
        scienceGrade = science;
    }

    private double getAverage() {
        return (mathGrade + scienceGrade + englishGrade) / 3.0;
    }

    public boolean statusAkhir() {
        return getAverage() >= 61;
    }

    public void displayMessage() {
        System.out.println("Memiliki nama " + name);
        System.out.println("Beramalat di " + address);
        System.out.println("Berumur " + age);
        System.out.println("Mempunyai nilai rata rata " + getAverage());
        if (statusAkhir()) {
            System.out.println("Telah dinyatakan Lulus");
        } else {
            System.out.println("Telah dinyatakan Remidi");
        }
        System.out.println("=======================");
    }

    public void jumlahObjek() {
        System.out.println("jumlah objek yang dibuat" + jObjek);
    }
}
