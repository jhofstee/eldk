#!/bin/sh

: ${MACHINE:="generic-powerpc"}

: ${IMAGES:="
	core-image-minimal
	core-image-minimal-mtdutils
	core-image-minimal-dev
	core-image-base
	core-image-basic
	core-image-core
	core-image-clutter
	core-image-lsb
	core-image-lsb-dev
	core-image-lsb-sdk
	core-image-sato
	core-image-sato-dev
	core-image-sato-sdk
	core-image-qte-sdk
	meta-toolchain-sdk
	meta-toolchain-qte
"}

for image in $IMAGES ; do
	# Enable virtual terminals only for images with GUI
	# ("sato" and "qte" for now)
	#
	if expr "$image" : '.*\(sato\|qte\)' >/dev/null
	then
		use_vt=1
	else
		use_vt=0
	fi

	(
		date
		MACHINE=$MACHINE USE_VT=$use_vt bitbake $image
		date
	) 2>&1 | \
	tee BITBAKE-$image.LOG
done
