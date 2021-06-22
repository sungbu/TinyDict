package net.hnjdzy.tinydict.entity;

import java.util.List;

public class WordSymbol {
    private String ph_en;
    private String ph_en_mp3;
    private String ph_other;
    private List<WordPart> parts;

    public String getPh_en() {
        return ph_en;
    }

    public void setPh_en(String ph_en) {
        this.ph_en = ph_en;
    }

    public String getPh_en_mp3() {
        return ph_en_mp3;
    }

    public void setPh_en_mp3(String ph_en_mp3) {
        this.ph_en_mp3 = ph_en_mp3;
    }

    public String getPh_other() {
        return ph_other;
    }

    public void setPh_other(String ph_other) {
        this.ph_other = ph_other;
    }

    public List<WordPart> getParts() {
        return parts;
    }

    public void setParts(List<WordPart> parts) {
        this.parts = parts;
    }
}
