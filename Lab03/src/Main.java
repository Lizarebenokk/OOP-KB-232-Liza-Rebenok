public class Main {
    public static void main(String[] args) {
        Sprint sprint = new Sprint(15, 5);
        
        //
        UserStory us1 = new UserStory(1, "Авторизація", 5);
        UserStory us2 = new UserStory(2, "Особистий кабінет", 4, new UserStory[]{us1});
        UserStory us3 = new UserStory(3, "Надто великий функціонал", 10);
        

        //
        System.out.println("Додаємо US в спринт:");
        System.out.println(us1 + ": " + sprint.addUserStory(us1));  // true
        System.out.println(us2 + ": " + sprint.addUserStory(us2));  // true
        System.out.println(us3 + ": " + sprint.addUserStory(us3));  // false 
        

        //
        us2.complete();
        System.out.println("\nСпроба завершити US2 (без завершення US1):");
        System.out.println("US2 завершено: " + us2.isCompleted());  // false
        

        //
        us1.complete();
        us2.complete();
        System.out.println("\nЗавершуємо US1, потім US2:");
        System.out.println("US1 завершено: " + us1.isCompleted());  // true
        System.out.println("US2 завершено: " + us2.isCompleted());  // true
        

        //
        Bug bug1 = Bug.createBug(4, "Помилка в авторизації", 2, us1);
        Bug bug2 = Bug.createBug(5, "Помилка для незавершеної історії", 1, new UserStory(6, "Незавершена", 1));
        

        System.out.println("\nСтворення багів:");
        System.out.println("Баг для завершеної US: " + bug1);  // [Bug 4] Авторизація: Помилка в авторизації
        System.out.println("Баг для незавершеної US: " + bug2);  // null
        

        //
        System.out.println("\nДодаємо баг у спринт: " + sprint.addBug(bug1));  // true
        

        //
        UserStory us4 = new UserStory(7, "Функціонал 1", 1);
        UserStory us5 = new UserStory(8, "Функціонал 2", 1);
        UserStory us6 = new UserStory(9, "Функціонал 3", 1);
        
        System.out.println("\nЗаповнюємо до ліміту:");
        System.out.println(us4 + ": " + sprint.addUserStory(us4));  // true
        System.out.println(us5 + ": " + sprint.addUserStory(us5));  // true
        System.out.println(us6 + ": " + sprint.addUserStory(us6));  // false
        

        //
        System.out.println("\nПідсумки:");
        System.out.println("Загальна оцінка спринту: " + sprint.getTotalEstimate() + " годин");
        System.out.println("Кількість тікетів: " + sprint.getTickets().length);
    }
}