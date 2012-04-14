SUMMARY = "Root file system image for EnBW CMC board"
DESCRIPTION = "Root FS includes the following functionality: 				\
		Busybox: standard for ELDK 5.1 (syslogd removed) 			\
		iptables: standard for ELDK 5.1 					\
		tzdata: standard for ELDK 5.1 						\
		mtd-utils: standard for ELDK 5.1 					\
		rsyslogd: v5.8.4 							\
		bridge-utils: v1.4							\
		u-boot enviroment tools							\
		base-files: standard script for ELDK 5.1 (/var/log placement changed) 	\
		tinylogin: standard for ELDK 5.1 					\
		kernel-modules: from 3.1.0 kernel (git version) 			\
		sysvinit: standard for ELDK 5.1 (bootlogd removed)			\
		initscripts: modified standard script for ELDK 5.1			\
		rootuser: add root user with root password				\
		cronie: standard for ELDK 5.1 ($UID checking removed)			\
		modutils-initscripts: standard for ELDK 5.1 (changed)			\
		logrotate: standard for ELDK 5.1 (default config changed)		\
		enbw-cmc-settings: various settings for the platform"


IMAGE_INSTALL = "busybox-enbw-cmc \
		 iptables \
		 tzdata \
		 mtd-utils \
		 rsyslog \
		 bridge-utils  \
		 u-boot-env-tools  \
		 base-files-enbw-cmc \
		 tinylogin \
		 kernel-modules \
		 sysvinit-enbw-cmc \
		 initscripts-enbw-cmc \
		 rootuser\
		 cronie-enbw-cmc \
		 modutils-initscripts-enbw-cmc \
		 logrotate-enbw-cmc \
		 enbw-cmc-settings \
		 "

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
		   "


LICENSE = "MIT"

IMAGE_FSTYPES = "ubifs tar.gz"

IMAGE_DEVICE_TABLE="${COREBASE}/meta-eldk/recipes-enbw_cmc/files/device_table.txt"

MKUBIFS_ARGS = "--min-io-size=2048 --leb-size=126976 --max-leb-cnt=100"

IMAGE_ROOTFS_SIZE = "8192"

inherit image

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
