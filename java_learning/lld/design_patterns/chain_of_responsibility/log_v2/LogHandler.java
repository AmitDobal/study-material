package java_learning.lld.design_patterns.chain_of_responsibility.log_v2;

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

    void debug(String message) {
        log(LogType.DEBUG, message);
    }

    void info(String message) {
        log(LogType.INFO, message);
    }

    void error(String message) {
        log(LogType.ERROR, message);
    }

    void fatal(String message) {
        log(LogType.FATAL, message);
    }

}
