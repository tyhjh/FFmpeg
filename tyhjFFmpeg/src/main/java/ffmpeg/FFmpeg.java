package ffmpeg;

public class FFmpeg {

    private static FFmpeg sInstance ;

    public static FFmpeg getsInstance(){
        if(sInstance == null) {
            sInstance = new FFmpeg();
        }
        return sInstance;
    }

    public native int run(String[] commands);

    public native String avcodecinfo();

    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("swscale-4");
        System.loadLibrary("avformat-57");
    }
}