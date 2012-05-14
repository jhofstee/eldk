require linux.inc

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_generic-armv4t = "1"
DEFAULT_PREFERENCE_generic-armv5te = "1"
DEFAULT_PREFERENCE_generic-armv6 = "1"
DEFAULT_PREFERENCE_generic-armv7a = "1"
DEFAULT_PREFERENCE_generic-mips = "1"
DEFAULT_PREFERENCE_generic-powerpc = "1"
DEFAULT_PREFERENCE_generic-powerpc-softfloat = "1"
DEFAULT_PREFERENCE_generic-powerpc-4xx = "1"
DEFAULT_PREFERENCE_generic-powerpc-4xx-softfloat = "1"
DEFAULT_PREFERENCE_generic-powerpc-e500v2 = "1"

PR = "r3"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.bz2 \
           file://defconfig \
	   "
SRC_URI[md5sum] = "a6897310b4785b5f912c567cdc93402e"
SRC_URI[sha256sum] = "68858903c278a50aada43d918cf0c8393b85cb17d28587ceaa5bf0241ab1b8b8"
