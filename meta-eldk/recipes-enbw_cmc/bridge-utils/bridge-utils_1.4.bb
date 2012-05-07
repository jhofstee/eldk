SUMMARY = "Linux Ethernet bridging"

HOMEPAGE = "http://linux-net.osdl.org/index.php/Bridge"
SECTION = "console/network"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=f9d20a453221a1b7e32ae84694da2c37"

SRC_URI = "http://launchpad.net/bridge-utils/main/1.4/+download/bridge-utils-1.4.tar.gz"

SRC_URI[md5sum] = "0182fcac3a2b307113bbec34e5f1c673"
SRC_URI[sha256sum] = "876975e9bcc302aa8b829161ea3348b12b9b879f1db0dc98feaed8d0e5dd5933"

inherit autotools
