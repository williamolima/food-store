package br.edu.ifpb.padroes.service.log;

public class DatabaseLogService extends LogService  {
    @Override
    public void log(String message) {
        System.out.println(String.format("save message [%s] to the database"));
    }
}
