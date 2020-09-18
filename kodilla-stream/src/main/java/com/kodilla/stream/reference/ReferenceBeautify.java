package com.kodilla.stream.reference;

    public class ReferenceBeautify {
        public static String addAbcBefore(String tekst) {
            return "ABC " + tekst;
        }
        public static String converTol33t(String tekst) {
            tekst = tekst.replace("e", "3");
            tekst = tekst.replace("a", "4");
            tekst = tekst.replace("t", "7");
            return  tekst;
        }
        public static String toLowercase(String tekst) {
            return tekst.toLowerCase();
        }
        public static String toUpperCase(String tekst) {
            tekst =  tekst.toUpperCase();
            return tekst;
        }
    }

