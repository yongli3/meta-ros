DESCRIPTION = ""
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "git://github.com/stonier/sophus.git;branch=indigo"
SRCREV = "f7f997c2030acca149bbca0436c15aff510ff197"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

EXTRA_OECMAKE_prepend = "\
    -DROS_BUILD_TYPE=TRUE \
    "

DEPENDS = "catkin"

S = "${WORKDIR}/git/"
inherit catkin
