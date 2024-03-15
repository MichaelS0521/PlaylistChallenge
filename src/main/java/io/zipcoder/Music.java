package io.zipcoder;

import java.util.Objects;

public class Music {

    private String[] playList;  // Initializes playList[]

    /*
    Constructor for playList.
     */
    public Music(String[] playList){
        this.playList = playList;
    }

    /*
    Crate an up and down solution that checks through playList[] and finds Selected Integer.
     */
    public Integer selection(Integer startIndex, String selection){
        int indexNum = -1;  // Needed index.
        int length = playList.length;   // playList length.
        int up = 0;     // Initializes up.
        int down = 0;   // Initializes down.

        for (int i = startIndex; i < length; i++) {
            if (Objects.equals(playList[i], selection)) {
                up = (indexNum - startIndex + length) % length;     // ((-1) - indexNum + playList.length) remainder of length.
                down = (startIndex - indexNum + length) % length;   // (indexNum - (-1) + playList.length) remainder of length.
            }
        }

        return Math.min(up, down);  // Returns the smallest of Up and Down.

    }
}
