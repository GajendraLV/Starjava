class MallinfoRunner{
public static void main(String [] args){
Mallinfo mall=new Mallinfo();
Mall mall1=new Mall(100, "gaja",'A', 215555d, 345455555l);
Mall mall2=new Mall(200, "sun", 'b', 2545455d, 545445444l);
Mall mall3=new Mall(300, "moon", 'c', 245454855d, 35654655l);
Mall [] sahoo={mall1,mall2,mall3};
mall.takinginputarray(sahoo);	
}
}