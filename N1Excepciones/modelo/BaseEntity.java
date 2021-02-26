package N1Excepciones.modelo;

import java.util.Objects;

public class BaseEntity {

    //Clase base, entity o clase POJO (Plain Old Java Object), con meteodos geter y seter solamente para id.
    //Es una clase base ya que casi tdas las clases van a tener un id
    protected Integer id;
    private static int ultimoId;

    public BaseEntity() {
        this.id=++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity base = (BaseEntity) o;
        return Objects.equals(id, base.id); //Objects es una clase Helper compara que no sea nulo el id y que sean iguales
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
