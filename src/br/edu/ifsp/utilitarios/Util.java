package br.edu.ifsp.utilitarios;

public class Util {
	public static String[] trimStringArray(String[] array) {
        String[] newArray = new String[array.length];
        int c = 0;
        for (String string : array) {
            newArray[c] = string.trim();
            c++;
        }
        return newArray;
    }

    public static String getExtension(String path) {
        return path.split("\\.")[1];
    }
}
