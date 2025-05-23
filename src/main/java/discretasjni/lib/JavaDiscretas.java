package discretasjni.lib;

public class JavaDiscretas {

    static { System.loadLibrary("discretas"); }

    private native int[] unionSets(int[] a, int[] b);
    private native int[] intersectionSets(int[] a, int[] b);
    private native int[] differenceSets(int[] a, int[] b);
    private native int[] symmetricDifferenceSets(int[] a, int[] b);
    private native int[] complementSet(int[] universal, int[] a);

    public int[] union(int[] a, int[] b) { return unionSets(a, b); }
    public int[] intersection(int[] a, int[] b) { return intersectionSets(a, b); }
    public int[] difference(int[] a, int[] b) { return differenceSets(a, b); }
    public int[] symmetricDifference(int[] a, int[] b) { return symmetricDifferenceSets(a, b); }
    public int[] complement(int[] universal, int[] a) { return complementSet(universal, a); }
}
