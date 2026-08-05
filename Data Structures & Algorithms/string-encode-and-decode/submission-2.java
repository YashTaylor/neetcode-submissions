class Solution {

    public String encode(List<String> strs) {
        StringBuilder word = new StringBuilder();
        for(String s : strs) {
            word.append(s.length());
            word.append('#');
            word.append(s);
        }
        return word.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int length = 0;

            while(str.charAt(i) != '#') {
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String word = str.substring(i, i + length);
            ans.add(word);
            i += length;
        }
        return ans;
    }
}
