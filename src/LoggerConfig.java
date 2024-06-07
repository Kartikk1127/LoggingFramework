public class LoggerConfig {
    private LogLevel logLevel;
    private LogAppender logAppender;

    public LoggerConfig(LogLevel logLevel, LogAppender logAppender){
        this.logLevel=logLevel;
        this.logAppender=logAppender;
    }

    public LogLevel getLogLevel(){
        return logLevel;
    }

    public void setLogLevel(LogLevel level){
        this.logLevel=level;
    }

    public LogAppender getLogAppender(){
        return logAppender;
    }

    public void setLogAppender(LogAppender logAppender){
        this.logAppender = logAppender;
    }
}
