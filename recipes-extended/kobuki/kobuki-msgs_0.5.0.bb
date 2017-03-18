DESCRIPTION = ""
HOMEPAGE = "http://ros.org/wiki/kobuki_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs actionlib-msgs message-generation"

SRC_URI = "git://github.com/yujinrobot/kobuki_msgs.git;branch=hydro-devel"
SRCREV = "666e5e55b4e526eeaa0ca16cda5d0f58ca292edc"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/"

inherit catkin
