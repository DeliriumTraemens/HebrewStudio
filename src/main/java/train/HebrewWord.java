package train;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

//@XmlRootElement(name = "WordEntry")
public class HebrewWord implements Serializable {

    private int id;
    private String skill;
    private String word;
    private String translation;
    private String gender;
    private String form;
    private String number;
    private String type;
    private String niqqud;
    private String transliteration;
    private String newTranslit;
    private boolean hasShva;
    private String process;
    private String notes;

    // Конструктор по умолчанию
    public HebrewWord() {}

    // Конструктор с параметрами
    public HebrewWord(int id, String skill, String word, String translation, String gender,
                      String form, String number, String type, String niqqud,
                      String transliteration, String newTranslit, boolean hasShva,
                      String process, String notes) {
        this.id = id;
        this.skill = skill;
        this.word = word;
        this.translation = translation;
        this.gender = gender;
        this.form = form;
        this.number = number;
        this.type = type;
        this.niqqud = niqqud;
        this.transliteration = transliteration;
        this.newTranslit = newTranslit;
        this.hasShva = hasShva;
        this.process = process;
        this.notes = notes;
    }

    // Геттеры и сеттеры для каждого поля

//    @XmlElement(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @XmlElement(name = "Skill")
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

//    @XmlElement(name = "Word")
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

//    @XmlElement(name = "Translation")
    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

//    @XmlElement(name = "Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    @XmlElement(name = "Form")
    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

//    @XmlElement(name = "Number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

//    @XmlElement(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    @XmlElement(name = "Niqqud")
    public String getNiqqud() {
        return niqqud;
    }

    public void setNiqqud(String niqqud) {
        this.niqqud = niqqud;
    }

//    @XmlElement(name = "Transliteration")
    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

//    @XmlElement(name = "NewTranslit")
    public String getNewTranslit() {
        return newTranslit;
    }

    public void setNewTranslit(String newTranslit) {
        this.newTranslit = newTranslit;
    }

//    @XmlElement(name = "HasShva")
    public boolean isHasShva() {
        return hasShva;
    }

    public void setHasShva(boolean hasShva) {
        this.hasShva = hasShva;
    }

//    @XmlElement(name = "Process")
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

//    @XmlElement(name = "Notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "HebrewWord{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                ", word='" + word + '\'' +
                ", translation='" + translation + '\'' +
                ", gender='" + gender + '\'' +
                ", form='" + form + '\'' +
                ", number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", niqqud='" + niqqud + '\'' +
                ", transliteration='" + transliteration + '\'' +
                ", newTranslit='" + newTranslit + '\'' +
                ", hasShva=" + hasShva +
                ", process='" + process + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}

