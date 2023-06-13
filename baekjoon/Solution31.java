package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 트리 순회
 * https://www.acmicpc.net/problem/1991
 */

public class Solution31 {

    static HashMap<String, NodeA> tree;
    static StringBuilder inorderResult = new StringBuilder();
    static StringBuilder preorderResult = new StringBuilder();
    static StringBuilder postorderResult = new StringBuilder();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tree = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String center = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();

            tree.put(center,new NodeA(left, right));
        }

        preorder("A");
        inorder("A");
        postorder("A");

        System.out.println(preorderResult);
        System.out.println(inorderResult);
        System.out.println(postorderResult);

    }

    public static void preorder(String center) {
        String left =  tree.get(center).left;
        String right = tree.get(center).right;

        preorderResult.append(center);

        if(!".".equals(left)) {
            preorder(left);
        }

        if(!".".equals(right)) {
            preorder(right);
        }

    }

    public static void inorder(String center) {
        String left =  tree.get(center).left;
        String right = tree.get(center).right;

        if (!".".equals(left)) {
            inorder(left);
            inorderResult.append(center);
        } else {
            inorderResult.append(center);
        }

        if(!".".equals(right)) {
            inorder(right);
        }

    }

    public static void postorder(String center) {
        String left =  tree.get(center).left;
        String right = tree.get(center).right;

        if(!".".equals(left)) {
            postorder(left);
        }

        if(!".".equals(right)) {
            postorder(right);
            postorderResult.append(center);
        } else {
            postorderResult.append(center);
        }

    }


}

class NodeA {
    String left;
    String right;

    public NodeA(String left, String right) {
        this.left = left;
        this.right = right;
    }
}

