package java_learning.lld.design_patterns.chain_of_responsibility.log;

public class DebugLogHandler extends LogHandler {

    public DebugLogHandler(LogType type, LogHandler nextLogHandler) {
        this.logType = type;
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);

    }
}
