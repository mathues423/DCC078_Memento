package main;

public class TurnoEstadoInvalido implements TurnoEstado{

    private TurnoEstadoInvalido() {};
    private static TurnoEstadoInvalido instance = new TurnoEstadoInvalido();
    public static TurnoEstadoInvalido getInstance() {
        return instance;
    }

    @Override
    public String getInfoEstado() {
        return "Este estado é invalido";
    }
}
