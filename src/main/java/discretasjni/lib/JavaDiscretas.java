package discretasjni.lib;

public class JavaDiscretas {

    static {
        try {
            System.loadLibrary("discretas");
            System.out.println("Biblioteca 'discretas' cargada exitosamente!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Carga de la biblioteca fallida: " + e.getMessage());
        }
    }

    public native int[] union(int[] a, int[] b);

    public native int[] interseccion(int[] a, int[] b);

    public native int[] diferencia(int[] a, int[] b);

    public native int[] diferenciaSimetrica(int[] a, int[] b);

    public native int[] complemento(int[] a, int[] universo);

}
