package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.PositionType;
import static org.junit.Assert.*;

public class JobTest {
    Job firstJob;
    Job secondJob;
    Job thirdJob;
    Job thirdJobClone;

    @Before
    public void createJobObjects () {
        firstJob = new Job();
        secondJob = new Job();
        thirdJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        thirdJobClone = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(secondJob.getId(), firstJob.getId() + 1, .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(thirdJob instanceof Job);
        assertTrue(thirdJob.getEmployer() instanceof Employer);
        assertTrue(thirdJob.getLocation() instanceof Location);
        assertTrue(thirdJob.getPositionType() instanceof PositionType);
        assertTrue(thirdJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(thirdJob.getName(), "Product Tester");
        assertEquals(thirdJob.getEmployer().getValue(), "ACME");
        assertEquals(thirdJob.getLocation().getValue(), "Desert");
        assertEquals(thirdJob.getPositionType().getValue(), "Quality control");
        assertEquals(thirdJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(thirdJob == thirdJobClone);
    }
}
