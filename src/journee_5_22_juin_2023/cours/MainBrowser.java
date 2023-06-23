package journee_5_22_juin_2023.cours;

public class MainBrowser {
    public static void main(String[] args) {
        Browser browser=new Browser();

//        String ip=browser.findIpAddress("http://m2iformation.fr");
//        browser.sendHttpRequest(ip);
        browser.navigate("http://m2iformation.fr");
    }
}
