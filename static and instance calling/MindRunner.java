class MindRunner{
public static void main(String [] args){
Mind mind = new Mind();
Soul soul = new Soul();
soul.felling(mind);
System.out.println("this is"+Mind.heartbeat);
}
}