class School {
    public void showStaff(Staff[] staffArray) {
        System.out.println(staffArray.length);
        for (int num = 0; num < staffArray.length; num++) {
            Staff staffMember = staffArray[num];
            staffMember.details();
        }
    }
}
