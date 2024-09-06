import javax.swing.*;

public class AppMain {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherAppGui().setVisible(true);

                //System.out.println(WeatherApp.getLocationData("colima"));
                //System.out.println(WeatherApp.getCurrentTime());
            }
        });
    }
}
