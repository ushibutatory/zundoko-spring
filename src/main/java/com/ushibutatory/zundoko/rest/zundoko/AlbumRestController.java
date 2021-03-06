package com.ushibutatory.zundoko.rest.zundoko;

import com.ushibutatory.zundoko.model.zundoko.Album;
import com.ushibutatory.zundoko.model.zundoko.ISong;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * アルバムAPI
 */
@RestController
@RequestMapping("/api/album")
public class AlbumRestController {

    /**
     * すべての歌を取得します。
     *
     * @return 歌リスト
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ISong> all() {
        return Album.getInstance().findAll();
    }

}
