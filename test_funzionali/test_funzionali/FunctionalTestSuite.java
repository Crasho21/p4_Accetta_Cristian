package test_funzionali;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * Test suite per i test funzionali
 * @author Accetta Cristian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AggregazioneDatiGoogleTest.class, AggregazioneDatiGoogleWindowsTest.class, AggregazioneDatiWindowsTest.class, 
						CancellazioneGruppoTest.class, CreazioneGruppoTest.class})
public class FunctionalTestSuite {

}
