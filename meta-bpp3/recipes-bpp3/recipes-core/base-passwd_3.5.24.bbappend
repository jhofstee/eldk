FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}_${PV}:"

SRC_URI_append += " file://0001-add-ssh-user.patch \
		file://0002-add-ssh-group.patch \
	"
