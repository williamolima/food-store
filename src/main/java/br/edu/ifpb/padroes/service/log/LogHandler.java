package br.edu.ifpb.padroes.service.log;

public class LogHandler {

    public enum LogHandlerType { DATABASE, FILE}

    public interface LogGerador{
        LogHandler gerarLog(LogHandlerType.DATABASE, LogHandlerType.FILE);
    }

    public LogGerador logGerador;

    public LogHandler gerarLog(LogHandlerType.DATABASE, LogHandlerType.FILE) {
        return logGerador.gerarLog(DATABASE, FILE);
    }
    

    // public LogHandler(LogHandlerType type) {
    //     this.type = type;
    // }
    // private LogHandlerType type;
    // public void log(String message) {
    //     if (type.equals(LogHandlerType.DATABASE)) {
    //         System.out.println("save data to database");
    //     } else if (type.equals(LogHandlerType.FILE)) {
    //         System.out.println("save data to a file");
    //     }
    // }

}
