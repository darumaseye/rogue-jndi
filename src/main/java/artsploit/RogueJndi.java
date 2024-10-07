package artsploit;

public class RogueJndi {

    public static void main(String[] args) throws Exception {

        Config.applyCmdArgs(args);
        HttpServer.start();
        LdapServer.start();
        System.out.println("\n\n@veracode-research/rogue-jndi");
    }
}