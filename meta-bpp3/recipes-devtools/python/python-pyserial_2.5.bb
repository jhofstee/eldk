DESCRIPTION = "Serial Port Support for Python"
SECTION = "devel/python"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5003807a6b006d7d522a3aaae05443b7"
SRCNAME = "pyserial"
PR = "ml4"

SRC_URI = "${SOURCEFORGE_MIRROR}/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"
S = "${WORKDIR}/${SRCNAME}-${PV}"

#inherit setuptools

inherit distutils

DEPENDS += "python-setuptools-native"

DISTUTILS_INSTALL_ARGS = "--root=${D} \
    --prefix=${prefix} \
    --install-data=${datadir}"

# FIXME might stop packaging serialwin32 and serialjava files

RDEPENDS_${PN} = "\
  python-fcntl \
  python-io \
  python-stringold \
"

SRC_URI[md5sum] = "34340820710239bea2ceca7f43ef8cab"
SRC_URI[sha256sum] = "eddd22280e0dac0888c6cddd8906ebd902fa42467fee151c43ecde4196bbf511"

#export BUILD_SYS
#export HOST_SYS

#export STAGING_LIBDIR
#export STAGING_INCDIR

BBCLASSEXTEND = "native"
