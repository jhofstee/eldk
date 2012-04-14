IMAGE_FEATURES += "apps-console-core tools-debug tools-profile \
			tools-sdk dev-pkgs package-management"
POKY_EXTRA_INSTALL = "task-qte-toolchain-target qt4-embedded-tools qt4-embedded-demos qt4-embedded-examples"

LICENSE = "MIT"

inherit core-image
