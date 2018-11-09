package patternMakerNew;

import java.util.ArrayList;

import static java.lang.System.out;

public class TapestryController {

    private ArrayList<Pattern> patternList = new ArrayList<>();

    private void addPattern(Pattern p) {
        this.patternList.add(p);

    }

    public static void main(String[] args) {

        TapestryController control = new TapestryController();


        Pattern crossStitchWigglePattern  = new CrossStitchWigglePattern();
        Pattern zigZagLinesPattern = new ZigZagLinesPattern();
        Pattern baublePattern = new BaublePattern();
        Pattern blockyBaublePattern = new BlockyBaublePattern();
        Pattern brokenWigglePattern =new BrokenWigglePattern();
        control.addPattern(crossStitchWigglePattern);
        control.addPattern(zigZagLinesPattern);
        control.addPattern(baublePattern);
        control.addPattern(blockyBaublePattern);
        control.addPattern(brokenWigglePattern);


        if (control.patternList.size() != 0) {
            for (int i = 0; i < control.patternList.size(); i++) {
                for (int x = 0; x < 3; x++) {
                    for (int y=0;y<8;y++) {
                        control.patternList.get(i).pattern();
                        out.print(" ");
                    }
                    out.println();
                }
                out.println("\n\n");
                for (int x = 0; x < 8; x++) {
                    for (int y=0;y<6;y++) {
                        control.patternList.get(i).pattern();
                        out.print(" ");

                    }
                    out.println();
                }
                out.println("\n");
            }
        }

    }
}
