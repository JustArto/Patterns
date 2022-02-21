public class AbstractFactoryLesson {
    public static void main(String[] args ){
        Factory<Factory> aFactory = new AbstractFactory();
        Factory<IQuest> questFactory = aFactory.create("quest");
        Factory<IQuiz> quizFactory = aFactory.create("quiz");

        IQuest qut = questFactory.create("quest");
        IQuest qet = questFactory.create("qeest");

        IQuiz qui = quizFactory.create("quiz");
        IQuiz que = quizFactory.create("ques");


        qut.sayTarget();
        qet.sayTarget();

        qui.sayTarget();
        que.sayTarget();
    }
}
interface IQuest {
    void sayTarget();
}

class Quest implements IQuest {
    public void sayTarget() {
        System.out.println("quest");
    }
}

class Qeest implements IQuest {
    public void sayTarget() {
        System.out.println("qeest");
    }
}

class QuestFactory implements Factory {
    public IQuest create(String type) {
        switch (type) {
            case "quest": return new Quest();
            case "qeest": return new Qeest();
            default: return null;
        }
    }
}

interface IQuiz {
    void sayTarget();
}

class Quiz implements IQuiz {
    public void sayTarget() {
        System.out.println("quiz");
    }
}

class Ques implements IQuiz {
    public void sayTarget() {
        System.out.println("ques");
    }
}

class QuizFactory implements Factory {
    public IQuiz create(String type) {
        switch (type) {
            case "quiz": return new Quiz();
            case "ques": return new Ques();
            default: return null;
        }
    }
}

interface Factory<T> {
    T create(String type);
}

class AbstractFactory implements Factory {
    public Factory create(String type) {
        switch (type) {
            case "quiz" : return new QuizFactory();
            case "quest" : return new QuestFactory();
            default: return null;
        }
    }
}
