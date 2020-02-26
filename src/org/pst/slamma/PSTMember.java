package org.pst.slamma;

import java.util.List;

public class PSTMember {

    private String pst_name;
    private String psn_name;
    private int start_trophies;
    private int current_trophies;

    /**
     * This is the constructor for the PST Member object
     * The PST and PSN name will be passed in and then the constructor will continue
     * by calling the pullInfo to grab necessary information.
     * @param pst
     * @param psn
     */
    public PSTMember(String pst, String psn, int startTrophies) {
        setPst_name(pst);
        setPsn_name(psn);
        setStart_trophies(startTrophies);
        System.out.println("Pulling info " +
                "for " + pst + " (" + psn + ")...");
        pullInfo();
//        printItAll();
    }

    private void pullInfo() {
        int user_trophies = ScrapePSNPLog.pullCurrentPS4Trophies(getPsn_name());

        setCurrent_trophies(user_trophies);
    }

    private void printItAll() {
        System.out.println("PST Name:\t" + getPst_name());
        System.out.println("PSN Name:\t" + getPsn_name());
        System.out.println("Current Trophs:\t\t" + getCurrent_trophies());
    }

    public String getPst_name() { return pst_name; }

    public void setPst_name(String pst_name) { this.pst_name = pst_name; }

    public String getPsn_name() { return psn_name; }

    public void setPsn_name(String psn_name) { this.psn_name = psn_name; }

    public int getStart_trophies() { return start_trophies; }

    public void setStart_trophies(int start_trophies) { this.start_trophies = start_trophies; }

    public int getCurrent_trophies() { return current_trophies; }

    public void setCurrent_trophies(int curr_trophs) { this.current_trophies = curr_trophs - getStart_trophies(); }

    // Testing purposes only
    public static void main(String args[]) {
        // This is to test the actual information pulled from PSNP
        PSTMember slamz = new PSTMember("Slamma", "slammajamma28", 3300);
    }
}
