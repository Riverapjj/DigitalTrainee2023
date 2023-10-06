public interface ReservarBillete {

    static Integer numeroEntradasDisponibles = 100;

    int reservarBilletes(Integer asientos);

    int cancelarBillete(Integer asientos);

}
