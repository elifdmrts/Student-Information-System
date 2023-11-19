public class Student {

    String name;
    String lesson;

    int oralNote;
    int writtenNote;
    double hesap;


    Student(String name, String lesson, int oralNote, int writtenNote) {
        this.name = name;
        this.lesson = lesson;
        this.oralNote = oralNote;
        this.writtenNote = writtenNote;
        this.hesap = hesap;

    }

    public void Hesapla() {
        this.hesap = (this.oralNote * 0.20) + (this.writtenNote * 0.80);
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Ders adı: " + this.lesson);
        System.out.println("Hesaplanmış Puan: " + this.hesap);
        System.out.println("--------------------");
    }


}





