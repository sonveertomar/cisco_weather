package weather.util;

public class Util {
	public static String formatString(String strVal,String defaultVal){
        strVal=(strVal==null)?defaultVal:strVal.trim();
        return strVal;
    }
	public static int strToInt(String str,int defaultVal){
        int retVal=defaultVal;
        try{
            retVal=Integer.parseInt(str);
        }catch(Exception e){
            retVal=defaultVal;
        }
        return retVal;
    }
}
