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
        StringBuilder wordCrypt = new StringBuilder();

        String a = "40",b = "30";

        for (char c : text.toCharArray()) {
            if (c == 'a') {
                wordCrypt.append(a);

            }
            else if (c == 'b'){
                wordCrypt.append(b);
            }
        }

        return String.valueOf(wordCrypt);
    }
}
