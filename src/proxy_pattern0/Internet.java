package proxy_pattern0;

import java.util.ArrayList;

public interface Internet {
    public void connectTo(String host);
}

class RealInternet implements Internet{
    @Override
    public void connectTo(String host) {
        System.out.println("Connecting To "+ host);
    }
}

class ProxyInternet implements Internet{

    private Internet internet= new RealInternet();
    private  ArrayList<String> bannedHost;

    {
        bannedHost = new ArrayList<>();
        bannedHost.add("abc.com");
        bannedHost.add("aaa.com");
        bannedHost.add("xxx.com");
        bannedHost.add("xyz.com");
    }

    @Override
    public void connectTo(String host){
        if (bannedHost.contains(host)){
            System.out.println("Access denied...");
        }
        else internet.connectTo(host);
    }
}


class InternetProxyMain{
    public static void main(String[] args){
        Internet internet= new ProxyInternet();
        internet.connectTo("xxx.com");
        internet.connectTo("joybangla.com");
    }
}
