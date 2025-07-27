public class PunctuationRemovingFromString{
    public static void main(String[] args) {
        String complexString = "Hello, Pranil! Do you love coding (Java) or Python? [Both] are great. {Practice} daily: it improves skills; always keep learning. \"Never give up!\" - said @mentor. Use hashtags #Code #Java. Earn $1000 & grow 20%. Success = HardWork + Consistency. <Start Now> / Don't wait \\ Act. Stay strong | Stay focused ~ Keep pushing!";
        
        String newString=complexString.replaceAll("[\\p{Punct}]","");
        System.out.println("String is "+newString);
    }
}
