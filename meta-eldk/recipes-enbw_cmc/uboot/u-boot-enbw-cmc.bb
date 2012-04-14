require u-boot-enbw-cmc.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb \
                    file://README;beginline=1;endline=22;md5=efde3a88b3a9849a9e9c7be479edbf13"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-testing-git/${MACHINE}"

# This revision corresponds to the tag "enbw_cmc"
# We use the revision in order to avoid having to fetch it from the repo during parse
SRCREV = "ccd5912d70a5d1a2814ce95e516b84f0da042fa3"

PV = "git${SRCPV}"
PR = "r0"

SRC_URI = "git://git.denx.de/u-boot-testing.git;branch=enbw_cmc;protocol=git"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(enbw_cmc)"
