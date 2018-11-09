package patternMakerNew;

public class ZigZagLinesPattern extends Pattern{



    public void pattern(){
        for(int i=0; i<2;i++){
            for(int x=0;x<3;x++){
                zigZagStitch.sew();
            }
            for(int x=0;x<3;x++){
                fillStitch.sew();
            }
        }
    }

}
