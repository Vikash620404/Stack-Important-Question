class Solution {
    public boolean isValid(String s) {
Stack<Character> stack=new Stack<>()
;
for(char c:s.toCharArray()){ // convert string into char
    if(c=='('||c=='{'||c=='['){
        stack.add(c);
    }else{
if(stack.isEmpty()) return false;
if(c==']'&&stack .peek()!='[') return false;
if(c=='}'&&stack .peek()!='{') return false;
if(c==')'&&stack .peek()!='(') return false;


        stack.pop();
    }
}
return stack.isEmpty();

        
    }
}





//O(N)
//O(N)
