SUMMARY = "U-Boot enviroment tools"
DESCRIPTION = "install fw_setenv, fw_printenv and fw_env.config "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb \
                    file://README;beginline=1;endline=22;md5=efde3a88b3a9849a9e9c7be479edbf13"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-testing-git/${MACHINE}"

# This revision corresponds to the tag "enbw_cmc"
# We use the revision in order to avoid having to fetch it from the repo during parse
SRCREV = "ccd5912d70a5d1a2814ce95e516b84f0da042fa3"

PV = "git${SRCPV}"
PR = "r0"

SRC_URI = "git://git.denx.de/u-boot-testing.git;branch=enbw_cmc;protocol=git \
	   file://fw_env.config"

S = "${WORKDIR}/git"

inherit autotools

do_compile () {
        oe_runmake HOSTCC="${CC}" env
}

do_install () {
	install -d ${D}${sysconfdir} ${D}/usr/bin
        install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}
        install ${S}/tools/env/fw_printenv ${D}/usr/bin
        ln -sf fw_printenv ${D}/usr/bin/fw_setenv
}
