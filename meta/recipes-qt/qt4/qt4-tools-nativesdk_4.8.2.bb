require qt4-tools-nativesdk.inc

PR = "${INC_PR}.1"

SRC_URI += "file://qmake_pri_fixes.patch"

SRC_URI[md5sum] = "3c1146ddf56247e16782f96910a8423b"
SRC_URI[sha256sum] = "921b2a2d060934ceda65ae4615edec474cea13d3c893e7df19ad1262e7dc2379"
