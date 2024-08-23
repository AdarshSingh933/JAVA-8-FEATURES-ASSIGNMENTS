import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DummyDataGenerator {

    public static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Student student = new Student();
            student.setStudentId("S" + i);
            student.setName("Student " + i);
            student.setEmail("student" + i + "@example.com");
            student.setContactNumber("123456789" + i);
            students.add(student);
        }
        return students;
    }

    public static List<Trainer> createTrainers() {
        List<Trainer> trainers = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Trainer trainer = new Trainer();
            trainer.setTrainerId("T" + i);
            trainer.setName("Trainer " + i);
            trainer.setEmail("trainer" + i + "@example.com");
            trainer.setContactNumber("987654321" + i);
            trainer.setTechStacks(createTechStacks());
            trainers.add(trainer);
        }
        return trainers;
    }

    public static List<Assignment> createAssignments() {
        List<Assignment> assignments = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            Assignment assignment = new Assignment();
            assignment.setAssignmentId("A" + i);
            assignment.setTitle("Assignment " + i);
            assignment.setDescription("Description for Assignment " + i);
            assignment.setDueDate(new Date());
            assignment.setQuestions(createQuestions(assignment.getAssignmentId()));
            assignments.add(assignment);
        }
        return assignments;
    }

    public static List<Question> createQuestions(String assignmentId) {
        List<Question> questions = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            Question question = new Question();
            question.setQuestionId("Q" + i);
            question.setAnswers(List.of("A", "B", "C", "D"));
            question.setAnswerKey("A");
            question.setScore(10);
            question.setTechStackId("TS1");
            question.setAssignmentId(assignmentId);
            questions.add(question);
        }
        return questions;
    }

    public static List<TechStack> createTechStacks() {
        List<TechStack> techStacks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            TechStack techStack = new TechStack();
            techStack.setTechStackId("TS" + i);
            techStack.setName("TechStack " + i);
            techStack.setDescription("Description for TechStack " + i);
            techStacks.add(techStack);
        }
        return techStacks;
    }

    public static List<Result> createResults(List<Student> students, List<Assignment> assignments, List<Trainer> trainers) {
        List<Result> results = new ArrayList<>();
        for (Student student : students) {
            for (Assignment assignment : assignments) {
                Result result = new Result();
                result.setResultId("R" + student.getStudentId() + assignment.getAssignmentId());
                result.setStudent(student);
                result.setAssignment(assignment);
                result.setTrainer(trainers.get(0)); // Assigning first trainer as example
                result.setScore(70 + Math.random() * 30); // Random score between 70 and 100
                result.setFeedback("Good work");
                result.setSubmissionDate(new Date());
                results.add(result);
            }
        }
        return results;
    }
}
