package wp_post;

import org.openqa.selenium.chrome.ChromeDriver;



public class ReadDocUsingPOI {

    public static void main(String args[])  {
        
 
String content = "Access Report Details at: https://mywebsite.com";

    String[] splitted = content.split(" ");
    System.out.println(splitted);
    for (int i = 0; i < splitted.length; i++) {
        if ((splitted[i]).contains("http://")) { // use more statements for
                                                // http:// etc..
            System.out.println(splitted[i]); //just checking the output
            String link = "<a href=\"" + splitted[i] + "\">" + splitted[i] + "</a>";

            System.out.println(content.subSequence(0, 26)+link); //just checking the output
        }
          if ((splitted[i]).contains("https://")) { // use more statements for
                                                // http:// etc..
            System.out.println(splitted[i]); //just checking the output
            String link = "<a href=\"" + splitted[i] + "\">" + splitted[i] + "</a>";

            System.out.println(content.subSequence(0, 26)+link); //just checking the output
        }
    }
    }
}
