class Solution {

    public String encode(List<String> strs) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            res.append(strs.get(i).length());
            res.append('#');
            res.append(strs.get(i));
        }
        return res.toString();
    }
    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            list.add(str.substring(i,i+length));
            i+=length;
        }
        return list;
    }
}
