FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += "file://sshd_config"

PRINC := "${@int(PRINC) + 1}"
