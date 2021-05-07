package GlobalWarmingQuiz;

public class FactQuiz {

    public String displayQuestionOne = """
            1.____ is a data type.
             A. int
             B. dave
             C. semicolon
             D. vue
                  """;

       public String displayQuestionTwo = """
         
            2.____ is a data type.
             A. int
             B. dave
             C. semicolon
             D. vue
              """;

      public String displayQuestionThree = """
            3.____ is a data type.
             A. int
             B. dave
             C. semicolon
             D. vue
              """;

    public String displayQuestionFour = """
            4.____ is a data type.
             A. int
             B. dave
             C. semicolon
             D. vue
              """;

    public String displayQuestionFive = """
            5.____ is a data type.
             A. int
             B. dave
             C. semicolon
             D. vue
              """;
    public String displayScore(int score){
        String actualScore = "";
        if (score == 5){
            actualScore = "Excellent";
        }else if (score == 4){
            actualScore = "very Good";
        }else if (score < 3){
           actualScore = "time to brush up";
        }
    return actualScore;

    }
}
