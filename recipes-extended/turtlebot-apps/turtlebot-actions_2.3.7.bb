DESCRIPTION = "Catkin metapackage for the turtlebot_create stack"
HOMEPAGE = "http://ros.org/wiki/turtlebot_create"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

require turtlebot-apps.inc

DEPENDS = "cmake-modules roscpp actionlib actionlib-msgs geometry-msgs message-generation tf cv-bridge image-transport image-geometry"

RDEPENDS_${PN} = "roscpp actionlib actionlib-msgs geometry-msgs message-generation tf cv-bridge image-transport image-geometry turtlebot-bringup"