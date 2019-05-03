import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {
    private final String name;
    private final String telf;

    public Contact(String name, String telf) {
        this.name = name;
        this.telf = telf;
    }

    public Contact(String nombre) {
        this(nombre,null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(telf, contact.telf);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nombre='" + name + '\'' +
                ", correo='" + telf + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telf);
    }

    public String getNombre() {
        return name;
    }

    public String getTelf() {
        return telf;
    }
}
