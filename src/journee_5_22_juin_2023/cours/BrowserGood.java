package journee_5_22_juin_2023.cours;

public class BrowserGood {
    // -> ecrire l'url dans le barre d'url
    // -> trouver l'adresse correspondant au nom de domaine
    // -> Envoyer la requete

    public void navigate(String url){
        String ip=findIpAddress(url);
        String html=sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip){
        return "<html><head></head><body><h1>Welcome</h1></body></html>";
    }


    private String findIpAddress(String url){
        return "127.0.0.1";
    }
}
