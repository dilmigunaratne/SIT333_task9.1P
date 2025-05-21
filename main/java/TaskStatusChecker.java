public class TaskStatusChecker {
    public String getStatus(String studentId, String taskId) {
        if (studentId.equals("invalid")) {
            throw new IllegalArgumentException("Invalid student ID");
        }
        return "Submitted"; // Simple implementation for now
    }
}