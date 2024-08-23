import java.util.List;
import java.util.Objects;

public class Question {
    private String questionId;
    private List<String> answers;
    private String answerKey;
    private double score;
    private String techStackId;
    private String assignmentId;

    // Getters and Setters
    public String getQuestionId() { return questionId; }
    public void setQuestionId(String questionId) { this.questionId = questionId; }
    
    public List<String> getAnswers() { return answers; }
    public void setAnswers(List<String> answers) { this.answers = answers; }
    
    public String getAnswerKey() { return answerKey; }
    public void setAnswerKey(String answerKey) { this.answerKey = answerKey; }
    
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
    
    public String getTechStackId() { return techStackId; }
    public void setTechStackId(String techStackId) { this.techStackId = techStackId; }
    
    public String getAssignmentId() { return assignmentId; }
    public void setAssignmentId(String assignmentId) { this.assignmentId = assignmentId; }

    // hashCode and equals
    @Override
    public int hashCode() {
        return Objects.hash(questionId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Question question = (Question) obj;
        return Objects.equals(questionId, question.questionId);
    }
}
