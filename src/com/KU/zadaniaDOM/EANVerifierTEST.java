package com.KU.zadaniaDOM;
/*
public class EANVerifierTEST {



    public static final EANVerifierTEST INSTANCE = new EANVerifierTEST();

    public EANVerifierTEST() {
        super();
    }

    private String calculateControlDigit(final String code) {
        int pares = 0;
        int impares = 0;
        for (int i = code.length(); i > 0; i--) {
            final String digit = code.substring(i - 1, i);
            if ((code.length() - i) % 2 == 0) {
                pares += Integer.parseInt(digit);
            } else {
                impares += Integer.parseInt(digit);
            }
        }

        int total = pares * 3 + impares;
        int check = 10 - (total % 10);
        if (check == 10){
            check = 0;
        }
        return Integer.toString(check);
    }

    public boolean isValidEAN8Code(final String code) {
        if (StringUtils.isEmpty(code)){
            return true;
        }
        boolean retVal = false;
        if (code.matches("\\d{8}")) {
            final String code1 = code.substring(0, 7);
            final String control = code.substring(7);
            retVal = calculateControlDigit(code1).equals(control);
        }
        return retVal;

    }

    public boolean isValidEAN13Code(final String code) {
        if (StringUtils.isEmpty(code)){
            return true;
        }
        boolean retVal = false;
        if (code.matches("\\d{13}")) {
            final String code1 = code.substring(0, 12);
            final String control = code.substring(12);
            retVal = calculateControlDigit(code1).equals(control);
        }
        return retVal;
    }

    public boolean isValid(final String code) {
        return isValidEAN8Code(code) || isValidEAN13Code(code);
    }

}

*/
