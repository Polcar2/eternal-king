package game.events;

public class customevents {

    private static String CUSTOM_EVENTS[][] = new String[][] {
            //Персонаж, Описание, Выбор 1, Выбор 2, Параметр 1, Параметр 2, Влияние 1, Влияние 2, УникКлючЗависим, ВыбАктиватор, Порядок
            {"DEFAULT",
             "Милорд, к вам пожаловал старейшина из деревни Хиптом, что принадлежит нашему королевству. Он требует, чтобы вы уменьшили сборы налогов с их деревни.",
                    "Вышвырнуть его из дворца, чтобы и духа его не видать тут было!",
                    "Хорошо, я приму его предложение, но попозже.",
                    "SOCIETY", "SOCIETY", // Если два параметра одинаковы, то влияние 1 применяется к параметру в случае выбора 1, а влияние 2 применяется к параметру в случае выбора 2
                    "-12", "19",    // Если два параметра разные, то влияние 1 применяется к параметру 1 и влияние 2 применяется к параметру 2 в случае выбора 1, и наоборот в случае выбора 2.
                    "NULL", "NULL", "1"},
            {"DEFAULT",
            "К нам опять прибежал какой-то старик, говорит, у него есть какое-то послание. Не хотите взглянуть, милорд?",
                    "Давайте поглядим, приведите его сюда.",
                    "Пусть идет своей дорогой, у меня много дел.",
                    "SOCIETY", "SOCIETY",
                    "0", "-10",
                    "qwe1", "1", "1"},
            {"Cтарик",
             "О, ваше первосвятейшество $KING, я прибыл с посланием: /n /n \"На севере нашей страны бушует мятеж. Голодные воины из девятнадцатого лагеря у крепости Суммит хотят вас предать и напасть на нашу столицу. Нужно срочно выдвигать войска!\"",
                    "Ты шутишь чтоли? Это же мои самые верные и лучшие воины. Я им полностью доверяю.",
                    "Хорошо, я сейчас же отправлю армию на подавление мятежа.",
                    "ARMY", "ARMY",
                    "+20", "-15",
                    "qwe1", "NULL", "2"},
            {"DEFAULT",
             "Ваше превосходительство, у нас случился пожар! Горят крестьянские лачуги на окраине. Что делать, ваше превосходительство?",
                    "Быстро... Тушите!!!",
                    "Да ничего не делайте, эти отбросы заслужили свое, доигрались с огнем.",
                    "SOCIETY", "SOCIETY",
                    "-12", "12",
                    "NULL", "NULL", "1"},
            {"DEFAULT",
             "М-милорд, тут наш порог топчет какой-то клоун уже продолжительное время, может быть его впустить к нам?",
                    "Да, валяйте, хоть посмеюсь.",
                    "Вызовите охрану, пусть она им займется.",
                    "SOCIETY", "SOCIETY",
                    "-5", "5",
                    "NULL", "NULL", "1"},
            {"Неизвестный",
             "Король, это ты король?",
                    "Ты кто такой, эй, где охрана?!",
                    "Да, я, тебе что-то нужно?.",
                    "SOCIETY", "SOCIETY",
                    "-5", "0",
                    "qwa1", "2", "1"},
            {"Неизвестный",
             "Я могу дать тебе шанс искупить свои грехи. Назначь меня министром финансов королевства, и ты не пожалеешь о своем выборе.",
                    "Кто его сюда впустил?!",
                    "О, ты тот, кто нам нужен. Идет.",
                    "SOCIETY", "SOCIETY",
                    "0", "-10",
                    "qwa1", "NULL", "2"},
            {"DEFAULT",
             "Милорд, к вам пришел священнослужитель из соседнего государства, у него есть дело.",
                    "Хорошо, пусть войдет, выслушаю.",
                    "Не подпускайте их ко мне!",
                    "RELIGION", "RELIGION",
                    "0", "-10",
                    "qws1", "1", "1"},
            {"Священнослужитель",
             "Я слышал ваш народ не настолько духовен, как наш. Могу предложить вам построить нашу церковь на территории вашей столицы. Люди будут счастливы.",
                    "Я приму ваше предложение!",
                    "Хватит тут церквей, их итак много.",
                    "RELIGION", "SOCIETY",
                    "20", "10",
                    "qws1", "NULL", "2"},
            {"DEFAULT",
             "Милорд, к вам пожаловал очередной чужестранец, как с ним поступить?",
                    "Выгоните его на улицу!",
                    "Пусть заходит к нам, поможем, если он захочет.",
                    "SOCIETY", "SOCIETY",
                    "-5", "5",
                    "NULL", "NULL", "1"},
            {"DEFAULT",
             "Ваше святейшество, наши казармы были уничтожены, что прикажете сделать?.",
                    "Восстановить казармы! Найдите виновных!",
                    "Пока ничего не делайте, это слишком дорого для нас.",
                    "SOCIETY", "ARMY",
                    "-10", "15",
                    "NULL", "NULL", "1"},

    };

    public static String[] getEvent(int id) {
        return CUSTOM_EVENTS[id];
    }
    public static String[] getEvent(String descr) {
        for (int i=0;i<=CUSTOM_EVENTS.length-1;i++) {
            if (descr.equals(CUSTOM_EVENTS[i][1])) {
                return CUSTOM_EVENTS[i];
            }
        }
        return null;
    }

}
