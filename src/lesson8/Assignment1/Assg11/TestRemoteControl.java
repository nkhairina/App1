package lesson8.Assignment1.Assg11;

import java.util.Scanner;

public class TestRemoteControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TVRemote tvRemote = new TVRemote();
        StereoRemote stereoRemote = new StereoRemote();

        boolean exit = false;
        while (!exit) {
            System.out.println("1. TV Remote");
            System.out.println("2. Stereo Remote");
            System.out.println("3. Exit");
            System.out.print("What do you want to control? ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controlTVRemote(tvRemote, scanner);
                    break;
                case 2:
                    controlStereoRemote(stereoRemote, scanner);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }

        scanner.close();
    }

    private static void controlTVRemote(TVRemote tvRemote, Scanner scanner) {
        while (true) {
            System.out.println("\n1. Power on");
            System.out.println("2. Power off");
            System.out.println("3. Volume up");
            System.out.println("4. Volume down");
            System.out.println("5. Back");
            System.out.print("TV Remote Menu: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tvRemote.powerOn();
                    break;
                case 2:
                    tvRemote.powerOff();
                    break;
                case 3:
                    tvRemote.volumeUp();
                    break;
                case 4:
                    tvRemote.volumeDown();
                    break;
                case 5:
                    return; // exit
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void controlStereoRemote(StereoRemote stereoRemote, Scanner scanner) {
        while (true) {
            System.out.println("\n1. Power on");
            System.out.println("2. Power off");
            System.out.println("3. Volume up");
            System.out.println("4. Volume down");
            System.out.println("5. Change mode");
            System.out.println("6. Back");
            System.out.print("Stereo Remote Menu: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stereoRemote.powerOn();
                    break;
                case 2:
                    stereoRemote.powerOff();
                    break;
                case 3:
                    stereoRemote.volumeUp();
                    break;
                case 4:
                    stereoRemote.volumeDown();
                    break;
                case 5:
                    System.out.print("Enter new mode (FM, AM, AUX): ");
                    String newMode = scanner.next();
                    stereoRemote.changeMode(newMode);
                    break;
                case 6:
                    return; // exit
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}