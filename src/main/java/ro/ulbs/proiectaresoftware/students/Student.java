package ro.ulbs.proiectaresoftware.students;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    @Override
    public String toString() {
 //       return "Student{" +
 //               "numarMatricol=" + numarMatricol +//              ", prenume='" + prenume + '\'' +
 //               ", nume='" + nume + '\'' +
  //              ", formatieDeStudiu='" + formatieDeStudiu + '\'' +
 //               '}';
        return String.format("%5d %10s %10s %5s", numarMatricol, prenume, nume, formatieDeStudiu);
    }
}
