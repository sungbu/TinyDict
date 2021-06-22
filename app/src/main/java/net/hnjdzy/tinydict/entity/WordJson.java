package net.hnjdzy.tinydict.entity;

import java.util.List;

public class WordJson {
    private String word_name;
    private int is_CRI;
    private WordExchange exchange;
    private List<WordSymbol> symbols;

    public String getWord_name() {
        return word_name;
    }

    public void setWord_name(String word_name) {
        this.word_name = word_name;
    }

    public int getIs_CRI() {
        return is_CRI;
    }

    public void setIs_CRI(int is_CRI) {
        this.is_CRI = is_CRI;
    }

    public WordExchange getExchange() {
        return exchange;
    }

    public void setExchange(WordExchange exchange) {
        this.exchange = exchange;
    }

    public List<WordSymbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<WordSymbol> symbols) {
        this.symbols = symbols;
    }
}
