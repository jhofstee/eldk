# fix behavior of base do_install_prepend - its overwrite ready to use uImage by uncompresses Image
require linux-htkw.inc

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_mcx = "1"

# This was introduced to remove uImage from /boot and save 3MB
KERNEL_DROPIMAGE = "y"

#LINUX_VERSION ?= "3.1.0"

PR = "r1"
#PV = "${LINUX_VERSION}+git${SRCPV}"

SRCREV = "50de123bcb9b14085e576ddf4a321e02793a8db4"

S = "${WORKDIR}/git"

LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "git://git.denx.de/linux-denx-sbabic.git;branch=refs/heads/mcx-devel;protocol=git \
           file://defconfig"
