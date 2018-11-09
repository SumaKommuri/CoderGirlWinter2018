package patternMakerNew;

import static java.lang.System.out;

public class BrokenWigglePattern extends Pattern{


    public void pattern() {
        boolean needleJam = (Math.random()<0.40d);
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
