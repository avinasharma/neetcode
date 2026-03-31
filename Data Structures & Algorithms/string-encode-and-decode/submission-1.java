class Solution {

    public String encode(List<String> strs) {
        StringBuilder finalEncoded = new StringBuilder();
        for (int i=0; i<strs.size(); i++){
            int strlen = strs.get(i).length();
            finalEncoded.append(strlen + "#" + strs.get(i));
        }
        return finalEncoded.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i< str.length()){
            int j =str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j+1, j+1+len));
            i = j+1+len;

        }
        return result;

    }
}
