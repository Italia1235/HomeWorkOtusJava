 public class CreatorQuestion {
        static Answer[] forOne = {
                new Answer("1)1990"),
                new Answer("2)1992"),
                new Answer("3)1994")
        };
        static Answer[] forTwo = {
                new Answer("1)1834"),
                new Answer("2)1837"),
                new Answer("3)1845")
        };

        public static Question[] getQuestion() {
            Question[] arrayQuestion = {
                    new Question("В каком году умер Виктор цой?", forOne,0),
                    new Question("В каком году умер Александр Пушкин?", forTwo,1)
            };

            return arrayQuestion;

        }
    }


