package my.crypter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cryptIt(View view) {
        EditText wordToCrypt = findViewById(R.id.getWordToCrypt);
        TextView cryptedWord = findViewById(R.id.cryptedWord);

        String text = wordToCrypt.getText().toString();

        String crypt = countNumChars(text);

        cryptedWord.setText(crypt);

    }

    String countNumChars (String text) {
        BuildString stringBuild = new BuildString();

        StringBuilder wordCrypt = new StringBuilder();

        String a="40", b="51", c="3", d="19", e="16", f="47", g="4", h="5", i="53", j="38", k="14", l="9", m="50", n="34", o="1", p="44", q="13", r="28", s="22", t="43", u="32", v="8", w="12", x="27", y="37", z="2", ä="25", ö="17";
        String A="6",  B="18", C="11", D="36", E="39", F="0", G="15", H="46", I="31", J="35", K="54", L="20", M="41", N="52", O="48", P="29", Q="21", R="49", S="30", T="4", U="45", V="33", W="26", X="24", Y="23", Z="42", Ä="10", Ö="7";

        for (char ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'b') {
                wordCrypt.append(ch);

            }
            else if (ch == 'b'){
                wordCrypt.append(b);
            }
        }

        return String.valueOf(wordCrypt);
    }
}
