package za.ac.cput.school_management.helper;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 */

import org.junit.platform.commons.util.StringUtils;

public class StringHelper {
    public static boolean isEmptyOrnull(String str){ return StringUtils.isBlank(str);}

    public static String setEmptyIfNull(String str){
        if (isEmptyOrnull(str)) return "";
        return  str;
    }
    public static void checkStringParam(String paramName, String paramValue){
        if(isEmptyOrnull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid format for param: %s", paramName));
    }
}
