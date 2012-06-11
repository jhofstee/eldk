#
# Copyright (C) 2007 OpenedHand Ltd.
#
DESCRIPTION = "Image with Sato support that includes everything within \
core-image-sato plus meta-toolchain, development headers and libraries to \
form a standalone SDK."

SATO_SDK_IMAGE_FEATURES = "${@oe_filter_out('ssh-server-dropbear', '${SATO_IMAGE_FEATURES}', d)} ssh-server-openssh"

IMAGE_FEATURES += "apps-console-core ${SATO_SDK_IMAGE_FEATURES} dev-pkgs tools-sdk qt4-pkgs"
EXTRA_IMAGE_FEATURES += "tools-debug tools-profile tools-testapps debug-tweaks"

LICENSE = "MIT"

inherit core-image
