DESCRIPTION = "Application for automatic software update from USB Pen"
SECTION="swupdate"
DEPENDS = "mtd-utils-mcx libconfig"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

PR = "r0"

#SRCREV = "b22e93e0b209466ab6faf576ec14d7479754598e"
SRCREV = "HEAD"
SRC_URI = "git:///home/stefano/Projects/Helbling/mcx/swupdate;protocol=file"

S = "${WORKDIR}/git/"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS} -I${S}/include -I${S}/ubi-utils/include'"

do_install () {
	install -d ${D}${bindir}/
	install -m 0755 swupdate ${D}${bindir}/
}

PARALLEL_MAKE = ""
