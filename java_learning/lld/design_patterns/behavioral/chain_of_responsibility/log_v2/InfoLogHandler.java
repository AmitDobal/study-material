package java_learning.lld.design_patterns.behavioral.chain_of_responsibility.log_v2;

public class InfoLogHandler extends LogHandler {

    public InfoLogHandler(LogType type, LogHandler nextLogHandler) {
        this.logType = type;
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);

    }
}
