package java_learning.lld.design_patterns.chain_of_responsibility.log_v2;

public class ErrorLogHandler extends LogHandler {

    public ErrorLogHandler(LogType type, LogHandler nextLogHandler) {
        this.logType = type;
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);

    }
}
