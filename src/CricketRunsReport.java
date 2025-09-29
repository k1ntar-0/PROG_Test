
/*
*Student Name: Ndeadzo Given Tshiovhe
*Student Number: 1048746
*/
public class CricketRunsReport {
//Question 1
    
    public static void main(String[] args) {
        // Batsmen
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};

        // Stadiums
        String[] stadiums = {"Kingsmead", "St George", "Wanderers"};

        // 2D Array: rows = stadiums, cols = batsmen
        int[][] runs = {
                {5000, 3800, 4200}, // Kingsmead
                {3500, 3700, 3900}, // St George
                {6200, 5000, 5200}  // Wanderers
        };

        // Display report
        System.out.println(" Cricket Runs Report");
        System.out.println("============================\n");

        // Print runs scored by each batsman at each stadium
        for (int i = 0; i < stadiums.length; i++) {
            System.out.println("Stadium: " + stadiums[i]);
            for (int j = 0; j < batsmen.length; j++) {
                System.out.println("   " + batsmen[j] + " scored: " + runs[i][j]);
            }
            System.out.println();
        }

        // Highest runs scored per stadium
        System.out.println("Highest Runs per Stadium:");
        for (int i = 0; i < stadiums.length; i++) {
            int maxRuns = runs[i][0];
            String topBatsman = batsmen[0];
            for (int j = 1; j < batsmen.length; j++) {
                if (runs[i][j] > maxRuns) {
                    maxRuns = runs[i][j];
                    topBatsman = batsmen[j];
                }
            }
            System.out.println("   " + stadiums[i] + ": " + topBatsman + " (" + maxRuns + ")");
        }
        System.out.println();

        // Total runs of each batsman (single array example)
        int[] totalRuns = new int[batsmen.length];
        for (int j = 0; j < batsmen.length; j++) {
            int sum = 0;
            for (int i = 0; i < stadiums.length; i++) {
                sum += runs[i][j];
            }
            totalRuns[j] = sum;
        }

        System.out.println("Total Runs by Each Batsman:");
        for (int j = 0; j < batsmen.length; j++) {
            System.out.println("   " + batsmen[j] + ": " + totalRuns[j]);
        }
        
        System.out.println();
        // Find stadium with most runs overall
        int maxStadiumRuns = 0;
        String topStadium = "";
        for (int i = 0; i < stadiums.length; i++) {
            int stadiumSum = 0;
            for (int j = 0; j < batsmen.length; j++) {
                stadiumSum += runs[i][j];
            }
            if (stadiumSum > maxStadiumRuns) {
                maxStadiumRuns = stadiumSum;
                topStadium = stadiums[i];
            }
        }
        System.out.println("Stadium with Most Runs:");
        System.out.println("   " + topStadium + " (" + maxStadiumRuns + ")");
    }
}
