package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int indexNum = -1;
        int length = playList.length;

        int up = (indexNum - startIndex + length) % length;     // ((-1) - indexNum + playList.length) remainder of length.
        int down = (startIndex - indexNum + length) % length;   // (indexNum - (-1) + playList.length) remainder of length.

        return Math.min(up, down);  // Returns the smallest of Up and Down.
    }
}
