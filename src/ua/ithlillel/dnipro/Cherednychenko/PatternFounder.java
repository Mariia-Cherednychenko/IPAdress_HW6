package ua.ithlillel.dnipro.Cherednychenko;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFounder {
    Pattern pattern;

    public PatternFounder(String string) {
        this.pattern = pattern.compile(string);
    }

    public List<String> getPatternFromText(String text){
        List<String> ipInText=new ArrayList<>();
        String[] textArray=text.split("\\s+");

        Matcher matcher;
        for(String textPart : textArray ){
            if (pattern.matcher(textPart).matches()){
                ipInText.add(textPart);
            }
        }
        return ipInText;
    }
}
