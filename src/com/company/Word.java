package com.company;

import java.util.ArrayList;

public class Word implements Dictionary{
    private String word_target;
    private String word_explain;

    public void setWord_target(String word_target){
        this.word_target = word_target;
    }
    public void setWord_explain(String word_explain){
        this.word_explain = word_explain;
    }
    public String getWord_target(){
        return word_target;
    }
    public String getWord_explain(){
        return word_explain;
    }
    @Override
    public Object[] toObject(){
        return new Object[]{
                this.getWord_target(), this.getWord_explain()
        };
    }
}
