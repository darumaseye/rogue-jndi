package artsploit;

public class RogueJndi {

    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n\n@veracode-research/rogue-jndi");
        }));
        Config.applyCmdArgs(args);
        HttpServer.start();
        LdapServer.start();
    }
}