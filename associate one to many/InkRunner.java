class InkRunner{
public static void main(String [] args){
Ink ink=new Ink(658, "Herbin");
Ink inkone=new Ink(987, "Diamine");
Ink inktwo=new Ink(897, "colorverse");
GelPen gelpen=new GelPen(521, "pilot", ink);
NoveltyPens noveltypens=new NoveltyPens(452, "Fujifilm",inkone);
StylusPens styluspens=new StylusPens(850, "lampy", inktwo);
gelpen.displaygelpen();
noveltypens.displayNoveltyPens();
styluspens.displayStyluspens();
}
}