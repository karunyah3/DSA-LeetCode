class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String str){
        Stack <Character>stack=new Stack<>();
        for (char ch:str.toCharArray()){
            if(ch!='#'){
                stack.push(ch);

            }
            else if(!stack.isEmpty()){
                stack.pop();
            }

        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}