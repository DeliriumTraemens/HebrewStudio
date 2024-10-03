package train;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "WordEntry")
public class WordEntry {
    private int ID;
    private String Skill;
    private String Word;
    private String Translation;
    private String Type;
    private String Niqqud;
    private String Transliteration;
    private String NewTranslit;
    private String Gender;
    //    private String Form;
//    private String Number;
    private boolean HasShva;
    private String Process;
//    private String Notes;


    public WordEntry() {
    }

    // Getters и Setters с аннотациями @XmlElement для каждого поля
    @XmlElement
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @XmlElement
    public String getSkill() {
        return Skill;
    }

    public void setSkill(String Skill) {
        this.Skill = Skill;
    }

    @XmlElement
    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }

    @XmlElement
    public String getTranslation() {
        return Translation;
    }

    public void setTranslation(String translation) {
        Translation = translation;
    }

    @XmlElement
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @XmlElement
    public String getNiqqud() {
        return Niqqud;
    }

    public void setNiqqud(String niqqud) {
        Niqqud = niqqud;
    }

    @XmlElement
    public String getTransliteration() {
        return Transliteration;
    }

    public void setTransliteration(String transliteration) {
        Transliteration = transliteration;
    }

    @XmlElement
    public String getNewTranslit() {
        return NewTranslit;
    }

    public void setNewTranslit(String newTranslit) {
        NewTranslit = newTranslit;
    }

    @XmlElement
    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @XmlElement
    public boolean isHasShva() {
        return HasShva;
    }

    public void setHasShva(boolean hasShva) {
        HasShva = hasShva;
    }

    @XmlElement
    public String getProcess() {
        return Process;
    }

    public void setProcess(String process) {
        Process = process;
    }
// Аналогично для остальных полей
}
