require qt4-native.inc

PR = "${INC_PR}.1"

# Find the g++.conf/linux.conf in the right directory.
FILESEXTRAPATHS =. "${FILE_DIRNAME}/qt-${PV}:"

TOBUILD := "src/tools/bootstrap ${TOBUILD}"

SRC_URI[md5sum] = "3c1146ddf56247e16782f96910a8423b"
SRC_URI[sha256sum] = "921b2a2d060934ceda65ae4615edec474cea13d3c893e7df19ad1262e7dc2379"

