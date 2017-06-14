package p4_accetta_cristian_uc_4_5_13;
/**
 * Interfaccia del pattern Visitor per implementare gli AppStore suportati
 * @author Accetta Cristian
 */
public interface ElementAppStore{
    /**
     * Funzione accept del Visitor
     *
     * @param visitor Il Visitor
     */
    public void accept(Visitor visitor);
}