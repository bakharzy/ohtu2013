/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author bakharzy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ohtuesimerkki.StatisticsTest.class, ohtuesimerkki.ReaderTest.class, ohtuesimerkki.PlayerTest.class, ohtuesimerkki.MainTest.class, ohtuesimerkki.PlayerReaderTest.class})
public class OhtuesimerkkiSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
