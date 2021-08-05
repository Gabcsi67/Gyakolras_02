public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
        note.setName("István");
        note.setTopic("Mese");
        note.setText("Egyszer volt, hol nem volt.. ");
        System.out.println(
                note.getNoteText()
        );
    }
}
