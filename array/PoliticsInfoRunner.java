class PoliticsInfoRunner{
public static void main(String [] args){
PoliticsInfo info=new  PoliticsInfo();
Politics politics1=new Politics(100, "gaja",255f,'A');
Politics politics2=new Politics(200, "garuda",588f,'b');
Politics politics3=new Politics(100, "raju",877f,'c');
Politics [] PoliticsInfo={politics1,politics2,politics3};
info.takingInputarray(PoliticsInfo);
}
}