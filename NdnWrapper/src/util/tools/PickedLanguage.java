package util.tools;

import util.enums.Language;

@SuppressWarnings("unused")
public class PickedLanguage {

    public static String getLanguage(Language language) {
        switch (language) {
            case Arabic:
                return "lang=ar";
            case Azerbaijani:
                return "lang=az";
            case Belarusian:
                return "lang=be";
            case Bulgarian:
                return "lang=bg";
            case Bosnian:
                return "lang=bs";
            case Catalan:
                return "lang=ca";
            case Czech:
                return "lang=cs";
            case Danish:
                return "lang=da";
            case German:
                return "lang=de";
            case Greek:
                return "lang=el";
            case English:
                return "lang=en";
            case Spanish:
                return "lang=es";
            case Estonian:
                return "lang=et";
            case Finnish:
                return "lang=fi";
            case French:
                return "lang=fr";
            case Hebrew:
                return "lang=he";
            case Croatian:
                return "lang=hr";
            case Hungarian:
                return "lang=hu";
            case Indonesian:
                return "lang=id";
            case Icelandic:
                return "lang=is";
            case Italian:
                return "lang=it";
            case Japanese:
                return "lang=ja";
            case Georgian:
                return "lang=ka";
            case Korean:
                return "lang=ko";
            case Cornish:
                return "lang=kw";
            case Latvian:
                return "lang=lv";
            case Norwegian:
                return "lang=nb";
            case Dutch:
                return "lang=nl";
            case Polish:
                return "lang=pl";
            case Portuguese:
                return "lang=pt";
            case Romanian:
                return "lang=ro";
            case Russian:
                return "lang=ru";
            case Slovak:
                return "lang=sk";
            case Slovenian:
                return "lang=sl";
            case Serbian:
                return "lang=sr";
            case Swedish:
                return "lang=sv";
            case Tetum:
                return "lang=tet";
            case Turkish:
                return "lang=tr";
            case Ukrainian:
                return "lang=uk";
            case Igpay_Atinlay:
                return "lang=x-pig-latin";
            case simplified_Chinese:
                return "lang=zh";
            case traditional_Chinese:
                return "lang=zh-tw";
            default:
                return "lang=en";
        }
    }
}
