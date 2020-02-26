package org.pst.slamma;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BBCodeLB {

    public void printBBLB(List<PSTMember> all_members, int goal_trophies) {

        int current_community_trophies = 0;


        for (PSTMember member : all_members) {
            current_community_trophies = current_community_trophies + member.getCurrent_trophies();
        }
        System.out.println("TOTAL TROPHIES EARNED IS " + current_community_trophies);
        float progress = (float)current_community_trophies / goal_trophies;
        System.out.println("PROGRESS IS " + progress + "%");
        Comparator<PSTMember> sortByTotal = new Comparator<PSTMember>() {
        @Override
        public int compare(PSTMember o1, PSTMember o2) {
            if (o1.getCurrent_trophies() == o2.getCurrent_trophies()) return 0;
            else if (o1.getCurrent_trophies() > o2.getCurrent_trophies()) return -1;
            else return 1;
        }
    };
        Collections.sort(all_members,sortByTotal);

        for (PSTMember member : all_members) {
            if (! member.getPsn_name().equals(member.getPst_name())) {
                writeToLBFile(member.getCurrent_trophies() + " ~ [B]" + member.getPst_name() + "[/B] (" + member.getPsn_name() + ")");
            } else {
                writeToLBFile(member.getCurrent_trophies() + " ~ [B]" + member.getPst_name() + "[/B]");
            }
        }
    }

    private void writeToLBFile(String line) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd");
        String filename = "C:\\Users\\Pineapple\\Desktop\\" + dtf.format(LocalDateTime.now()) + "-lb-bbcode.txt";
        File newFile = new File(filename);
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
            FileWriter fw = new FileWriter(filename,true);
            fw.write(line);
            fw.write("\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
