//
//  Main.java
//  u3-enumerations
//
//  Created by Fernando Pastor on 31/7/24
//

public class Main {

    public static void main(String[] args) {
        System.out.println("ENUM TEST:");
//TIP To <shortcut actionId="ShowIntentionActions"/> code, press <shortcut actionId="Run"/> or
//click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        for (MyColours col : MyColours.values()) {
            System.out.println(col.name() + ">> RGB: #" + col.getRgbValue() + ", RGBA: #" + col.getRgbaValue());
        }
    }

    public enum MyColours {
        RED("FF0000", "FF000000"),
        GREEN("00FF00", "00FF0000"),
        BLUE("0000FF", "0000FF00"),
        BLACK("000000", "00000000"),
        WHITE("FFFFFF", "FFFFFF00");

        private final String rgbValue;
        private final String rgbaValue;

        MyColours(String rgbValue, String rgbaValue) {
            this.rgbValue = rgbValue;
            this.rgbaValue = rgbaValue;
        }

        public String getRgbValue() {
            return rgbValue;
        }

        public String getRgbaValue() {
            return rgbaValue;
        }
    }
}