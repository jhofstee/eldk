DESCRIPTION = "Adapted version of python-inotify for mcx"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab173cade7965b411528464589a08382"

DEPENDS = "python"

SRC_URI = "file://Makefile \
	file://inotify_syscalls.c \
	file://COPYING \
	"

S = "${WORKDIR}"

FILES_${PN} = "${libdir} ${libdir}/inotify_syscalls.so"

CFLAGS_prepend = "-I${STAGING_DIR_TARGET}${includedir}/python2.7"

do_install () {
	install -d ${D}/usr/lib
	install -m 644 ${S}/inotify_syscalls.so ${D}/usr/lib/
}

BBCLASSEXTEND = "native"

