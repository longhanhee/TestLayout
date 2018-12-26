package com.gtv.hanhee.testlayout.api;

/**
 * Created by Hoang Nam on 19/03/2017.
 */

public interface Constants {
//    String API_ENDPOINT = "http://192.168.1.144:3003/api/";
//    String API_ENDPOINT2 = "http://192.168.1.144:3003";
  String API_ENDPOINT = "http://dev.sieuloinhuan.net/api/";
   String API_ENDPOINT2 = "http://dev.sieuloinhuan.net";

    String API_UPLOAD = "https://storage.sieuloinhuan.net/api/";

    String TOKEN_ID = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1YmUyNWQ1MjczMTdmMjVhMjY0ZDVlNGEiLCJuYW1lIjoiTG9uZyBOZ3V54buFbiIsInBob25lIjoiIiwiYXZhdGFyIjoiaHR0cHM6Ly9ncmFwaC5mYWNlYm9vay5jb20vMjQ4ODE2MTYyMTIwODg2NC9waWN0dXJlIiwiaXNVcGRhdGUiOnRydWUsIndlZWtOdW1iZXIiOjM1LCJkYXlOdW1iZXIiOjYsInByb3ZpZGVyIjoiZmFjZWJvb2siLCJyb2xlIjoidXNlciIsImRldmljZVRva2VuIjoiZjEwRTZQTm44OEk6QVBBOTFiRVpEZ2VwendEMmRCYm4xMllnUktkSW4yR1pMdFBZbklFSG9PWS1JVURtRmtmYUJURjlQTVlweG1meTlwRk9Ddlk0WlZSMWpuSXRQOXU0WUR3MF9FMkMtaVFkSDE1VFJmYS1xcnZLcG1HZFFwRHh2UU5SV2lwZGF1OGlBZHJWODM2U21GR2giLCJzY29yZSI6NzQ5LCJpYXQiOjE1NDM2ODAxOTMsImV4cCI6MTU0NDI4NDk5M30.X2opAP8iGGbg0yCPwTbz7PcnqiEdu4zofj8bVXx0pps";
    boolean DEBUG_MODE = true;
    public static int MULTITYPE_NORMAL = 0;
    public static int MULTITYPE_IMAGE = 1;
    public static int MULTITYPE_TEXT = 2;
    public static int MULTITYPE_ADS = 3;
    //Picture Selector
    public static int MAX_SELECT_IMAGE_VIDEO = 5;
    public static int MIN_SELECT_IMAGE_VIDEO = 1;
    public static int SPAN_COUNT = 1;
    public static boolean PREVIEW_IMAGE = false;
    public static boolean IS_CAMERA = true;
    public static boolean ENABLE_CROP = false;
    public static int GLIDE_OVERRIDE_WIDTH = 160;
    public static int GLIDE_OVERRIDE_HEIGH = 160;
    //File
    public static final String SUFFIX_TXT = ".txt";
    public static final String SUFFIX_PDF = ".pdf";
    public static final String SUFFIX_EPUB = ".epub";
    public static final String SUFFIX_ZIP = ".zip";
    public static final String SUFFIX_CHM = ".chm";

    public static final int TEXT_TYPE = 0;
    public static final int BACKGROUND_TYPE = 1;
    public static final int IMAGE_TYPE = 2;
    public static final int VIDEO_TYPE = 3;
    public static final int LINK_TYPE = 4;
    public interface ACTION {
        public static String MAIN_ACTION = "com.marothiatechs.customnotification.action.main";
        public static String INIT_ACTION = "com.marothiatechs.customnotification.action.init";
        public static String PREV_ACTION = "com.marothiatechs.customnotification.action.prev";
        public static String PLAY_ACTION = "com.marothiatechs.customnotification.action.play";
        public static String NEXT_ACTION = "com.marothiatechs.customnotification.action.next";
        public static String STARTFOREGROUND_ACTION = "com.marothiatechs.customnotification.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.marothiatechs.customnotification.action.stopforeground";
    }
    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }

}