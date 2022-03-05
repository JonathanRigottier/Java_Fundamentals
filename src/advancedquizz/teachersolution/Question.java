package advancedquizz.teachersolution;

public class Question {
    public String text;        //For storing question
    public String[] answers;   //For storing answers
    public String rightAnswer; //For storing right answer

    public Question(String text, String... answers){
        this.text = text;
        this.answers = answers;
        this.rightAnswer = answers[0];

        for(int i = 0; i < answers.length; i++){
            int randomIndex = (int) (Math.random() * answers.length);
            String tmp = answers[i];
            answers[i] = answers[randomIndex];
            answers[randomIndex] = tmp;
        }
    }

    public Question(){

    }
}
