package java_learning.lld.design_patterns.behavioral.chain_of_responsibility.log_v2;

public class MainLog {

    public static void main(String[] args) {
        // Chain: DEBUG -> INFO -> ERROR -> FATAL

        LogHandler fatalLogHandler = new FatalLogHandler(LogType.FATAL, null);
        LogHandler errorLogHandler = new ErrorLogHandler(LogType.ERROR, fatalLogHandler);
        LogHandler infoLogHandler = new InfoLogHandler(LogType.INFO, errorLogHandler);
        LogHandler logger = new DebugLogHandler(LogType.DEBUG, infoLogHandler);

        logger.info("This is a INFO message");
        logger.debug("This is a DEBUG message");
        logger.fatal("This is a FATAL message");
        logger.info("This is a info message");

    }
}
