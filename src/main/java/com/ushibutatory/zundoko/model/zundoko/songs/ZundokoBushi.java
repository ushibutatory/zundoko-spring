package com.ushibutatory.zundoko.model.zundoko.songs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ずんどこ節
 */
public class ZundokoBushi extends AbstractSong {

    @Override
    public String getName() {
        return "ズンドコ節";
    }

    @Override
    protected List<String> _createUsingPhrases() {
        return new ArrayList<>(Arrays.asList("ズン", "ドコ"));
    }

    @Override
    protected List<Integer> _createCompletePhraseIndexes() {
        return new ArrayList<>(Arrays.asList(0, 0, 0, 0, 1));
    }

    @Override
    protected String _createShoutPhrase() {
        return "＼キ・ヨ・シ！／";
    }
}
