package com.yorhp.tyhjffmpeg;


import ffmpeg.FFmpeg;

/**
 * Created by Tyhj on 2017/10/19.
 */

public class Mv2Gif {
    /**
     * 视频转换成GIF，耗时操作，放在后台进行
     * @param pathFrom，原视频路径
     * @param pathTo，转换后保存的位置
     * @param setting，转换的GIF的相关设置
     * @return
     */
    public static boolean convert(String pathFrom, String pathTo, Setting setting) {
        String command = "ffmpeg -i " + pathFrom +
                " -ss " + setting.getSkip() +
                " -t " + setting.getMp4Time() +
                setting.getGifResolution() +
                " -r " + setting.getGifFrameRates() +
                " " + pathTo;
        int result = FFmpeg.getsInstance().run(command.split(" "));
        if (result == 0)
            return true;
        else
            return false;
    }
}
