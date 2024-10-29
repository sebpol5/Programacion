public class BusquedaLineal {
    public static int buscar(int[] array, int valor) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == valor) {
                return i; // Retorna la posición del valor encontrado
            }
        }
        return -1; // Retorna -1 si el valor no se encuentra en el array
    }
    public static void main(String[] args){
        int[] array = {5, 3, 9, 2, 7, 1};
        int valorBuscado = 9;
        int resultado = buscar(array, valorBuscado);
        System.out.println("El valor " + valorBuscado + " se encuentra en la posicion" + resultado);
    }

}
