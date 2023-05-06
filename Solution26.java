import java.util.*;
import java.io.*;

/**
 * 백준
 * 베스트셀러
 * https://www.acmicpc.net/problem/1302
 */

public class Solution26 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Book> books = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String bookName = br.readLine();
            if(map.containsKey(bookName)){
                int index = map.get(bookName);
                books.set(index, new Book(bookName, books.get(index).getCnt() + 1));
            } else {
                map.put(bookName, books.size());
                books.add(new Book(bookName, 1));
            }
        }

        Collections.sort(books);

        System.out.println(books.get(0).getName());

    }

}

class Book implements Comparable<Book>{
    String name;
    int cnt;

    public Book(String name, int cnt) {
        this.name = name;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }


    @Override
    public int compareTo(Book o) {
        if(this.cnt == o.getCnt()) {
            return this.name.compareTo(o.getName());
        } else {
            return o.getCnt() - this.cnt;
        }
    }
}
