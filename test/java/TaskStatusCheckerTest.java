import static org.junit.Assert.*;
import org.junit.Test;

public class TaskStatusCheckerTest {
    
    @Test
    public void testGetStatus_ValidIds_ReturnsStatus() {
        TaskStatusChecker checker = new TaskStatusChecker();
        String status = checker.getStatus("student123", "task456");
        assertNotNull(status);
    }
    
    @Test
    public void testGetStatus_InvalidStudentId_ThrowsException() {
        TaskStatusChecker checker = new TaskStatusChecker();
        assertThrows(IllegalArgumentException.class, () -> {
            checker.getStatus("invalid", "task456");
        });
    }
}