import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter score: ");
    int score = sc.nextInt();

    if (score < 0 || score > 100) {
        System.out.println("Invalid score");
    } else {
        System.out.println(calculateGrade(score));
    }
}

String calculateGrade(int score) {
    if (score >= 90) return "A";
    if (score >= 80) return "B";
    if (score >= 70) return "C";
    if (score >= 60) return "D";
    return "F";
}