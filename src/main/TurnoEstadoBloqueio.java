package main;

public class TurnoEstadoBloqueio implements TurnoEstado{

    private TurnoEstadoBloqueio() {};
    private static TurnoEstadoBloqueio instance = new TurnoEstadoBloqueio();
    public static TurnoEstadoBloqueio getInstance() {
        return instance;
    }

    @Override
    public String getInfoEstado() {
        return "Este o usuario bloqueou";
    }
}
