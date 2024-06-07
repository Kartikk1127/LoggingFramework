public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        //logging with default configuration
        logger.info("This is an information message");
        logger.warning("This is an warning message");
        logger.error("This is an error message");

        //changing log level and appender
        LoggerConfig config = new LoggerConfig(LogLevel.DEBUG,new FileAppender("app.log"));
        logger.setConfig(config);

        logger.debug("This is a debug message");
        logger.info("This is a information message");
    }
}