SUMMARY = "RSysLog"

DESCRIPTION = "is an enhanced syslogd supporting, among others, MySQL, PostgreSQL, failover \
log destinations, syslog/tcp, fine grain output format control, high precision timestamps, \
queued operations and the ability to filter on any message part."

HOMEPAGE = "http://www.rsyslog.com"
SECTION = "console/utils"

LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=51d9635e646fb75e1b74c074f788e973"

SRC_URI = "http://www.rsyslog.com/files/download/rsyslog/rsyslog-5.8.6.tar.gz \
	   file://rsyslog.conf \
	   file://rsyslogd \
	   "

SRC_URI[md5sum] = "c46db0496066b82faf735bd4222208d7"
SRC_URI[sha256sum] = "c51206e3b11c7b4cddf92607b9d6ddd07430ff7dd8d06849804c9ea1c9191825"


inherit autotools

do_install_append () {
    install -d ${D}${sysconfdir}
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc0.d
    install -d ${D}${sysconfdir}/rc1.d
    install -d ${D}${sysconfdir}/rc2.d
    install -d ${D}${sysconfdir}/rc3.d
    install -d ${D}${sysconfdir}/rc4.d
    install -d ${D}${sysconfdir}/rc5.d
    install -d ${D}${sysconfdir}/rc6.d
    install -m 0644 ${WORKDIR}/rsyslog.conf ${D}${sysconfdir}
    install -m 0755 ${WORKDIR}/rsyslogd ${D}${sysconfdir}/init.d
    ln -sf ../init.d/rsyslogd ${D}${sysconfdir}/rc0.d/K20rsyslogd
    ln -sf ../init.d/rsyslogd ${D}${sysconfdir}/rc1.d/K20rsyslogd
    ln -sf ../init.d/rsyslogd ${D}${sysconfdir}/rc6.d/K20rsyslogd
    ln -sf ../init.d/rsyslogd ${D}${sysconfdir}/rc2.d/S20rsyslogd
    ln -sf ../init.d/rsyslogd ${D}${sysconfdir}/rc3.d/S20rsyslogd
    ln -sf ../init.d/rsyslogd ${D}${sysconfdir}/rc4.d/S20rsyslogd
    ln -sf ../init.d/rsyslogd ${D}${sysconfdir}/rc5.d/S20rsyslogd
}
