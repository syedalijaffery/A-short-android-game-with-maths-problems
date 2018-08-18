package com.example.mafia.quiz;

/**
 * Created by mafia on 19/12/2017.
 */

public class QuestionLibrary {
    private String mQuestions[] = {
            "Yo momma fat?",
            "Is yo momma fat?",
            "Yo mama super fat?",
            "Where is yo mama?",
            "Why you take that bottle?"

    };
    private String mChoices [] [] = {
            {"Yeah", "Yeah, very", "Yeah, I know"},
            {"I dunno, maybe", "Dunno, could be", "I think, i dunno"},
            {"I dunno, maybe", "She got like superpowered fat", "Well, she super"},
            {"In yo submarine", "maybe in yo submarine", "yo submarine"},
            {"cuz my momma fat", "cuz mama said", "mama didn't say so but still"}

};
    private String mCorrectAnswers [] = {
            "Yeah, I know", "I dunno, maybe", "She got like superpowered fat", "maybe in yo submarine", "cuz my momma fat"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a] [0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a] [1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices[a] [2];
        return choice2;
    }

    public String getCorrectAnsweres  (int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
