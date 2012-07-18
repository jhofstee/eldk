SUMMARY = "Root file system image for MCX board"
DESCRIPTION = "Root FS includes the following functionality: 				\
		Busybox: standard for ELDK 5.2 (syslogd removed) 			\
		mtd-utils: standard for ELDK 5.2 					\
		base-files: standard script for ELDK 5.2 (/var/log placement changed) 	\
		tinylogin: standard for ELDK 5.2 					\
		sysvinit: standard for ELDK 5.2 (bootlogd removed)			\
		initscripts: modified standard script for ELDK 5.2			\
		"


SRC_URI = "file://rcS.swupdate \
	"

IMAGE_INSTALL = "base-files \
		busybox \
		mtd-utils \
		libconfig \
		kernel-module-scsi-wait-scan \
		tinylogin \
		swupdate \
		sysvinit \
		initscripts-swupdate \
		 "



LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
		   "

# This variable is triggered to check if sysvinit must be overwritten by a single rcS
export SYSVINIT = "no"

LICENSE = "MIT"

IMAGE_FSTYPES = "ubifs tar.gz"

#IMAGE_DEVICE_TABLE="${COREBASE}/meta-eldk/recipes-mcx/files/device_table.txt"

MKUBIFS_ARGS = "--min-io-size=2048 --leb-size=129024 --max-leb-cnt=300"

IMAGE_ROOTFS_SIZE = "8192"

inherit image

remove_locale_data_files() {
	printf "Post processing local %s\n" ${IMAGE_ROOTFS}${libdir}/locale
	rm -rf ${IMAGE_ROOTFS}${libdir}/locale
}

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
ROOTFS_POSTPROCESS_COMMAND += "remove_locale_data_files ; "
