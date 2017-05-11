package domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PuntTest.class, SpelerTest.class, CirkelTest.class, RechthoekTest.class, LijnStukTest.class, HintLetterTest.class,
	HintWoordTest.class, OmhullendeTest.class, TekeningTest.class, Driehoek.class})
public class AllTests {

}
