package com.londonappbrewery.quizzler;

public class TrueFalse {

    private int QuestionID;
    private boolean Answer;

    public int getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(int mQuestionID) {
        this.QuestionID = mQuestionID;
    }

    public boolean getAnswer() {
        return Answer;
    }

    public void isAnswer(boolean mAnswer) {
        this.Answer = mAnswer;
    }

    public TrueFalse(int questionID,boolean answer)
    {
        QuestionID = questionID;
        Answer = answer;
    }


}
