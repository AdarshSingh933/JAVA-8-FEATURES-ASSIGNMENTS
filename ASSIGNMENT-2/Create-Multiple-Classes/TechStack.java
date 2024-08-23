import java.util.Objects;

public class TechStack {
    private String techStackId;
    private String name;
    private String description;

    // Getters and Setters
    public String getTechStackId() { return techStackId; }
    public void setTechStackId(String techStackId) { this.techStackId = techStackId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // hashCode and equals
    @Override
    public int hashCode() {
        return Objects.hash(techStackId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TechStack techStack = (TechStack) obj;
        return Objects.equals(techStackId, techStack.techStackId);
    }
}
