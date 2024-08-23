import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Generate Dummy Data
        List<Student> students = DummyDataGenerator.createStudents();
        List<Trainer> trainers = DummyDataGenerator.createTrainers();
        List<Assignment> assignments = DummyDataGenerator.createAssignments();
        List<Result> results = DummyDataGenerator.createResults(students, assignments, trainers);

        // Create ResultsData object
        ResultsData resultsData = new ResultsData();
        results.forEach(resultsData::addResult);

        // Calculate and display data
        Student topStudent = findTopStudent(resultsData);
        System.out.println("Top Student: " + topStudent.getName());

        Student secondTopStudent = findSecondTopStudent(resultsData);
        System.out.println("Second Top Student: " + secondTopStudent.getName());

        List<Student> ranking = getOverallRanking(resultsData);
        System.out.println("Overall Ranking: " + ranking.stream().map(Student::getName).collect(Collectors.joining(", ")));

        List<Student> studentsNeedingImprovement = getStudentsNeedingImprovement(resultsData);
        System.out.println("Students Needing Improvement: " + studentsNeedingImprovement.stream().map(Student::getName).collect(Collectors.joining(", ")));

        List<Result> rohanResults = resultsData.getResultsByStudent(resultsData,"Rohan");
        System.out.println("Rohan's Results: " + rohanResults);

        // Further processing and display...
        // Get all students' results
        Map<Student, List<Result>> allStudentResults = getAllStudentResults(resultsData);

        // Print results for each student
        for (Map.Entry<Student, List<Result>> entry : allStudentResults.entrySet()) {
            Student student = entry.getKey();
            List<Result> results = entry.getValue();

            System.out.println("Results for student: " + student.getName());
            for (Result result : results) {
                Assignment assignment = result.getAssignment();
                System.out.println("Assignment: " + assignment.getTitle());
                System.out.println("Score: " + result.getScore());
                System.out.println("Feedback: " + result.getFeedback());
                System.out.println("Submission Date: " + result.getSubmissionDate());

                // Optional: Print details for each question in the assignment
                for (Question question : assignment.getQuestions()) {
                    System.out.println("  Question ID: " + question.getQuestionId());
                    System.out.println("  Answer Key: " + question.getAnswerkey());
                    System.out.println("  Score: " + question.getScore());
                }
                System.out.println("------------------------------");
            }
            System.out.println("==============================");
        }
    }

    public static Student findTopStudent(ResultsData resultsData) {
        // Use a map to keep track of each student's total score and the number of assignments
        Map<Student, Double> studentTotalScores = new HashMap<>();
        Map<Student, Integer> studentAssignmentCount = new HashMap<>();

        // Iterate through each result in the ResultsData
        for (Result result : resultsData.getResults()) {
            Student student = result.getStudent();
            double score = result.getScore();

            // Update total score and assignment count for the student
            studentTotalScores.put(student, studentTotalScores.getOrDefault(student, 0.0) + score);
            studentAssignmentCount.put(student, studentAssignmentCount.getOrDefault(student, 0) + 1);
        }

        // Determine the student with the highest average score
        Student topStudent = null;
        double highestAverage = 0.0;

        for (Map.Entry<Student, Double> entry : studentTotalScores.entrySet()) {
            Student student = entry.getKey();
            double totalScore = entry.getValue();
            int assignments = studentAssignmentCount.get(student);
            double averageScore = totalScore / assignments;

            if (averageScore > highestAverage) {
                highestAverage = averageScore;
                topStudent = student;
            }
        }

        return topStudent;
    }

   public static Student findSecondTopStudent(ResultsData resultsData) {
    // Use a map to keep track of each student's total score and the number of assignments
    Map<Student, Double> studentTotalScores = new HashMap<>();
    Map<Student, Integer> studentAssignmentCount = new HashMap<>();

    // Iterate through each result in the ResultsData
    for (Result result : resultsData.getResults()) {
        Student student = result.getStudent();
        double score = result.getScore();

        // Update total score and assignment count for the student
        studentTotalScores.put(student, studentTotalScores.getOrDefault(student, 0.0) + score);
        studentAssignmentCount.put(student, studentAssignmentCount.getOrDefault(student, 0) + 1);
    }

    // Determine the student with the highest and second-highest average scores
    Student topStudent = null;
    Student secondTopStudent = null;
    double highestAverage = 0.0;
    double secondHighestAverage = 0.0;

    for (Map.Entry<Student, Double> entry : studentTotalScores.entrySet()) {
        Student student = entry.getKey();
        double totalScore = entry.getValue();
        int assignments = studentAssignmentCount.get(student);
        double averageScore = totalScore / assignments;

        if (averageScore > highestAverage) {
            // Update second highest before the top changes
            secondHighestAverage = highestAverage;
            secondTopStudent = topStudent;

            // Update top student and highest average
            highestAverage = averageScore;
            topStudent = student;
        } else if (averageScore > secondHighestAverage) {
            // Update second top student if the score is in between
            secondHighestAverage = averageScore;
            secondTopStudent = student;
        }
    }

    return secondTopStudent;
}


     public static List<Student> getOverallRanking(ResultsData resultsData) {
        // Use a map to keep track of each student's total score
        Map<Student, Double> studentTotalScores = new HashMap<>();

        for (Result result : resultsData.getResults()) {
            Student student = result.getStudent();
            double score = result.getScore();

            // Update total score for the student
            studentTotalScores.put(student, studentTotalScores.getOrDefault(student, 0.0) + score);
        }

        // Sort students by total score in descending order
        return studentTotalScores.entrySet().stream()
            .sorted((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }

      public static List<Student> getStudentsNeedingImprovement(ResultsData resultsData) {
        // Use a map to keep track of each student's total score and the number of assignments
        Map<Student, Double> studentTotalScores = new HashMap<>();
        Map<Student, Integer> studentAssignmentCount = new HashMap<>();

        // Iterate through results to calculate total score and number of assignments
        for (Result result : resultsData.getResults()) {
            Student student = result.getStudent();
            double score = result.getScore();

            studentTotalScores.put(student, studentTotalScores.getOrDefault(student, 0.0) + score);
            studentAssignmentCount.put(student, studentAssignmentCount.getOrDefault(student, 0) + 1);
        }

        // Filter students who have an average score of less than 60%
        return studentTotalScores.entrySet().stream()
            .filter(entry -> (entry.getValue() / studentAssignmentCount.get(entry.getKey())) < 60.0)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }


    public static List<Result> getResultsByStudentName(ResultsData resultsData, String studentName) {
        return resultsData.getResults().stream()
            .filter(result -> result.getStudent().getName().equalsIgnoreCase(studentName))
            .collect(Collectors.toList());
    }

    

    public static Map<Student, List<Result>> getAllStudentResults(ResultsData resultsData) {
        // Group results by student
        return resultsData.getResults().stream()
            .collect(Collectors.groupingBy(Result::getStudent));
    }
}
