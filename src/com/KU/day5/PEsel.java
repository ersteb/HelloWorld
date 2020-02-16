package com.KU.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PEsel {

    public static void main(String[] args) {


            //account
            //account2
/*
            Pattern pattern = Pattern.compile("\\d{11}");
            Matcher account = pattern.matcher("89786712345");

            if(account.matches()){
                System.out.println("tak pasuje");
            }
            else{
                System.out.println("nie pasuje");
            }
        }
        */

/*
        Pattern pattern = Pattern.compile("[abc]{3}\\d{11}");
        Matcher account = pattern.matcher("abc89786712345");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }

        */
/*
//zabawa 3:
        Pattern pattern = Pattern.compile("[A-L]{3}\\d{11}");
        Matcher account = pattern.matcher("ZBA89786712345");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }

        */
/*
// zabawa 4: sprawdzanie kierunkowego:

        Pattern pattern = Pattern.compile("\\+\\d{1,3}");
        Matcher account = pattern.matcher("+9987");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }
        */
// zadanie 5:
/*
       // String napis="\\"; //

        // napisac pattern by sprawdzić czy format zapisu pasuje do następującego: 01.02.2020

        Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");
        Matcher account = pattern.matcher("01.01.2020");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }

*/

//zadanie 6:
        //konkretne cyfry dla miesiąca
//ale chyba nie działa, sprawdzić!!
/*
        Pattern pattern = Pattern.compile("[0-3][0-9]\\.[0-1][0-2]}\\.\\d{4}");
        Matcher account = pattern.matcher("01.01.2020");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }

        */

//zadanie 7:

        /*

        //dopasować regex do universal unique identifier
        // 8-4-4-4-12
        //system szesnastkowy leci od 0-F
        //przykład poprawnego ID: 123e4567 - e89b - 12d3 - a456 - 323432343236

        Pattern pattern = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
        //Pattern pattern = Pattern.compile("[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}");
        Matcher account = pattern.matcher("123e4567-e89b-12d3-a456-323432343236");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }


        */

        //zadanie 8: hasło musi zawierać:

        //co najmniej jedną literkę małą
        //co najmniej jedną literke wielką
        //co najmniej jedną cyfrę
        //co najmniej jeden znak specjalny (!@#$%^&*_)
        // miec długość co najmiej 14


        /*
        Pattern pattern = Pattern.compile("[a-zA-Z0-9!@#$%^&*_]{14,}"); //ale to jest "LUB", byle który z tych znaków musi się pojawić
        Matcher account = pattern.matcher("123F4567ope89b#");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }

        */

        // zadanie 8 - lepsza wersja:
/*
        String password = "asd&FGH*eee89001";      Pattern lowerCaseLetters = Pattern.compile("[a-z]+");
        Matcher lowerCaseLettersMatcher = lowerCaseLetters.matcher(password);
        Pattern upperCaseLetters = Pattern.compile("[A-Z]+");
        Matcher upperCaseLettersMatcher = upperCaseLetters.matcher(password);
        Pattern numbers = Pattern.compile("[0-9]+");
        Matcher numbersMatcher = numbers.matcher(password);
        Pattern specials = Pattern.compile("[!@#$%^&*_]+");
        Matcher specialsMatcher = specials.matcher(password);
        Pattern length = Pattern.compile(".{14,}");
        Matcher lengthMatcher = length.matcher(password);      if (lowerCaseLettersMatcher.find() &&
                upperCaseLettersMatcher.find() &&
                numbersMatcher.find() &&
                specialsMatcher.find() &&
                lengthMatcher.find()) {
            System.out.println("Hasło jest poprawne!!!");
        } else {
            System.out.println("Niepoprawne hasło");
        }

        */

//zadanie 9: metoda FIND:

/*
        Pattern pattern = Pattern.compile("[\\d]{3}");
        Matcher account = pattern.matcher("123F4567ope89b#");

        while(account.find()){ //konstruktor find szuka konkretnego wzorca
            System.out.println(account.group()); //konstruktor group pozwala wzorzec pobrać
        }
*/
     //   Pattern pattern = Pattern.compile("[a-zA-Z]{5,5}");
        Pattern pattern = Pattern.compile("\\s\\w{5}[\\s,.]");
        Matcher account = pattern.matcher(WORDS);

       // while(account.find()){
       //     System.out.println(account.group());
       // }

        int count =0;
        while(account.find()){
            count++;
            System.out.println(account.group());
        }
        System.out.println(count);

        //wciśnij ctrl F - możesz szukać po REGEXie



    }

    private static String WORDS = "\n" +
            "\n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ac sapien lorem. Nullam convallis neque quam, ac lacinia est aliquam id. Vivamus viverra enim nulla, a aliquam mi semper feugiat. Duis posuere orci id hendrerit vestibulum. Suspendisse potenti. Curabitur vel ex rutrum, volutpat est et, semper nisi. Suspendisse vitae laoreet tellus, faucibus molestie tortor. Quisque tortor risus, pharetra vel erat sit amet, euismod vestibulum neque. Aliquam enim mauris, fringilla lacinia tincidunt dapibus, maximus eleifend metus. Ut dictum elit nunc, eget hendrerit ex semper non.\n" +
            "\n" +
            "Proin diam risus, viverra at rutrum at, consectetur id eros. Maecenas viverra id justo at bibendum. Sed eu molestie libero. Etiam in nunc felis. Etiam eget velit diam. Donec sed nulla quis tellus malesuada condimentum. Donec semper fringilla nibh, a egestas odio porttitor id. Maecenas vel viverra est. Donec interdum lectus at augue finibus dictum. Fusce id lacus ut diam vehicula accumsan eu vitae elit. Cras tristique, tortor nec tincidunt dictum, leo risus condimentum lectus, at varius dolor ante sit amet augue. Suspendisse ultricies purus dignissim sapien facilisis, nec accumsan neque molestie.\n" +
            "\n" +
            "Proin a leo tortor. Nullam vel ligula quis urna elementum ullamcorper. Nam a risus blandit, faucibus enim non, ultrices enim. Curabitur ac velit quam. Pellentesque non turpis eros. Quisque non lectus eros. Sed ex eros, aliquam vel mauris non, malesuada laoreet mi.\n" +
            "\n" +
            "Donec venenatis sollicitudin efficitur. Morbi dictum placerat tellus, ac aliquet tellus ultrices sed. Praesent feugiat metus et lobortis dignissim. Sed eleifend id sapien ut cursus. Sed velit tellus, molestie eu tristique ac, tristique ac justo. Mauris sed massa tortor. Nam porttitor nisl quis neque cursus convallis. Nunc nisl lectus, feugiat sed sem ac, ultrices scelerisque turpis. Aliquam tincidunt bibendum dui euismod tempus. Aenean in molestie nibh, sed luctus libero. Nunc eget tincidunt nisl. Pellentesque et porta nibh, sed mattis dolor. Duis id faucibus turpis, ac convallis ipsum.\n" +
            "\n" +
            "Sed efficitur leo turpis, nec lobortis dolor auctor a. Suspendisse nec consequat libero. Praesent vehicula varius dolor, id scelerisque dui consequat quis. Quisque vel tempor augue, ac ornare elit. Curabitur bibendum ullamcorper mi, ut ultricies ex faucibus vel. Vestibulum consectetur consectetur nisl, non semper velit eleifend a. Duis nec bibendum lacus. Sed massa nulla, ultrices commodo tristique at, convallis sed risus. Sed aliquam elit vel justo rutrum aliquam. Mauris vel neque ultrices, ornare dolor ac, placerat velit. Phasellus auctor semper mattis. Maecenas eleifend dolor vel rhoncus fermentum. Donec tellus felis, tempus id eros ut, condimentum auctor nibh. In hac habitasse platea dictumst. Ut viverra lacinia venenatis. Donec posuere est et orci egestas, in venenatis nisl commodo.";
    }
