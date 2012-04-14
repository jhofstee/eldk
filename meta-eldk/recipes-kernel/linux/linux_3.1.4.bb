require linux.inc

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_generic-armv4t = "1"
DEFAULT_PREFERENCE_generic-armv5te = "1"
DEFAULT_PREFERENCE_generic-armv6 = "1"
DEFAULT_PREFERENCE_generic-armv7a = "1"
DEFAULT_PREFERENCE_generic-mips = "1"
DEFAULT_PREFERENCE_generic-powerpc = "1"

PR = "r3"

LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.bz2 \
           file://defconfig \
	   "
SRC_URI[md5sum] = "52643e5a013d450ad69627c3cac490cb"
SRC_URI[sha256sum] = "e6252a11063562472eab973cca3153b9c42d897a964fb154d1a48550031ea471"
