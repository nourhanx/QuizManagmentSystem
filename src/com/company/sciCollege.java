package com.company;

import java.util.ArrayList;
import java.util.List;

public class sciCollege implements Quistions {
    ArrayList<String> questions = new ArrayList<String>();


    public sciCollege() {
        this.questions = questions;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }


    public ArrayList<String> creatQ() {
        questions.add("What does DNA stand for?");
        questions.add("How many bones are in the human body?");
        questions.add("The concept of gravity was discovered by which famous physicist?\n");
        questions.add("What is the hardest natural substance on Earth?\n");
        questions.add("Which is the main gas that makes up the Earth’s atmosphere?\n");
        return questions;
    }
}


