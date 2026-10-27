public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor(Gender.MALE, 174, "Zalupa", "Ishachya");
        Actor actor2 = new Actor(Gender.FEMALE, 150, "Глотка", "Глубокая");
        Actor actor3 = new Actor(Gender.MALE, 220, "Раб", "Чёрный");
        Director director1 = new Director(Gender.MALE, 162, "Хуй", "Важный", 0);
        Director director2 = new Director(Gender.FEMALE, 191, "Стремянка", "Несите", 9876467);
        MusicAuthor musicAuthor1 = new MusicAuthor(Gender.MALE, 182, "Неизвестность", "Ебаная");
        Choreographer choreographer1 = new Choreographer(Gender.FEMALE, 177, "Яйца", "Отрезанные");

        LibrettoText text0 = new LibrettoText("Хуй - соси, губой - тряси.");
        LibrettoText text00 = new LibrettoText("Плохому танцору яца мешают.");

        Show show = new Show("Не запивай огурцы молоком", 6.3, director1);
        Opera opera = new Opera(musicAuthor1, text0, "Путановы слёзы", 0.1, director1, 17);
        Ballet ballet = new Ballet(musicAuthor1, text00, "А что мешает вам?", 2.3, director2,
                choreographer1);

        //добавляем актёров в шоу
        show.addAnActor(actor1);
        show.addAnActor(actor2);
        show.addAnActor(actor1);
        System.out.println("-".repeat(120));
        //добавляем актёров в оперу
        opera.addAnActor(actor2);
        opera.addAnActor(actor3);
        opera.addAnActor(actor2);
        System.out.println("-".repeat(120));
        //добавляем актёров в баллет
        ballet.addAnActor(actor3);
        ballet.addAnActor(actor1);
        ballet.addAnActor(actor3);
        System.out.println("-".repeat(120));

        //выводим списки актёров
        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();
        System.out.println("-".repeat(120));

        //меняем актёра в баллете и выводим новый список актёров
        ballet.replaceActor(actor2, actor1.surname);
        ballet.printListOfActors();
        System.out.println("-".repeat(120));

        //меняем актёра в шоу на несуществующего актёра
        show.replaceActor(actor3, "Призрак");
        System.out.println("-".repeat(120));

        //выводи текс либретто для оперы и баллета
        System.out.println(opera.printLibrettoText());
        System.out.println("-".repeat(60));
        System.out.println(ballet.printLibrettoText());
        System.out.println("-".repeat(120));

    }
}
