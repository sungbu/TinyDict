package net.hnjdzy.tinydict.entity;

import java.util.List;

public class WordPart {
    private String part;
    private List<String> means;

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public List<String> getMeans() {
        return means;
    }

    public void setMeans(List<String> means) {
        this.means = means;
    }
}
