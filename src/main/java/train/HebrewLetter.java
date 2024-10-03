package train;
public enum HebrewLetter {
    ALEF("א", "Alef", true, false, 1, 0x05D0, 1488, "ʔ"),
    BET("ב", "Bet", false, false, 2, 0x05D1, 1489, "b"),
    GIMEL("ג", "Gimel", false, false, 3, 0x05D2, 1490, "ɡ"),
    DALET("ד", "Dalet", false, false, 4, 0x05D3, 1491, "d"),
    HE("ה", "He", true, false, 5, 0x05D4, 1492, "h"),
    VAV("ו", "Vav", false, false, 6, 0x05D5, 1493, "v"),
    ZAYIN("ז", "Zayin", false, false, 7, 0x05D6, 1494, "z"),
    HET("ח", "Het", true, false, 8, 0x05D7, 1495, "χ"),
    TET("ט", "Tet", false, false, 9, 0x05D8, 1496, "t"),
    YOD("י", "Yod", false, false, 10, 0x05D9, 1497, "j"),
    KAF("כ", "Kaf", false, false, 20, 0x05DB, 1499, "k"),
    FINAL_KAF("ך", "Final Kaf", false, true, 500, 0x05DA, 1498, "k"),
    LAMED("ל", "Lamed", false, false, 30, 0x05DC, 1500, "l"),
    MEM("מ", "Mem", false, false, 40, 0x05DE, 1502, "m"),
    FINAL_MEM("ם", "Final Mem", false, true, 600, 0x05DD, 1501, "m"),
    NUN("נ", "Nun", false, false, 50, 0x05E0, 1504, "n"),
    FINAL_NUN("ן", "Final Nun", false, true, 700, 0x05DF, 1503, "n"),
    SAMEKH("ס", "Samekh", false, false, 60, 0x05E1, 1505, "s"),
    AYIN("ע", "Ayin", true, false, 70, 0x05E2, 1506, "ʕ"),
    PE("פ", "Pe", false, false, 80, 0x05E4, 1508, "p"),
    FINAL_PE("ף", "Final Pe", false, true, 800, 0x05E3, 1507, "p"),
    TSADI("צ", "Tsadi", false, false, 90, 0x05E6, 1510, "ts"),
    FINAL_TSADI("ץ", "Final Tsadi", false, true, 900, 0x05E5, 1509, "ts"),
    QOF("ק", "Qof", false, false, 100, 0x05E7, 1511, "kʰ"),
    RESH("ר", "Resh", true, false, 200, 0x05E8, 1512, "ʁ"),
    SHIN("ש", "Shin", false, false, 300, 0x05E9, 1513, "ʃ"),
    TAV("ת", "Tav", false, false, 400, 0x05EA, 1514, "t");

    private final String symbol;        // Символ буквы
    private final String name;          // Название буквы
    private final boolean guttural;     // Гортанная буква?
    private final boolean finalForm;    // Конечная форма (софит)?
    private final int gematria;         // Числовое значение (гематрия)
    private final int unicodeHex;       // Шестнадцатеричный Unicode
    private final int unicodePoint;     // Точка Unicode
    private final String ipa;           // Международная фонетическая транскрипция (IPA)

    HebrewLetter(String symbol, String name, boolean guttural, boolean finalForm,
                 int gematria, int unicodeHex, int unicodePoint, String ipa) {
        this.symbol = symbol;
        this.name = name;
        this.guttural = guttural;
        this.finalForm = finalForm;
        this.gematria = gematria;
        this.unicodeHex = unicodeHex;
        this.unicodePoint = unicodePoint;
        this.ipa = ipa;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public boolean isGuttural() {
        return guttural;
    }

    public boolean isFinalForm() {
        return finalForm;
    }

    public int getGematria() {
        return gematria;
    }

    public String getUnicodeHex() {
        return String.format("U+%04X", unicodeHex);
    }

    public int getUnicodePoint() {
        return unicodePoint;
    }

    public String getIPA() {
        return ipa;
    }
}
