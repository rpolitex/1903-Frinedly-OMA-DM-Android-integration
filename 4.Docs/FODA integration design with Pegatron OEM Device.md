# FODA integration design with Pegatron OEM Device

## Abstract

The integration process aim is to embed Friendly OMA-DM Client Application (mentioned further as *FODA*) with Android Open Source Project-based system image and provide seamless run of the FODA on the Pegatron OEM Device (mentioned further as *Device*). 



## Key components

The next components involves in interaction during the integration process:

- FODA Client Application
- Android Open Source Project (release Pie with Pegatron's patches and customization), includes:
  - SELinux security subsystem
  - Android Linux startup/init subsystem
- AOSP building system (with Pegatron's patches and customization) 



## Main design concepts

1. FODA added to the AOSP building system as one of the system packages
2. AOSP  building system builds FODA as privileged app
3. FODA becomes part of the AOSP system image
4. FODA runs as system app
5. During a startup Linux init script creates and mounts all directories needed for a FODA
6. To resist against a "Factory reset"/"User data wipe" FODA preserve it's settings in *persist* path
7. SELinux security rules need to be tuned to grant access for options mentioned above

