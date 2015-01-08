package ca.yorku.cse2311.tab2pdf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Before
    public void setUp() throws Exception {

        // Nothing to do here...

    }

    @After
    public void tearDown() throws Exception {

        // Nothing to do here...

    }

    @Test
    public void testCreatePdf() throws Exception {

        Path temp = Files.createTempFile(Main.FILENAME, Main.PDF_SUFFIX);
        new Main().createPdf(temp);

        // We will assume this test passes if the resulting File exists
        assertTrue(temp.toFile().exists());
    }
}