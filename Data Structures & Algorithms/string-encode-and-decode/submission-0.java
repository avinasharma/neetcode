class Solution {

    public String encode(List<String> strs) {
        StringBuilder finalEncoded = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            int strlen = strs.get(i).length();
            finalEncoded.append(strlen + "#" + strs.get(i));
        }
        return finalEncoded.toString();
    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        int j = str.indexOf('#', i);         // find the '#'
        int len = Integer.parseInt(str.substring(i, j));  // extract length
        result.add(str.substring(j + 1, j + 1 + len));   // extract the word
        i = j + 1 + len;                     // move pointer forward
    }
    return result;
}
}
