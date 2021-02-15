package jp.ac.nitech.srmt.bot.logic;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;

import jp.ac.nitech.srmt.bot.model.ReplyModel;

public class Bot {

    private String language = null;

    public Bot(String language) {

        this.language = language;
    }


    public ReplyModel talk(String userId, String text) {

        // 返り値
        final var ret = new ReplyModel();

        // ここでボットの会話ロジックを記述していく。

        // 会話の解析
        final var tokenizer = new Tokenizer();
        final var tokens = tokenizer.tokenize(text);
        for (final Token token : tokens) {
            System.out.println(token.getSurface() + "\t" + token.getAllFeatures());
        }

        // 会話内容と結果をDBに保存

        // 返す会話を生成
        ret.setReply("そうですね。");

        return ret;

    }
}
