package java_learning.lld.design_patterns.chain_of_responsibility.log_v2;

public class FatalLogHandler extends LogHandler {

    public FatalLogHandler(LogType type, LogHandler nextLogHandler) {
        this.logType = type;
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    protected void write(String message) {
        System.out.println("FATAL: " + message);

    }
}
