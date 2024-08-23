import java.util.List;
import java.util.Objects;

public class Trainer {
    private String trainerId;
    private String name;
    private String email;
    private String contactNumber;
    private List<TechStack> techStacks;

    // Getters and Setters
    public String getTrainerId() { return trainerId; }
    public void setTrainerId(String trainerId) { this.trainerId = trainerId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public List<TechStack> getTechStacks() { return techStacks; }
    public void setTechStacks(List<TechStack> techStacks) { this.techStacks = techStacks; }

    // hashCode and equals
    @Override
    public int hashCode() {
        return Objects.hash(trainerId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trainer trainer = (Trainer) obj;
        return Objects.equals(trainerId, trainer.trainerId);
    }
}
