package main;

public class TurnoEstadoAtaque implements TurnoEstado{

    private TurnoEstadoAtaque() {};
    private static TurnoEstadoAtaque instance = new TurnoEstadoAtaque();
    public static TurnoEstadoAtaque getInstance() {
        return instance;
    }

    @Override
    public String getInfoEstado() {
        return "Este o usuario atacou";
    }
}
