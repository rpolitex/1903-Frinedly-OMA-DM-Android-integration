LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := $(call all-java-files-under, java)
LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res
LOCAL_PACKAGE_NAME := FODA



LOCAL_MODULE_TAGS := optional

LOCAL_PRIVATE_PLATFORM_APIS := true
LOCAL_CERTIFICATE := platform
LOCAL_PRIVILEGED_MODULE := true

LOCAL_STATIC_JAVA_LIBRARIES := android-common
LOCAL_STATIC_JAVA_LIBRARIES += android-support-v4
LOCAL_STATIC_JAVA_LIBRARIES += android-support-v7-appcompat
LOCAL_STATIC_JAVA_LIBRARIES += libksoap
LOCAL_STATIC_JAVA_LIBRARIES += libkxml

# dirs
LOCAL_ASSETS_DIR := $(LOCAL_PATH)/assets

# flags
LOCAL_USE_AAPT2 := true
LOCAL_AAPT_FLAGS := --auto-add-overlay
LOCAL_AAPT_FLAGS += --extra-packages org.kxml2 
LOCAL_AAPT_FLAGS += --extra-packages org.ksoap2


# include packages/apps/FODA/sharedLibs/kxml2-2.3.0-android.jar
include $(BUILD_PACKAGE)

include $(CLEAR_VARS)

LOCAL_PREBUILT_STATIC_JAVA_LIBRARIES := libkxml:sharedLibs/kxml2-2.3.0-android.jar
LOCAL_PREBUILT_STATIC_JAVA_LIBRARIES += libksoap:sharedLibs/ksoap2-android-assembly-3.0.0.jar

include $(BUILD_MULTI_PREBUILT)
