public class Codec {
    char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    String s="",pre="http://tinyurl.com/";
    int index=0;
    HashMap<String,String> hashMap=new HashMap<>();


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        index++;
        while(index>0){
            s=String.valueOf(map[index-1])+s;
            index/=62;
        }
        hashMap.put(s,longUrl);   
        return pre+s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hashMap.get(shortUrl.substring(19));
        
    }
}
