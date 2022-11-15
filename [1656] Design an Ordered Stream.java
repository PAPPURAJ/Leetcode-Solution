class OrderedStream {

    String[] in;
    int len,ptr=0;

    public OrderedStream(int n) {
        in=new String[n];
        len=n;
    }
    
    public List<String> insert(int idKey, String value) {

        in[idKey-1]=value;
        List<String> l=new ArrayList<>();

        for(;ptr<len && in[ptr]!=null;ptr++)
            l.add(in[ptr]);
        
        return l;
        
    }
}
