package P2Recursividad;

import P2Recursividad.models.Componente;

import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {

        Componente gpu = new Componente("Nvidia Gtx 2070");
        Componente cpu = new Componente("Intel Core I7");
        Componente ram1 = new Componente("Corsair 8Gb");
        Componente ram2 = new Componente("Corsair 8Gb");
        Componente fuente = new Componente("Fuente 800W");
        Componente ssd = new Componente("Disco Ssd 2TB");
        Componente placaMadre = new Componente("Asus socket Intel");
        Componente pc = new Componente("Computadora Personal");
        Componente gpuRam1 = new Componente("Gpu Ram 4Gb");
        Componente gpuRam2 = new Componente("Gpu Ram 4Gb");
        Componente ventiladorCPU = new Componente("ventilador CPU");
        Componente disipador = new Componente("Disipador");

        ventiladorCPU.addComponente(disipador);
        cpu.addComponente(ventiladorCPU);

        gpu.addComponente(gpuRam1)
                .addComponente(gpuRam2);

        pc.addComponente(placaMadre)
                .addComponente(cpu)
                .addComponente(ram1)
                .addComponente(ram2)
                .addComponente(fuente)
                .addComponente(ssd)
                .addComponente(gpu)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        //Recursivo sin apiStream
        metodoRecursivo(pc, 0);

        //Recursivo con apiStream de Java 8
        metodoRecursivoJava8(pc, 0).forEach((c)-> {
            System.out.println("   ".repeat(c.getNivel()) + c.getNombre());
        });


    }

    public static void metodoRecursivo(Componente componente, int nivel) {

        if (nivel == 0) System.out.println(componente.getNombre());
        else System.out.println("   ".repeat(nivel) + "|->" + componente.getNombre());

        if (componente.tieneHijos()) {
            nivel++;
            for (Componente c : componente.getComponentes()) {
                metodoRecursivo(c, nivel);
            }
        } else --nivel;

    }

    public static Stream<Componente> metodoRecursivoJava8(Componente componente, int nivel) {
        componente.setNivel(nivel);
        return Stream.concat(Stream.of(componente),
                componente.getComponentes().stream().flatMap(hijo->metodoRecursivoJava8(hijo,nivel+1)));
    }
}