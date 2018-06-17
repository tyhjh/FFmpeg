package com.yorhp.tyhjffmpeg;

import java.io.Serializable;

/**
 * Created by Tyhj on 2017/10/24.
 */
public class Setting implements Serializable {

    //横屏还是竖屏，就是设置满足高度还是宽度来等比压缩分辨率
    private Boolean screenDirection;

    //转换的gif的宽度
    private int gifResolutionWidth;

    //转换的gif的高度
    private int gifResolutionHeight;

    //帧率，每秒钟后多少帧，0-60还是0-30吧大概
    private int gifFrameRates;

    //跳过开始时间，单位为秒
    private int skip;

    //想要转换的时间长度
    private int mp4Time;

    //获取想要转换的gif的分辨率，以宽或者高为准，按比例缩小，避免压缩图片
    public String getGifResolution() {

        if (gifResolutionHeight == 0) {
            return "";
        }

        if (screenDirection) {
            return " -vf scale=" + gifResolutionWidth + ":-1";
        } else {
            return " -vf scale=" + gifResolutionHeight + ":-1";
        }
    }


    public Setting(Boolean screenDirection, int gifResolutionWidth, int gifResolutionHeight, int gifFrameRates, int skip, int mp4Time) {
        this.screenDirection = screenDirection;
        this.gifResolutionWidth = gifResolutionWidth;
        this.gifResolutionHeight = gifResolutionHeight;
        this.gifFrameRates = gifFrameRates;
        this.skip = skip;
        this.mp4Time = mp4Time;
    }

    public Boolean getScreenDirection() {
        return screenDirection;
    }

    public void setScreenDirection(Boolean screenDirection) {
        this.screenDirection = screenDirection;
    }


    public int getGifResolutionWidth() {
        return gifResolutionWidth;
    }

    public void setGifResolutionWidth(int gifResolutionWidth) {
        this.gifResolutionWidth = gifResolutionWidth;
    }

    public int getGifResolutionHeight() {
        return gifResolutionHeight;
    }

    public void setGifResolutionHeight(int gifResolutionHeight) {
        this.gifResolutionHeight = gifResolutionHeight;
    }

    public int getGifFrameRates() {
        return gifFrameRates;
    }

    public void setGifFrameRates(int gifFrameRates) {
        this.gifFrameRates = gifFrameRates;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getMp4Time() {
        return mp4Time;
    }

    public void setMp4Time(int mp4Time) {
        this.mp4Time = mp4Time;
    }
}
