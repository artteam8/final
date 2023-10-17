package org.example.vebinarcrud.notes.models;

public class WebNote {
    public WebNote(){
        this.id = 0;
        this.note = "";
    }
    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private int id;

    public WebNote(int id, String note) {
        this.id = id;
        this.note = note;
    }

    private String note;

}
