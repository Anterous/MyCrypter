package my.crypter;

import android.util.Pair;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildString {

        public String buildString(String second){

            String a="40", b="51", c="3", d="19", e="16", f="47", g="4", h="5", i="53", j="38", k="14", l="9", m="50", n="34", o="1", p="44", q="13", r="28", s="22", t="43", u="32", v="8", w="12", x="27", y="37", z="2", ä="25", ö="17";
            String A="6",  B="18", C="11", D="36", E="39", F="0", G="15", H="46", I="31", J="35", K="54", L="20", M="41", N="52", O="48", P="29", Q="21", R="49", S="30", T="4", U="45", V="33", W="26", X="24", Y="23", Z="42", Ä="10", Ö="7";


            HashMap<String, Integer> hmap = new HashMap<String, Integer>();


            hmap.put("a", 40);
            hmap.put("b", 51);
            hmap.put("c", 3);
            hmap.put("d",19);
            hmap.put("e",16);
            /*hmap.put("f",f);
            hmap.put("g",g);
            hmap.put("h",h);
            hmap.put("i",i);
            hmap.put("j",j);
            hmap.put("k",k);
            hmap.put("l",l);
            hmap.put("m",m);
            hmap.put("n",n);*/


            String var= String.valueOf(hmap.get(2));

            return var;


        }
}
