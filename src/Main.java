public class Main {
    public static void main(String[] args) {


        human human = new human("Максим", 1987, "Минск", "бренд-менеджером");
        human human1 = new human("Аня", 1993, "Москва", "методистом образовательных программ");
        human human2 = new human("Катя", 1994, "Калининград", "продакт-менеджером");
        human human3 = new human("Артем", 1995, "Москва", "директором по развитию бизнеса");
        human human4 = new human("Владимир", 2001, "Казань", null);

        printInfo(human);
        printInfo(human1);
        printInfo(human2);
        printInfo(human3);
        printInfo(human4);
    }

    private static void printInfo(human human){
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.job + ". Будем знакомы!");
    }
}