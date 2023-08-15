package Util;

import java.util.ArrayList;
import java.util.List;

class ColorRange {

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    private String from;
    private String to;
    private int result = 2;

    public List<String> generate() {
        List<String> colorRange = new ArrayList<>();

        int r1 = Integer.parseInt(getFrom().substring(1, 3), 16);
        int g1 = Integer.parseInt(getFrom().substring(3, 5), 16);
        int b1 = Integer.parseInt(getFrom().substring(5, 7), 16);

        int r2 = Integer.parseInt(getTo().substring(1, 3), 16);
        int g2 = Integer.parseInt(getTo().substring(3, 5), 16);
        int b2 = Integer.parseInt(getTo().substring(5, 7), 16);

        for (int i = 0; i < getResult(); i++) {
            float fraction = (float) i / (getResult() - 1);
            int r = (int) (r1 + (r2 - r1) * fraction);
            int g = (int) (g1 + (g2 - g1) * fraction);
            int b = (int) (b1 + (b2 - b1) * fraction);
            String hexColor = String.format("#%02X%02X%02X", r, g, b);
            colorRange.add(hexColor);
        }

        return colorRange;
    }

}