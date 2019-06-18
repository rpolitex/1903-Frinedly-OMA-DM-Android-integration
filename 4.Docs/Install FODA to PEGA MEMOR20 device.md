## Install FODA source code
1. Copy FODA sources from `app/src/main` to `android/packages/apps/FODA`.
1. Add app name "FODA" to "PRODUCT_PACKAGES" variable of `android/build/target/product/core.mk`  file.
1. Change `AndroidManifest.xml`: add `android:sharedUserId="android.uid.system"` to the `<manifest>` tag in header
1. Copy `app/sharedLibs` to `android/packages/apps/FODA`.
1. Add `Android.mk`.
1. Check paths in `ConfigUtils.java`

## Overcome SELinux problems
SELinux could block the access of FODA to the various folders and places set in the  `ConfigUtils.java`. Overcome this may take a lot of time and vary from the system-to-system basis.

1. In Datalogic MEMOR20 Q10 device the problem appears with storing of the FODA's data into the persist folder (`/mnt/vendor/persist/misc/com.friendly.foda`). As it starts from `/mnt/vendor` - it is treated by SELinux as a vendor-related dir. 
1. As FODA needs a high-level of permissions, it should be run by the system user and signed by platform key. Due this, FODA has been treated by SELinux as a "system_app". 
1. Starting from Android 9 SELinux security rules ("neverallow") deny writing to the vendor-related dirs for system apps. 
1. To overcome this issue and give the FODA access to the persistent storage we use the workaround: create a separate dir (`/mnt/persist/misc`) and bind mount `/mnt/vendor/persist/misc/com.friendly.foda` dir into it during the boot stage.
1. To implement this, the next files have been modified:
   - `init.target.rc` - startup script, performs creation of the folders and bind mount
   - `android/device/qcom/sepolicy/vendor/common/vendor_init.te` - allow rules for startup script
   - `android/device/datalogic/datalogic-common/sepolicy/system_app.te` - allow rules for FODA
   