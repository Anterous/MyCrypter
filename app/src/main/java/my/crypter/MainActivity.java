package my.crypter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

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

    String countNumChars(String text) {
        BuildString stringBuild = new BuildString();

        int a = 40, b = 51, c = 3, d = 19, e = 16, f = 47, g = 4, h = 5, i = 53, j = 38, k = 14, l = 9, m = 50, n = 34, o = 1, p = 44, q = 13, r = 28, s = 22, t = 43, u = 32, v = 8, w = 12, x = 27, y = 37, z = 2, ä = 25, ö = 17;
        int A = 6, B = 18, C = 11, D = 36, E = 39, F = 0, G = 15, H = 46, I = 31, J = 35, K = 54, L = 20, M = 41, N = 52, O = 48, P = 29, Q = 21, R = 49, S = 30, T = 4, U = 45, V = 33, W = 26, X = 24, Y = 23, Z = 42, Ä = 10, Ö = 7;

        Map values = new HashMap();
        values.put("a", a);
        values.put("b", b);
        values.put("c", c);
        values.put("d", d);
        values.put("e", e);
        values.put("f", f);
        values.put("g", g);
        values.put("h", h);
        values.put("i", i);
        values.put("j", j);
        values.put("k", k);
        values.put("l", l);
        values.put("m", m);
        values.put("n", n);
        values.put("o", o);
        values.put("p", p);
        values.put("q", q);
        values.put("r", r);
        values.put("s", s);
        values.put("t", t);
        values.put("u", u);
        values.put("v", v);
        values.put("w", w);
        values.put("x", x);
        values.put("y", y);
        values.put("z", z);
        values.put("ä", ä);
        values.put("ö", ö);

        values.put("A", A);
        values.put("B", B);
        values.put("C", C);
        values.put("D", D);
        values.put("E", E);
        values.put("F", F);
        values.put("G", G);
        values.put("H", H);
        values.put("I", I);
        values.put("J", J);
        values.put("K", K);
        values.put("L", L);
        values.put("M", M);
        values.put("N", N);
        values.put("O", O);
        values.put("P", P);
        values.put("Q", Q);
        values.put("R", R);
        values.put("S", S);
        values.put("T", T);
        values.put("U", U);
        values.put("V", V);
        values.put("W", W);
        values.put("X", X);
        values.put("Y", Y);
        values.put("Z", Z);
        values.put("Ä", Ä);
        values.put("Ö", Ö);

        StringBuilder wordCrypt = new StringBuilder();


        for (char ch : text.toCharArray()) {
            for (Object key : values.keySet()) {
                String test = "" + ch;
                if (values.containsKey(test)) {
                    int secretMultiple = ((int) values.get(test)) * 4;
                    wordCrypt.append(secretMultiple);
                    break;
                }
            }
        }

        return String.valueOf(wordCrypt);
    }
}
