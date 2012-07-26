DESCRIPTION = "MMIA application for Helbling mcx board"
SECTION = "Apps"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

RDEPENDS_${PN} = " \
	libqt-embeddedgui4 \
	libqt-embeddedsql4 \
	libqt-embeddedxml4 \
	qt4-embedded-plugin-sqldriver-sqlite \
	"

inherit qt4e

SRC_URI = "svn:///home/stefano/Projects/Helbling/mcx/application/svn;proto=file;module=MachineFirmware"

SRCREV = "r2"
        
S = "${WORKDIR}/MachineFirmware"
        
# may be necessary :
EXTRA_QMAKEVARS_PRE += "PREFIX=/usr"
EXTRA_OEMAKE += "INSTALL_ROOT=${D}"
        
FILES_${PN} = "/opt/mmia/bin/mmia /home/root/milano/*"

install_subdir_milano () {
	for i in ${1}/*;do
		if [ -f ${i} ];then
			install -m 644 ${i} $2
		fi
		if [ -d ${i} ];then
			install -d ${2}/`basename ${i}`
			for j in ${i}/*;do
				if [ -f ${j} ];then
					install -m 644 ${j} ${2}/`basename ${i}`
				fi
			done
		fi
	done
}

do_configure () {
	OE_QMAKE_QT_CONFIG=${STAGING_DIR_TARGET}${datadir}/${QT_DIR_NAME}/mkspecs/qconfig.pri \
		qmake2 MMIA/020_Source_Codes/mmia_software_center/mmia/mmia.pro
        
}       
        
do_install() {

	oe_runmake install_target INSTALL_ROOT=${D}

	install -d ${D}/home
	install -d ${D}/home/root
	BASE=${D}/home/root/milano
	install -d ${BASE}
	install -d ${BASE}/applications
	install -d ${BASE}/applications/mmia
	install -d ${BASE}/applications/mmia/qml
	install -d ${BASE}/applications/mca
	install -d ${BASE}/applications/console
	install -d ${BASE}/persistent_data/
	install -d ${BASE}/persistent_data/Databases
	install -d ${BASE}/persistent_data/sys
	install -d ${BASE}/support_data
	install -d ${BASE}/support_data/videos
	install -d ${BASE}/support_data/pictures
	install -d ${BASE}/support_data/fonts
	install -d ${BASE}/aux_data/
	install -d ${BASE}/log_data/

	install_subdir_milano ${S}/MCA/020_SRC ${BASE}/applications/mca
	install_subdir_milano ${S}/Console/020_SRC ${BASE}/applications/console
	install_subdir_milano ${S}/PersistentData/database/Databases \
		${BASE}/persistent_data/Databases
	install_subdir_milano ${S}/PersistentData/sys \
		${BASE}/persistent_data/sys
#	install_subdir_milano ${S}/SupportData/videos \
#		${BASE}/support_data/videos
	install_subdir_milano ${S}/SupportData/pictures \
		${BASE}/support_data/pictures
	install_subdir_milano ${S}/SupportData/fonts \
		${BASE}/support_data/fonts
	install_subdir_milano ${S}/MMIA/020_Source_Codes/mmia_software_center/mmia_sys_files \
		${BASE}/applications

	ln -s -f /opt/mmia/bin/mmia ${BASE}/applications/mmia/mmia
	ln -s -f /home/root/milano/applications/config/mmia_config_target.xml \
		${BASE}/applications/mmia/mmia_config.xml

	for i in ${S}/MMIA/020_Source_Codes/mmia_software_center/mmia/*.qm; do
		install -m 644 ${i} ${BASE}/applications/mmia
	done

	cp -arp ${S}/qml ${BASE}/applications/mmia

}       
