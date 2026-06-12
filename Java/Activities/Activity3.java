package activity1;

public class Activity3 {

    public static String adjustDevice(String device, int value) {

        if (device == null) {

            return "Device is null.";

        }

        switch (device.toUpperCase()) {

            case "THERMOSTAT":

                if (value >= 40) {

                    return "[Thermostat] Warning: Temperature high.";

                } else {

                    return "[Thermostat] Temperature is set to " + value + ".";

                }

            case "LIGHT":

                return "[Light] Adjusting brightness to " + value + "%.";

            default:

                return "Unknown device.";

        }

    }

    public static void main(String[] args) {

        System.out.println(adjustDevice("THERMOSTAT", 45));

        System.out.println(adjustDevice("THERMOSTAT", 25));

        System.out.println(adjustDevice("LIGHT", 80));

        System.out.println(adjustDevice(null, 50));

    }

}
 
