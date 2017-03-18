DESCRIPTION = "Catkin metapackage for the turtlebot_create stack"
HOMEPAGE = "http://ros.org/wiki/turtlebot_create"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

require turtlebot-apps.inc

DEPENDS = "catkin"

RDEPENDS_${PN} = "turtlebot-follower"