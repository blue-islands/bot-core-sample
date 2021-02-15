package jp.ac.nitech.srmt.bot;

import jp.ac.nitech.srmt.bot.logic.Bot;

public class Main {

    public static void main(String[] args) {

        final var language = "ja";
        final var userId = "token";
        final var text = "今日はいい天気ですね。";

        final var bot = new Bot(language);

        final var reply = bot.talk( userId,  text);

        System.out.println(reply);
    }

}
