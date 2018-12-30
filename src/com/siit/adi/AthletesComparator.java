package com.siit.adi;

import java.util.Comparator;

public class AthletesComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getTotalTime() - o2.getTotalTime();
    }
}
