package patternMakerNew;

public class BaublePattern extends Pattern{


    public void pattern(){
        for(int i=0;i<5;i++){
            shortLineStitch.sew();
            shortLineStitch.sew();
            circleStitch.sew();
        }
    }
}
