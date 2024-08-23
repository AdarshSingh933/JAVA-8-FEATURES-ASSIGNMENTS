import java.util.Date;
import java.util.Objects;

public class Result {
    private String resultId;
    private Student student;
    private Assignment assignment;
    private Trainer trainer;
    private double score;
    private String feedback;
    private Date submissionDate;

    // Getters and Setters
    public String getResultId() { return resultId; }
    public void setResultId(String resultId) { this.resultId = resultId; }
    
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    
    public Assignment getAssignment() { return assignment; }
    public void setAssignment(Assignment assignment) { this.assignment = assignment; }
    
    public Trainer getTrainer() { return trainer; }
    public void setTrainer(Trainer trainer) { this.trainer = trainer; }
    
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
    
    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }
    
    public Date getSubmissionDate() { return submissionDate; }
    public void setSubmissionDate(Date submissionDate) { this.submissionDate = submissionDate; }

    // hashCode and equals
    @Override
    public int hashCode() {
        return Objects.hash(resultId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Result result = (Result) obj;
        return Objects.equals(resultId, result.resultId);
    }
}
