package komputer;

public class Monitor {
    private int widith = 3840;
    private int height = 1920;

    public void setLowResolution(){
        widith = 800;
        height = 600;
    }
    public void setHigResolution(){
        widith = 3840;
        height = 1920;
    }

    public String getResolution(){
        return widith + "x" + height;
    }
}
