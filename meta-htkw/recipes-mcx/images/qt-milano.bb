SUMMARY = "Root file system image for Helbling mcx board"
DESCRIPTION = "Root FS for mcx"

PR="r1"

DEPENDS += "task-qt4e"

RDEPENDS_${PN} += " \
	qt4-embedded \
	qte-env-cfg \
        "
IMAGE_FEATURES_append += "apps-console-core package-management"

IMAGE_INSTALL_append = "task-core-boot \
		bash \
		boost \
		bzip2 \
		cronie \
		curl \
		e2fsprogs \
		gstreamer \
		gst-omapfb \
		gst-plugins-base \
		gst-plugins-base-decodebin \
		gst-plugins-base-decodebin2 \
		gst-plugins-base-ffmpegcolorspace \
		gst-plugins-base-ogg \
		gst-plugins-base-playbin \
		gst-plugins-base-theora \
		gst-plugins-base-typefindfunctions \
		gst-plugins-base-vorbis \
		iproute2 \
		ldd \
		less \
		libqt-embeddedcore4 \
		libqt-embeddedgui4 \
		libqt-embeddednetwork4 \
		libqt-embeddedsvg4 \
		libsegfault \
		libsqlite3 \
		libvorbis \
		lighttpd \
		ncurses \
		ntp \
		openssl \
		openssh openssh-sftp-server \
		ppp \
		ppp-dialin \
		ppp-minconn \
		ppp-tools \
		python \
		python-codecs \
		python-crypt \
		python-curses \
		python-datetime \
		python-elementtree \
		python-fcntl \
		python-inotify-mcx \
		python-io \
		python-logging \
		python-math \
		python-pickle \
		python-sqlite3 \
		python-stringold \
		python-threading \
		python-xml \
		python-zlib \
		qt4-embedded-fonts-ttf-dejavu \
		qt4-embedded-fonts-ttf-vera \
		qt4-embedded-plugin-imageformat-gif \
		qt4-embedded-plugin-imageformat-ico \
		qt4-embedded-plugin-imageformat-jpeg \
		qt4-embedded-plugin-imageformat-mng \
		qt4-embedded-plugin-imageformat-svg \
		qt4-embedded-plugin-imageformat-tiff \
		qt4-embedded-plugin-mousedriver-tslib \
		qte-env-cfg \
		rsync \
		screen \
		strace \
		tslib-calibrate \
		u-boot-env-tools \
		util-linux \
		zip"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
			file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
		"

LICENSE = "MIT"

IMAGE_FSTYPES = "ubifs tar.gz"

#IMAGE_DEVICE_TABLE="${COREBASE}/meta-htkw/recipes-mcx/files/device_table.txt"

#MKUBIFS_ARGS = "--min-io-size=2048 --leb-size=129024 --max-leb-cnt=4007"

#IMAGE_ROOTFS_SIZE = "8192"

inherit core-image

# remove not needed ipkg informations
#ROOTFS_POSTPROCESS_COMMAND += "aaaremove_packaging_data_files ; "
