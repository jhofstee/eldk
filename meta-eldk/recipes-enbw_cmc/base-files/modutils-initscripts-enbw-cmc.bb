# based on modutils-initscripts package definition
# changed behavior of modutils.sh - removed -Ae option from depmod because its not supported
# init script start moved after file system mount to prevent errors on RO file system

SECTION = "base"
DESCRIPTION = "modutils configuration files"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7bf87fc37976e93ec66ad84fac58c098"
SRC_URI = "file://modutils.sh \
	   file://PD.patch"
PR = "r6"

INITSCRIPT_NAME = "modutils.sh"
INITSCRIPT_PARAMS = "start 36 S ."

inherit update-rc.d

do_compile () {
}

do_install () {
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/modutils.sh ${D}${sysconfdir}/init.d/
}
