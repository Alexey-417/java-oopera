public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor(Gender.MALE, 174, "Николай", "Просяной");
        Actor actor2 = new Actor(Gender.FEMALE, 150, "Лена", "Медная");
        Actor actor3 = new Actor(Gender.MALE, 220, "Иван", "Зубков");
        Actor actor4 = new Actor(Gender.MALE, 20, "Ив", "Зуб");
        Director director1 = new Director(Gender.MALE, 162, "Денис", "Кривой", 0);
        Director director2 = new Director(Gender.FEMALE, 191, "Юля", "Свинарёва", 9);
        MusicAuthor musicAuthor1 = new MusicAuthor(Gender.MALE, 182, "Руслан", "Головенько");
        Choreographer choreographer1 = new Choreographer(Gender.FEMALE, 177, "Анна", "Ивановна");

        LibrettoText text0 = new LibrettoText("(1-й куплет)\n" +
                "Петля, не отбирайте у меня мою петлю\n" +
                "Заря, никто не может перекрасить вновь зарю\n" +
                "Столы, наполнил ящики столов порноиздат\n" +
                "Столбы и перекладины, на них тела висят\n" +
                "\n" +
                "(2-й куплет)\n" +
                "Я взгляд, я вижу всё, но бесполезно говорить\n" +
                "Назад, в небытие, но каждый очень хочет жить\n" +
                "Чины, они любимые подонки у судьбы\n" +
                "Вины, они не знают никогда своей вины\n" +
                "\n" +
                "(3-й куплет)\n" +
                "Нога, ходить я в ногу отказался наотрез\n" +
                "Пурга, к рукам вспотевшим надолго примёрз обрез\n" +
                "Пытать, пустыми фразами пытать любой рассказ\n" +
                "Читать некрологи мне примелькалось много раз\n" +
                "\n" +
                "(4-й куплет)\n" +
                "Гореть, мы будем все гореть в аду, зато тепло\n" +
                "Жалеть, зачем жалеть всё то, что время унесло\n" +
                "Пенять, во всём всегда пенять лишь надо на себя\n" +
                "Принять, всё настоящее по-своему любя\n" +
                "\n" +
                "(5-й куплет)\n" +
                "Петля, меня раскачивает вверх и вниз петля\n" +
                "Сопля, повисла, сволочь, на моём носу сопля\n" +
                "Цветы, завяли все позавчера мои цветы\n" +
                "А ты чего орёшь, дурёха, среди пустоты\n" +
                "\n" +
                "(6-й куплет)\n" +
                "Ты жди, петля порвётся и к тебе я упаду\n" +
                "Дожди умыли все деревья в высохшем саду\n" +
                "Давно смеялся б я над выражением лица\n" +
                "Оно очень похоже у меня на мертвеца\n");

        LibrettoText text00 = new LibrettoText("Небо.\n" +
                "\n" +
                "Дорогу по реке Времени Принцу помогают пройти знаки Зодиака. И вот он у цели. Обессиленный,\n" +
                "он почти подползает к Авроре, тянется, чтобы поцеловать её. Но вдруг преградой перед ним возникает\n" +
                "зеркало. Дезире отшатывается, видя отображение дряхлого, немощного старика. Нет!\n" +
                "Таким он не может приблизиться к Авроре.\n" +
                "\n" +
                "Занавес.");

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

        /* выводим списки актёров
        В задании ничего не сказано о выводе режисёров:
        Внутри метода main вам нужно выполнить следующие действия:
        Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        Создать три спектакля: обычный, оперный и балет
        Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль. Один актёр может участвовать в нескольких спектаклях.

        !!!!Для каждого спектакля выведите на экран список актёров.!!!!

        Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        Попробуйте заменить в другом спектакле несуществующего актёра
        Для оперного и балетного спектакля выведите на экран текст либретто.
        На этом всё!
         */

        show.printListOfActors();
        show.printDirector();
        opera.printListOfActors();
        opera.printDirector();
        ballet.printListOfActors();
        ballet.printDirector();
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
