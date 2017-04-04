package com.AE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        String string = "I am a string, Yes, I am";
//        System.out.println(string);
//        String yourString = string.replaceAll("i", "u");
//        System.out.println(yourString);
//
//        String alphanumeric = "abcDEEjfiejfosj99302";
//        System.out.println(alphanumeric.replaceAll(".", "Y"));
//        System.out.println(alphanumeric.replaceAll("^abcDEE", "YYY"));
//        System.out.println(alphanumeric.matches("^hello"));
//        System.out.println(alphanumeric.matches("^abcDEE"));
//        System.out.println(alphanumeric.matches("^abcDEEjfiejfosj99302"));
//
//        System.out.println(alphanumeric.replaceAll("j99302$", "The End"));
//        System.out.println(alphanumeric.replaceAll("[aei]]", "X"));
//        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced the letter here"));
//        System.out.println(alphanumeric.replaceAll("[aei][FJ]", "X"));
//
//        System.out.println(alphanumeric.replaceAll("^abcDEE", "YYY"));
//
//        String thirdAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}", "YYY"));
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
//        System.out.println(thirdAlphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>"; //any before and after
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        matcher.reset();

//        int count = 0;
//
//        while (matcher.find()){
//            count++;
//            System.out.println("Occurance " + count + " : " + matcher.start() + " to " + matcher.end());
//        }
        //use lazy quantifier to just get <h2> tags
//        String h2GroupPattern = "(<h2>.*?</h2>)";
//        Pattern groupPattern = Pattern.compile(h2GroupPattern);
//        Matcher groupMatcher = groupPattern.matcher(htmlText);
//        System.out.println(groupMatcher.matches());
//        groupMatcher.reset();
//
//        while(groupMatcher.find()){
//            System.out.println("Occurence: " + groupMatcher.group(1));
//        }
//
        String h2TextGroups = "(<h2>)(.+?)(</h2>)"; // group 0 is entire patter, group 1 is <h2>, group 2 is in between, group 3 is </h2>
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }
        //[[Hh]arry
//        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
//        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));
//
//        // [^abc]
//        String tvtest = "tstvtkt";
//       // String tNotVRegExp = "t[^v]";//t must follow any character
//        String tNotVRegExp = "t(?!v)"; //? is look ahead
//        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
//        Matcher tNotMatcher = tNotVPattern.matcher(tvtest);
//
//        count = 0;
//
//        while (tNotMatcher.find()){
//            count++;
//            System.out.println("Ocurrance " + count + " : " + tNotMatcher.start() +
//            " to " + tNotMatcher.end());
//
//        }
//
//        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
//        String phone1 = "1234567890"; // shouldn't match
//        String phone2 = "(123) 456-7890";
//        String phone3 = "123 456-7890";
//        String phone4 = "(123)456-7890";
//
//        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$") );
//        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
//        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
//        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
//
//        // ^4[0-9]{12}([0-9]{3})?$
//
//        String visa1 = "4444444444444"; // should match
//        String visa2 = "5444444444444"; // shouldn't match
//        String visa3 = "4444444444444444";  // should match
//        String visa4 = "4444";  // shouldn't match
//
//        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
//        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
//        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
//        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));





    }
}
