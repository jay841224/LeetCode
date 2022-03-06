package note.DFSAndBFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings({ "unchecked" })
public class Bfs {
    public static void main(String[] args) {
        Tree tree = new Tree(12);

        tree.addEdge(0, 1);
        tree.addEdge(1, 2);
        tree.addEdge(1, 3);
        tree.addEdge(2, 4);
        tree.addEdge(2, 5);
        tree.addEdge(4, 8);
        tree.addEdge(4, 9);
        tree.addEdge(3, 6);
        tree.addEdge(3, 7);
        tree.addEdge(7, 10);
        tree.addEdge(7, 11);

        tree.runDFS();
    }

    public static class Tree {
        // 頂點數量
        private int vertexs;

        // 二元樹架構
        private LinkedList<Integer>[] branches;

        private LinkedList<Integer> queue = new LinkedList<>();

        // 建構子，建立容器
        Tree(int vertexs) {
            this.vertexs = vertexs;
            this.branches = new LinkedList[this.vertexs];
            this.visited = new boolean[vertexs];
            for (int i = 0; i < vertexs; i++) {
                this.branches[i] = new LinkedList<>();
            }
        }

        // 建立邊
        public void addEdge(int start, int end) {
            this.branches[start].add(end);
        }

        public void bfsUtil(int point) {
            queue.add(point);
            // 做廣度搜尋
            while (queue.size() > 0) {
                point = queue.poll();
                System.out.println("->" + point);
                Iterator<Integer> iterator = this.branches[point].iterator();
                // 將該點以下的點都加入到 queue 當中，按照先後就會是廣度優先搜尋
                while (iterator.hasNext()) {
                    int next = iterator.next();
                        queue.add(next);
                }
            }

        }

        public void runDFS() {
            bfsUtil(0);
        }
    }
}

// 建立一個二元樹
//        0
//        1
//    2        3
//  4   5    6   7
// 8 9         10 11

// 用BFS搜尋