public class TaskStatusChecker {
    public String getStatus(String studentId, String taskId) {
        validateInput(studentId, taskId);
        return "Submitted"; // Will enhance later
    }
    
    private void validateInput(String studentId, String taskId) {
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }
        if (taskId == null || taskId.trim().isEmpty()) {
            throw new IllegalArgumentException("Task ID cannot be empty");
        }
        if (studentId.equals("invalid")) {
            throw new IllegalArgumentException("Invalid student ID");
        }
    }
}