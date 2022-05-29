public class Solution {
    /**
     * @param board: A list of lists of character
     * @param words: A list of string
     * @return: A list of string
     */
    public List<String> wordSearchII(char[][] board, List<String> words) {
        // write your code here
        if (board == null || board.length == 0)
            return new ArrayList<>();
        if (board[0] == null || board[0].length == 0)
            return new ArrayList<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        Set<String> wordSet = new HashSet<>();
        Set<String> prefixSet = new HashSet<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                prefixSet.add(word.substring(0, i + 1));
            }
            wordSet.add(word);
        }
        Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                visited[i][j] = true;
                dfs(board, visited, i, j, String.valueOf(board[i][j]), wordSet, prefixSet, resultSet);
                visited[i][j] = false;
            }
        }
        return new ArrayList<String>(resultSet);
    }

    private void dfs(char[][] board, boolean[][] visited, int x, int y, String word, Set<String> wordSet,
            Set<String> prefixSet, Set<String> resultSet) {
        if (!prefixSet.contains(word)) {
            return;
        }
        if (wordSet.contains(word)) {
            resultSet.add(word);
        }
        for (int i = 0; i < 4; i++) {
            int adjX = x + dx[i];
            int adjY = y + dx[i];
            if (!inside(board, adjX, adjY) || visited[adjX][adjY]) {
                continue;
            }
            visited[adjX][adjY] = true;
            dfs(board, visited, adjX, adjY, word + board[adjX][adjY], wordSet, prefixSet, resultSet);
            visited[adjX][adjY] = false;
        }
    }

    private boolean inside(char[][] board, int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length;
    }
}