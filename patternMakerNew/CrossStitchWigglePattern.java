package patternMakerNew;

import static java.lang.System.out;

public class CrossStitchWigglePattern extends Pattern{


    public void pattern() {
        boolean needleJam = (Math.random()<0.05d);
        for (int i = 0; i < 5; i++) {
            smallCrossStitch.sew();
            if(i==2 && needleJam){
                out.print("     ");
                break;
            }
            largeCrossStitch.sew();

        }
    }

}
