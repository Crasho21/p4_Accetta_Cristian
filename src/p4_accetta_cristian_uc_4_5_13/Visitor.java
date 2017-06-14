package p4_accetta_cristian_uc_4_5_13;
/**
 * Interfaccia del pattern Visitor per implementare il Visitor
 * @author Accetta Cristian
 */
public interface Visitor{ 
    /**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param google AppStore specifico
     */
    public void visit(GoogleStore google);
    /**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param apple AppStore specifico
     */
    public void visit(AppleStore apple);
    /**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param win AppStore specifico
     */
    public void visit(WinStore win);
}