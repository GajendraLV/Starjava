public class Staff {
    public int staffId;
    public String staffName;

    public Staff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    public void details() {
        System.out.println(staffId + ", " + staffName);
    }
}
