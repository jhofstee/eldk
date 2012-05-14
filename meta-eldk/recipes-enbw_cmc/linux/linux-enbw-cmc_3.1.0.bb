# fix behavior of base do_install_prepend - its overwrite ready to use uImage by uncompresses Image
require linux-enbw-cmc.inc
#require ../../recipes-kernel/linux/linux.inc

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_enbw_cmc = "1"

LINUX_VERSION ?= "3.1.0"

PR = "r1"
#PV = "${LINUX_VERSION}+git${SRCPV}"

SRCREV = "d695872ccdf8a665a79b2dc1cc42ed598b36536e"

S = "${WORKDIR}/git"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "git://git.denx.de/linux-denx.git;branch=refs/heads/enbw_cmc;protocol=git \
           file://defconfig"
