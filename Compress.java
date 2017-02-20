public class Compress{
    
    static void find(String s){
        int size = compressCount(s);
            System.out.println(size); 
            if(size >= s.length()){
                System.out.println(s);
            }
            
            char last = s.charAt(0);
            int count = 1;
            StringBuffer sb = new StringBuffer();
            
            for(int i=1 ;i <s.length(); i++){
            if(s.charAt(i) == last)
                count++;
                else{
                    
                    sb.append(last);
                    sb.append(count);
                    last = s.charAt(i); 
                    count =1;
                }
        }
        
        sb.append(last);
        sb.append(count);
        
        System.out.println(sb.toString());
    }
    
    public static int compressCount(String s){
        if(s== null || s.isEmpty()) return 0;
        char last = s.charAt(0);
        int count = 1;
        int size = 0;
        
        for(int i=1 ;i <s.length(); i++){
            if(s.charAt(i) == last)
                count++;
                else{
                    last = s.charAt(i);
                    size += 1+String.valueOf(count).length();
                    count =1;
                }
        }
        size += 1+String.valueOf(count).length();
        return size;
    }
    
    public static void main(String[] args){
        Compress.find("aaabbbc");        
    }
}