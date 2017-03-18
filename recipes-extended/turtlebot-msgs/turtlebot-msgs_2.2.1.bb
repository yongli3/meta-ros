DESCRIPTION = "Turtlebot messages, services and actions"
HOMEPAGE = "http://wiki.ros.org/turtlebot_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "git://github.com/turtlebot/turtlebot_msgs.git;branch=indigo"
#SRCREV = "${AUTOREV}"
SRCREV = "834c448fb313ea7edb834d5552211daf53823395"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/"

inherit catkin

DEPENDS = "catkin std-msgs std-srvs sensor-msgs message-generation"

RDEPENDS_${PN} = "std-msgs std-srvs sensor-msgs message-generation"