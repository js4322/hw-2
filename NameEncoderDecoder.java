public class NameEncoderDecoder
{
   private boolean doesNotContainsDigit(String str)
  {
        return ! (str.contains("0") &&
                str.contains("1") &&
                str.contains("2") &&
                str.contains("3") &&
                str.contains("4") &&
                str.contains("5") &&
                str.contains("6") &&
                str.contains("7") &&
                str.contains("8") &&
                str.contains("9"));
  }
    public String encode(String name)
  {
        if(doesNotContainsDigit(name))
          return "NOTFORYOU" + name.replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5") + "YESNOTFORYOU";
        else
          return "Message was not encrypted";
  }
    public String decode(String name)
  {
      String uName = name.substring(9, name.length()-12);
        return uName.replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a");
  }
}