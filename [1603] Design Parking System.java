class ParkingSystem {
    int big,medium,small;
    int[] now=new int[]{0,0,0};

    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
        
    }
    
    public boolean addCar(int carType) {
        if((big==now[0] && carType==1) || (medium==now[1] && carType==2)|| (small==now[2] && carType==3))
            return false;
        now[carType-1]++;
        return true;

    }
}
