package ua.ithlillel.dnipro.Cherednychenko;

public class Main {

    public static void main(String[] args) {

        String textForChecking = "The self-study lessons in this section are written and organised according to 10.128.17.14 " +
                "the levels of the Common European Framework of Reference " +
                "for languages (CEFR). There are different types of texts and interactive exercises that practise " +
                "the reading skills you need to do well in your studies, " +
                "to get ahead at work and 127.0.0.1 to communicate in English in your free time.\n" +
                "\n" + "Take our free online English test to find out which level to choose. Select your level, " +
                "from beginner (CEFR level A1) to advanced (CEFR level C1), " +
                "and improve your reading skills at your own speed, whenever it's convenient 10.130.24.1 for you.";

        String ipPattern = "^(((2[0-5]{2})|(1\\d{1,2})|(\\d{1,2})|(0)).){3}((2[0-5]{2})|(1\\d{1,2})|(\\d{1,2})|(0))$";
        PatternFounder founder = new PatternFounder(ipPattern);

        System.out.println(founder.getPatternFromText(textForChecking));

    }
}
