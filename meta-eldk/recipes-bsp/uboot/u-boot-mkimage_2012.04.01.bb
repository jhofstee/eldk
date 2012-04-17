DESCRIPTION = "U-boot bootloader mkimage tool"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb \
                    file://README;beginline=1;endline=22;md5=78b195c11cb6ef63e6985140db7d7bab"
SECTION = "bootloader"

PR = "r0"

# This revision corresponds to the tag "v2012.04.01"
# We use the revision in order to avoid having to fetch it from the repo during parse
SRCREV = "415d386877df49eb051b85ef74fa59a16dc17c7d"

SRC_URI = "git://git.denx.de/u-boot.git;branch=master;protocol=git"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"

EXTRA_OEMAKE = 'CROSS_COMPILE="${TARGET_PREFIX}" HOSTCC="${CC}" HOSTLD="${LD}" HOSTLDFLAGS="${LDFLAGS}" HOSTSTRIP=true'

do_compile () {
  oe_runmake tools
}

do_install () {
  install -d ${D}${bindir}
  install -m 0755 tools/mkimage ${D}${bindir}/mkimage
}
