package java_learning.lld.design_patterns.chain_of_responsibility.log;

public abstract class LogHandler {

    LogType logType;
    LogHandler nextLogHandler;

    protected abstract void write(String message);

    void log(LogType type, String message) {
        if (this.logType.equals(type)) {
            write(message);
        }

        if (nextLogHandler != null) {
            nextLogHandler.log(type, message);
        }
    }

}
