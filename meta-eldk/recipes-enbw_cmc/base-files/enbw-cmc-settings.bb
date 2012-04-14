SUMMARY = "Different additional settings"
SECTION = "base"
PR = "r0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = "file://modules \
	  "
S = "${WORKDIR}"

do_install () {
    install -d ${D}${sysconfdir}
#    install -d ${D}${sysconfdir}/init.d
#    install -d ${D}${sysconfdir}/rc0.d
#    install -d ${D}${sysconfdir}/rc1.d
#    install -d ${D}${sysconfdir}/rc2.d
#    install -d ${D}${sysconfdir}/rc3.d
#    install -d ${D}${sysconfdir}/rc4.d
#    install -d ${D}${sysconfdir}/rc5.d
#    install -d ${D}${sysconfdir}/rc6.d
     install -m 0644    ${WORKDIR}/modules         ${D}${sysconfdir}
}

PACKAGES = "${PN}"
FILES_${PN} = "/"

PACKAGE_ARCH = "${MACHINE_ARCH}"

CONFFILES_${PN} = ""
