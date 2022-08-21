public class Question {
    private final String text;
    private final Answer []answers;
    private final int right;
    private UserInput input = new ConsoleUserInput();
    public Question(String text,Answer[]answer,int right){
        this.text = text;
        this.answers = answer;
        this.right = right;
    }
    public String getText() {
        return text;
    }
    public Answer[] getAnswers() {
        return answers;
    }
    public boolean run (){
        System.out.println(text);
        for(Answer answer : answers){
            System.out.println(answer.getText());
        }
      int resultAnswer =  new ConsoleUserInput().validatorAnswerUser(answers.length);
        return resultAnswer == right+1;
    }
}
