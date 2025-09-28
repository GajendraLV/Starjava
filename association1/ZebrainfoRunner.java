class ZebrainfoRunner{
public static void main(String [] args){
Zebrainfo info=new Zebrainfo();
Zebra zebra1=new Zebra(255, "gaja",2155555l,  255554d);
Zebra zebra2=new Zebra(455, "raju",2155555l,  255554d);
Zebra zebra3=new Zebra(125, "rani",2155555l,  255554d);
Zebra [] zebra={zebra1,zebra2,zebra3};
info.takinginputarray(zebra);
}
}