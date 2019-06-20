package com.friendly.foda.sdk.utils.config;


import android.content.Context;

import com.friendly.foda.sdk.utils.device.DeviceUtils;
import com.friendly.foda.sdk.utils.properties.PropertiesUtils;

public class ConfigUtils {

    //    public static final String MANAGEMENT_TREE_CONFIG_FILE = "tree.xml";
    public static final String FIRMWARE_FILE_NAME = "update.zip";

    public static final String FIRMWARE_DESTINATION_FILE_ABSOLUTE_PATH = "/data/data/com.friendly.foda/" + FIRMWARE_FILE_NAME;

//    public static final String FIRMWARE_DESTINATION_FILE_ABSOLUTE_PATH = "/data/data/com.friendly.foda/files/"
//            + FIRMWARE_FILE_NAME;


    public static final String MANAGEMENT_TREE_CONFIG_FILE = "ftomadmtree.xml";
    public static final String FODA_CONFIG_FILE = "config.cfg";
    //    public static final String FODA_CACHE_FOLDER = "/cache/";
//    public static final String FODA_CACHE_FOLDER = "/data/data/com.friendly.foda/";
//    public static final String FODA_CACHE_FOLDER = "/persist/misc/";
    public static final String FODA_CACHE_FOLDER = "/mnt/persist/misc/com.friendly.foda/";

    public static final String FODA_CONFIG_FILE_CACHE_ABSOLUTE_PATH = FODA_CACHE_FOLDER + FODA_CONFIG_FILE;
    public static final String FODA_SERVER_CERTIFICATE_FILE = "server-cert.crt";
    public static final String FODA_SERVER_DNS_NAME = "testm2m.friendly-tech.com";
    public static final String FIRMWARE_COMMAND_FILE = "command";
    public static final String FIRMWARE_NEED_VERSION = "needfirmwareversion";
    public static final String RECOVERY_COMMAND_FILE = FODA_CACHE_FOLDER + "recovery/command";
    //FODS Web Service invocation namespace and credentials
    public static final String FODS_NAMESPACE_PARAMETER = "namespace";
    //    public static final String FODS_WSDL_URL_PARAMETER = "fodsWsdlURL";
    public static final String FODS_WSDL_RELATIVE_PATH_PARAMETER = "fodsWsdlRelativePath";
    public static final String FODS_WEB_SERVICE_USER_PARAMETER = "fodsWebServiceUser";
    public static final String FODS_WEB_SERVICE_PASSWORD = "fodsWebServicePassword";
    public static final String DOWNLOAD_APP_CHANGE_CHECK_INTERVAL = "downloadApplicationsChangeCheckInterval";
    public static final String DEPLOYED_APP_CHANGE_CHECK_INTERVAL = "deployedApplicationsChangeCheckInterval";
    public static final String APN_CHANGES_CHECK_INTERVAL = "apnChangesCheckInterval";
    public static final String CREDENTIALS_PROVIDER = "credentialsProvider";
    public static final String PERIODIC_INTERVAL = "periodicInterval";
    public static final String GOOGLE_PLAY_DOWNLOADED_APK_PATH = "/data/data/com.friendly.foda/files/";

    public static final String GOOGLE_PLAY_FODA_USER = "fodaPlayUserName";
    public static final String GOOGLE_PLAY_FODA_PASSWORD = "fodaPlayPassword";

    public static final String SYSTEM_UPDATE_CHECKER_PACKAGE = "systemUpdateCheckerPackage";
    public static final String SYSTEM_UPDATE_CHECKER_CLASS = "systemUpdateCheckerClass";
    public static final String WAIT_BEFORE_REBOOT = "waitBeforeReboot";
    public static final String EXTERNAL_STORAGE_MOUNT_PATH = "externalStorageMountPath";
    public static final String SYSTEM_UPDATE_CHECKER_INTENT_ACTION = "systemUpdateCheckerIntentAction";

    public static final String FODS_URL_CONFIG_PROPERTY = "fodsURL";
    public static final String FODS_USER_NAME_PROPERTY = "fodsUserName";
    public static final String FODS_USER_PASSWORD_PROPERTY = "fodsUserPassword";
    public static final String FODS_SERVER_NAME_PROPERTY = "fodsServerName";
    public static final String FODS_SERVER_PASSWORD_PROPERTY = "fodsServerPassword";

    public static final String FODS_SERVER_ADDRESS_PATH = "./DMAcc/FODS/AppAddr/APPSRV/Addr";
    //    public static final String FODS_SERVER_PORT_PATH = "./DMAcc/FODS/AppAddr/APPSRV/Port/Port/PortNbr";
    public static final String FODS_SERVER_NAME_PATH = "./DMAcc/FODS/AppAuth/APPSRV/AAuthName";
    public static final String FODS_SERVER_PASSWORD_PATH = "./DMAcc/FODS/AppAuth/APPSRV/AAuthSecret";
    public static final String FODS_USER_NAME_PATH = "./DMAcc/FODS/AppAuth/CLIENT/AAuthName";
    public static final String FODS_USER_PASSWORD_PATH = "./DMAcc/FODS/AppAuth/CLIENT/AAuthSecret";
    public static final String CACHE_DIR_ABSOLUTE_PATH = "/mnt/persist/misc/com.friendly.foda";
    public static final String CACHE_RECOVERY_DIR_ABSOLUTE_PATH = CACHE_DIR_ABSOLUTE_PATH + "/recovery";

    public static String getDeviceIMEI(Context context) throws Exception {
        DeviceUtils deviceUtils = new DeviceUtils(context);
        return deviceUtils.buildIMEIString();
    }

    public static long getDownloadAppChangeCheckInterval(Context context) throws Exception {
        return Long.valueOf(PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, DOWNLOAD_APP_CHANGE_CHECK_INTERVAL));
    }

    public static long getDeployedAppChangeCheckInterval(Context context) throws Exception {
        return Long.valueOf(PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, DEPLOYED_APP_CHANGE_CHECK_INTERVAL));
    }

    public static long getApnChangesCheckInterval(Context context) throws Exception {
        return Long.valueOf(PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, APN_CHANGES_CHECK_INTERVAL));
    }

    public static String getCredentialsProvider(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, CREDENTIALS_PROVIDER);
    }

    public static String getFodsUserName(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, FODS_USER_NAME_PROPERTY);
    }

    public static String getFodsUserPassword(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, FODS_USER_PASSWORD_PROPERTY);
    }

    public static long getPeriodicInterval(Context context) throws Exception {
        return Long.valueOf(PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, PERIODIC_INTERVAL));
    }

    public static String getGooglePlayFodaUser(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, GOOGLE_PLAY_FODA_USER);
    }

    public static String getGooglePlayFodaPassword(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, GOOGLE_PLAY_FODA_PASSWORD);
    }

    public static String getSystemUpdateCheckerPackage(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, SYSTEM_UPDATE_CHECKER_PACKAGE);
    }

    public static String getSystemUpdateCheckerClass(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, SYSTEM_UPDATE_CHECKER_CLASS);
    }

    public static String getWaitBeforeReboot(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, WAIT_BEFORE_REBOOT);
    }

    public static String getExternalStorageMountPath(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, EXTERNAL_STORAGE_MOUNT_PATH);
    }

    public static String getSystemUpdateCheckerIntentAction(Context context) throws Exception {
        return PropertiesUtils.getPropertyValue(context, FODA_CONFIG_FILE, SYSTEM_UPDATE_CHECKER_INTENT_ACTION);
    }
}
