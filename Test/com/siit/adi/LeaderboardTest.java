package com.siit.adi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeaderboardTest {

    Leaderboard testLeaderboard = new Leaderboard();

    @Before
    public void setUp(){
        testLeaderboard.readAthletes();
    }


    @Test
    public void readAthletesTest() {

        assertEquals(testLeaderboard.getAthletes().size(), 3);

    }


}