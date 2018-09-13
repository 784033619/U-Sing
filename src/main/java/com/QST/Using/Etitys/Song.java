package com.QST.Using.Etitys;

public class Song {
    private Integer id;

    private String title;

    private Integer length;

    private String pic;

    private String lrc;

    private Integer albumId;

    private Integer playTimes;

    private String md5file;

    public Song(Integer id, String title, Integer length, String pic, String lrc, Integer albumId, Integer playTimes, String md5file) {
        this.id = id;
        this.title = title;
        this.length = length;
        this.pic = pic;
        this.lrc = lrc;
        this.albumId = albumId;
        this.playTimes = playTimes;
        this.md5file = md5file;
    }

    public Song() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getLrc() {
        return lrc;
    }

    public void setLrc(String lrc) {
        this.lrc = lrc == null ? null : lrc.trim();
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
    }

    public String getMd5file() {
        return md5file;
    }

    public void setMd5file(String md5file) {
        this.md5file = md5file == null ? null : md5file.trim();
    }
}