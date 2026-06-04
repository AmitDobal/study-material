package java_learning.lld.design_patterns.chain_of_responsibility.log;

public class MainLog {

    public static void main(String[] args) {
        // Chain: DEBUG -> INFO -> ERROR -> FATAL

        LogHandler fatalLogHandler = new FatalLogHandler(LogType.FATAL, null);
        LogHandler errorLogHandler = new ErrorLogHandler(LogType.ERROR, fatalLogHandler);
        LogHandler infoLogHandler = new InfoLogHandler(LogType.INFO, errorLogHandler);
        LogHandler logger = new DebugLogHandler(LogType.DEBUG, infoLogHandler);

        logger.log(LogType.INFO, "This is a INFO message");
        logger.log(LogType.DEBUG, "This is a DEBUG message");
        logger.log(LogType.FATAL, "This is a FATAL message");
        logger.log(LogType.INFO, "This is a info message");

    }
}
