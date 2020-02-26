package org.pst.slamma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class LetsCelebrate {

    final static int goal_trophies=10000;

    public static void main(String args[]) {
        List<PSTMember> all_members = new ArrayList<>();
        int current_community_trophies = 0;

        String line;
        try {
            FileReader fr = new FileReader("participant_list");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {

                List<String> id = Arrays.asList(line.split(","));
                PSTMember newMember = new PSTMember(id.get(0), id.get(1), Integer.parseInt(id.get(2)));
                all_members.add(newMember);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        BBCodeLB bbclb = new BBCodeLB();
        bbclb.printBBLB(all_members, goal_trophies);
    }
}
