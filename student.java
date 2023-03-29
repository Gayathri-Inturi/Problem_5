import java.util.*;

public class student {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        Map<String, List<Integer>> Scores = new HashMap<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String Name = sc.nextLine();
            System.out.print("Enter comma-separated scores for " + Name + ": ");
            String scoresString = sc.nextLine();
            List<Integer> scores = new ArrayList<>();
            for (String scoreString : scoresString.split(",")) {
                scores.add(Integer.parseInt(scoreString.trim()));
            }
            Scores.put(Name, scores);
        }
        /*
         Output
         Enter number of students: 4
Enter student name: charlie
Enter comma-separated scores for charlie: 20,30,40,50
Enter student name: pavan
Enter comma-separated scores for pavan: 21,31,41,51 
Enter student name: anil
Enter comma-separated scores for anil: 22,32,42,52
Enter student name: vaishali
Enter comma-separated scores for vaishali: 23,33,43,53
Total scores:
vaishali: 152
pavan: 144
anil: 148
charlie: 140
         */
        
        
        Map<String, Integer> TotalScores = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : Scores.entrySet()) {
            int totalScore = 0;
            for (int score : entry.getValue()) {
                totalScore += score;
            }
            TotalScores.put(entry.getKey(), totalScore);
        }
        
      
        System.out.println("Total scores:");
        for (Map.Entry<String, Integer> entry : TotalScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
