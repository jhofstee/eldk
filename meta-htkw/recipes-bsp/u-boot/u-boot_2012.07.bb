require u-boot.inc

# SPL build
UBOOT_BINARY = "u-boot.img"
UBOOT_IMAGE = "u-boot-${MACHINE}-${PV}-${PR}.img"
UBOOT_SYMLINK = "u-boot-${MACHINE}.img"

PV = "2012.07"
PR = "r0"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(mcx)"

SRC_URI = "git://www.denx.de/git/u-boot.git;protocol=git \
	   file://0001-mcx-increased-buffer-for-command-line.patch \
	   file://0002-OMAP3-mcx-set-pinmux-for-uart4.patch \
	   file://0003-OMAP3-mcx-updated-default-environment.patch \
	   file://0004-OMAP3-mcx-read-hot-water-button-after-reset.patch \
          "

LICENSE = "GPLv2+"
# We use the revision in order to avoid having to fetch it from the repo during parse
SRCREV = "c627faf637f5fe091bdb6846a52b16983e97b262"

LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb \
                    file://README;beginline=1;endline=22;md5=78b195c11cb6ef63e6985140db7d7bab"

S = "${WORKDIR}/git"
