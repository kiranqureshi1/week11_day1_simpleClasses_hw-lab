public class WaterBottle {
    private int volume = 100;

    public WaterBottle(){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void emptyBottle(){
       this.volume -= 10;
    }

    public void emptyBottleCompletely(){
        this.volume = 0;

    }

    public void fillBottle(){
        this.volume = 100;
    }






}
