package com.example.roboticsteammanagement.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticsTeamTest {
    @Test
    public void shouldCreateRoboticsTeam() {
        RoboticsTeam team1 = new RoboticsTeam("SDMCyberPanthers","15005X",12);

        assertEquals("SDMCyberPanthers",team1.getTeamName());
        assertEquals("15005X",team1.getTeamNumber());
        assertEquals(12,team1.getNumStudents());
    }
}
