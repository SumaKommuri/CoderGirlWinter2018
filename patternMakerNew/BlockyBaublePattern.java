package patternMakerNew;

import static java.lang.System.out;

public class BlockyBaublePattern extends Pattern {

    @Override
    public void pattern() {

        boolean needleJam = (Math.random() < 0.05d);
        for (int i = 0; i < 3; i++) {
            blockStitch.sew();
            shortLineStitch.sew();
            shortLineStitch.sew();
            if (i == 1 && needleJam) {
                out.print("          ");
                break;
            }
            circleStitch.sew();
            shortLineStitch.sew();
            shortLineStitch.sew();
        }


    }

}
