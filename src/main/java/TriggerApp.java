import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriggerApp {

    public static void main(String [] args) throws IOException, InterruptedException {
        StringBuffer output = new StringBuffer();

        Process p =Runtime.getRuntime().exec("C:\\Users\\Saurabh_Mishra\\Documents\\gigaspaces\\gigaspaces-insightedge-enterprise-14.5.0\\gigaspaces-insightedge-enterprise-14.5.0\\insightedge\\bin\\insightedge-submit.cmd" +
                " --class com.gigaspaces.SpacePersistApp" +
                " --master spark://127.0.0.1:7077" +
                " C:\\Users\\Saurabh_Mishra\\OneDrive - EPAM\\gigaspace\\spark-submit\\insightedgeexamples2\\insightedgeexamples2\\target\\SpaceConnectorsApp-1.0-SNAPSHOT-jar-with-dependencies.jar");

        p.waitFor();
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine())!= null) {
            output.append(line + "\n");
        }
        System.out.println("till "+output);



        ProcessBuilder processBuilder = new ProcessBuilder();
        // Windows
       /* processBuilder.command("C:\\Users\\Saurabh_Mishra\\Documents\\gigaspaces\\gigaspaces-insightedge-enterprise-14.5.0\\gigaspaces-insightedge-enterprise-14.5.0\\insightedge\\bin\\insightedge-submit.cmd" +
                        " --class com.gigaspaces.SpacePersistApp" +
                        " --master spark://127.0.0.1:7077" +
                        " C:\\Users\\Saurabh_Mishra\\OneDrive - EPAM\\gigaspace\\spark-submit\\insightedgeexamples2\\insightedgeexamples2\\target\\SpaceConnectorsApp-1.0-SNAPSHOT-jar-with-dependencies.jar", "c/", ""
                );*/





    }

}
