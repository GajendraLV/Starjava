class Shiva{
public int noofavatar;
public String avatarname;
public Shiva(int noofavatar,String avatarname){
this.noofavatar=noofavatar;
this.avatarname=avatarname;
}
public void destroy(){
	System.out.println(noofavatar+","+avatarname);
}
}