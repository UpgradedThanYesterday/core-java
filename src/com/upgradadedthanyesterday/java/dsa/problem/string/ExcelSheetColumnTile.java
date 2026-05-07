package com.upgradadedthanyesterday.java.dsa.problem.string;

/**
 * Problem statement can be found here. {@see - ExcelSheetColumnTileProblemStatement.txt}
 */
public class ExcelSheetColumnTile {
    private static final String EMPTY = "";

    /**
     * Given method to convert tile index to corresponding tile name
     * @param columnNumber
     * @return
     */
    public String convertToTitle(int columnNumber) {
        if(columnNumber <= 0) {
            return EMPTY; // to handle edge case
        }
        if(columnNumber>26) {
            StringBuilder stringBuilder = new StringBuilder();
            while(columnNumber>26) {
//                columnNumber--;
                int reminder = columnNumber%26;
                if(reminder == 0) {
                    reminder = 26;
                    columnNumber = columnNumber-1;
                }
                stringBuilder.append(getTileName(reminder));
                columnNumber = columnNumber/26;
            }
            stringBuilder.append(getTileName(columnNumber));
            return stringBuilder.reverse().toString();
        }
        return getTileName(columnNumber);
    }

    /**
     * This method will return the corresponding Mapped value.
     * example 1:A, 2:B, 3:C, ....., 26:Z
     * @param index
     * @return
     */
    public String getTileName(int index) {
        char c = (char) ('A' + index-1);
        return Character.toString(c);
    }

    public static void main(String[] args) {
        ExcelSheetColumnTile excelSheetColumnTile = new ExcelSheetColumnTile();
        System.out.println(excelSheetColumnTile.convertToTitle(1430));
    }
}
