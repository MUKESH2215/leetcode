class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // The first element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            // We update the row in reverse to avoid overwriting values we still need
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // The last element is always 1
        }

        return row;
    }
}