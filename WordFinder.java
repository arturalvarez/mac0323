import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.SeparateChainingHashST;

public class WordFinder {
	private SequentialSearchST<Key, Value>[] tabela;

	public WordFinder(String str[]) {

	}

	//Retorna a palavra que se repete mais vezes nas strings dadas.
	//Caso a palavra apareça mais de uma vez na mesma string, ignore.
	//private String getMax() {}
	
	//Retorna uma palavra que apareça tanto na string de índice a do 
	//vetor quanto na string de índice b. Se não tiver nenhuma, retorne null.
	//Se tiver mais de uma, retorne a que quiser.
	//private String containedIn(int a, int b) {}
	
	//Recebe uma palavra e retorna um vetor com os índices das strings do vetor
	//inicial em que ela apareça. Se não aparecer em nenhum, retorne um vetor vazio.
	//private int[] appearsIn(String s) {}

	public static void main(String[] args) {
		int n = 2;
		String str[];
		WordFinder a;
		str = new String[n];
		str[0] = "oi";
		str[1] = "tchau";
		a = new WordFinder(str);
		StdOut.println(a.v[0] + " e " + a.v[1]);
	}

}