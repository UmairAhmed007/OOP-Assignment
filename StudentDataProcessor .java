import java.util.Arrays;
public class StudentDataProcessor {
public static void main(String[] args)
String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";
String[] studentRecords = studentData.split(",")
String[] studentNames = new String[studentRecords.length];
int[] studentScores = new int[studentRecords.length];
for (int i = 0; i < studentRecords.length; i++) {
String[] studentInfo = studentRecords[i].split(":");
studentNames[i] = studentInfo[0];
studentScores[i] = Integer.parseInt(studentInfo[1]);
}
int numberOfStudents = studentNames.length;
int totalScore = 0;
for (int i = 0; i < studentScores.length; i++) {
totalScore += studentScores[i];
}
double averageScore = (double) totalScore / numberOfStudents;
int highestScore = studentScores[0];
String highestScoringStudentName = studentNames[0];
for (int i = 1; i < studentScores.length; i++) {
if (studentScores[i] > highestScore) {
highestScore = studentScores[i];
highestScoringStudentName = studentNames[i];
}
}
int lowestScore = studentScores[0];
String lowestScoringStudentName = studentNames[0];
for (int i = 1; i < studentScores.length; i++) {
if (studentScores[i] < lowestScore) {
lowestScore = studentScores[i];
lowestScoringStudentName = studentNames[i];
} }
System.out.println("Total number of students: " + numberOfStudents);
System.out.println("Average score of all students: " + averageScore);
System.out.println("Highest score: " + highestScore + ", achieved by " +
highestScoringStudentName);
System.out.println("Lowest score: " + lowestScore + ", achieved by " +
lowestScoringStudentName);
}
}