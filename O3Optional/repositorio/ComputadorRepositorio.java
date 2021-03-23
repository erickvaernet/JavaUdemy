package O3Optional.repositorio;

import O3Optional.models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ComputadorRepositorio implements Repositorio{

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource= new ArrayList<>();
        dataSource.add(new Computador("Asus Rog","Strix G512x"));
        dataSource.add(new Computador("Macbook pro","MVVK2CI"));

    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()
                .filter( (c) -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()) )
                .findFirst();
    }
}
