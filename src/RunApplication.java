import java.util.Scanner;

// Step 1: Interface
interface ICricket {
    String getBatsman();
    String getStadium();
    String getRunsScored();
}

// Step 2: Abstract class
abstract class Cricket implements ICricket {
    protected String batsmanName;
    protected String stadiumName;
    protected String runsScored;

    // Constructor
    public Cricket(String batsmanName, String stadiumName, String runsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.runsScored = runsScored;
    }

    // Implement getters from interface
    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

    @Override
    public String getRunsScored() {
        return runsScored;
    }
}

// Step 3: Subclass
class CricketRunsScored extends Cricket {

    // Constructor
    public CricketRunsScored(String batsmanName, String stadiumName, String runsScored) {
        super(batsmanName, stadiumName, runsScored);
    }

    // Print Report Method
    public void printReport() {
        System.out.println("Career Report");
        System.out.println("============================");
        System.out.println("Batsman: " + getBatsman());
        System.out.println("Stadium: " + getStadium());
        System.out.println("Total Runs Scored: " + getRunsScored());
        System.out.println("============================");
    }
}

// Step 4: Run Application
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter Batsman's Name: ");
        String batsmanName = scanner.nextLine();

        System.out.print("Enter Stadium Name: ");
        String stadiumName = scanner.nextLine();

        System.out.print("Enter Total Runs Scored: ");
        String runsScored = scanner.nextLine();

        // Create object
        CricketRunsScored report = new CricketRunsScored(batsmanName, stadiumName, runsScored);

        // Print report
        report.printReport();

        scanner.close();
    }
}
