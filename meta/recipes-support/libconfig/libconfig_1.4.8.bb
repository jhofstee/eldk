SUMMARY = "C/C++ Configuration File Library"
DESCRIPTION = "processing of structured configuration files"
SECTION = "libs"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=fad9b3332be894bab9bc501572864b29"

PR = "r0"

SRC_URI = "http://www.hyperrealm.com/libconfig/libconfig-1.4.8.tar.gz \
"

SRC_URI[md5sum] = "36788da452e9fcfc8efb7661ef5d31ef"
SRC_URI[sha256sum] = "18b1509fbf438a8c7f9b0af32284e458189b5f6dfd044f898926109f3c3c01ed"

inherit autotools
