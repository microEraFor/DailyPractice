import java.util.*;

public class Practice {



    //补全字符串的末尾使之成为回文串，输出最少需要补全的字符数
    public void add(String s){
        if(isPro(s)){
            System.out.println(0);
            return;
        }
        int len=s.length(),center=len/2,l=center-1,r=center+1;
        while(r<len){
            while(s.charAt(l)==s.charAt(r)){
                l-=1;r+=1;
                if(r==len){
                    System.out.println(l+1);
                    return;
                }
            }
            center+=1;
            if(center>=len){
                System.out.println(len-1);
                return;
            }else{
                l=center-1;
                r=center+1;
            }
        }
        if(s.charAt(center)==s.charAt(l)){
            System.out.println(len-2);
            return;
        }
        System.out.println(len-1);
    }

    public boolean isPro(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                l+=1;r-=1;
            }
        }
        return true;
    }

    //原本合法的括号序列多了一个括号，使之变得不合法，请找出所有可能的非法括号，并输出数量和它们的索引（ac）
    public void invalidKuohao(String str){
        int n=str.length();
        StringBuilder tempStr=new StringBuilder(str);
        char[] chars=str.toCharArray();
        int left=0,right=0;
        for(char c:chars){
            if(c=='(') left+=1;
            else right+=1;
        }
        char add= left>right?'(':')';
        List<Integer> indexAns=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(chars[i]==add){
                String t=tempStr.deleteCharAt(i).toString();
                if(isValid(t)){
                    indexAns.add(i+1);
                }
            }
            tempStr=new StringBuilder(str);
        }
        System.out.println(indexAns.size());
        for(int i:indexAns){
            System.out.print(i+" ");
        }

    }

    //匹配括号
    public static boolean isKuoHaoValid(String s){
        s=s.trim();
        if(s.length()==0) return true;
        if(s.length()%2!=0) return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' ||c=='[' ||c=='{' ){
                stack.add(c);
            }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }

    public boolean isValid(String t){
        char[] chars=t.toCharArray();
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<chars.length){
            char temp=chars[i];
            if(temp=='('){
                stack.push(temp);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(stack.peek()=='('){
                    stack.pop();
                }
            }
            i+=1;
        }
        if(!stack.isEmpty()) return false;
        return true;
    }

    //大数相加
    public String superBigNum (String s1, String s2){
        if (s1.length() < s2.length()) {
            return superBigNum(s2, s1);
        }
        StringBuilder ans = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1, add = 0;
        while (i >= 0 || j >= 0) {
            char c1, c2;
            if (j < 0) {
                c1 = s1.charAt(i);
                ans.append((c1 - '0' + add) % 10);
                add = (c1 - '0' + add) / 10;
            } else {
                c1 = s1.charAt(i);
                c2 = s2.charAt(j);
                ans.append(((c1 - '0') + (c2 - '0') + add) % 10);
                add = ((c1 - '0') + (c2 - '0') + add) / 10;
            }
            i -= 1;
            j -= 1;
        }
        if (add != 0) {
            ans.append(add);
        }
        return ans.reverse().toString();
    }

    //输出字符串所有子串
    public static List<String> subStrings(String s){
        List<String> ans=new ArrayList<>();
        if(s.length()==0) return ans;
        Set<String> set=new HashSet<>();
        String left="",right="";
        for(int i=0;i<s.length();i++){
            for(int j=0;i+j<=s.length();j++){
                set.add(s.substring(i,i+j));
            }
        }
        for(String str:set){
            ans.add(str);
        }
        return ans;
    }

    //十进制转二进制
    public static String convert(int n){
        StringBuilder sb=new StringBuilder();
        int remain=0;
        while(n!=0){
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }

}
