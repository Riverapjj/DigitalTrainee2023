package modelo;

public class Pago extends BaseEntity{

    private float importe;
    private Integer idTransaccion;
    private Usuario identificadorUsuario;

    public Pago(float importe, Integer idTransaccion, Usuario identificadorUsuario) {
        super();
        this.importe = importe;
        this.idTransaccion = idTransaccion;
        this.identificadorUsuario = identificadorUsuario;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Usuario getIdentificadorUsuario() {
        return identificadorUsuario;
    }

    public void setIdentificadorUsuario(Usuario identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }
}
