IMAGE_FEATURES += "apps-console-core tools-debug tools-profile \
			tools-sdk dev-pkgs package-management"
CORE_IMAGE_EXTRA_INSTALL = "task-qte-toolchain-target qt4-embedded-tools \
			qt4-embedded-demos qt4-embedded-examples \
			qt4-embedded-plugin-mousedriver-tslib \
			qt4-embedded-plugin-kbddriver-linuxinput \
			tslib tslib-calibrate tslib-tests"

LICENSE = "MIT"

inherit core-image
