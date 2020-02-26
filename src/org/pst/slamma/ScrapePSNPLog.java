package org.pst.slamma;

import com.jaunt.Element;
import com.jaunt.UserAgent;

public class ScrapePSNPLog {
    public static int pullCurrentPS4Trophies(String psn_name) {
        int trophs = 0;

        String log_url="https://psnprofiles.com/" + psn_name + "/log?platform=ps4";

        try {
            UserAgent userAgent = new UserAgent();
            userAgent.visit(log_url);

            Element box = userAgent.doc.findFirst("<div class='title flex v-align'>");

            String box_text = box.findFirst("<h3>").getChildText();

            box_text = box_text.replace("Listing ","").replace(" Trophies","").replace(",","");

            trophs = Integer.parseInt(box_text);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("CHECK ON NUMBERS FOR " + psn_name);
        }

//        System.out.println("Current PS4 trophies = " + trophs);
        return trophs;
    }
}
