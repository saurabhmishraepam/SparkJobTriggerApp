import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriggerApp {

    public static void main(String [] args){


        ProcessBuilder processBuilder = new ProcessBuilder();
        // Windows
        processBuilder.command("cmd.exe", "C:\\Users\\Saurabh_Mishra\\Documents\\gigaspaces\\gigaspaces-insightedge-enterprise-14.5.0\\gigaspaces-insightedge-enterprise-14.5.0\\insightedge\\bin\\insightedge-submit.cmd", "");



        try {

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
