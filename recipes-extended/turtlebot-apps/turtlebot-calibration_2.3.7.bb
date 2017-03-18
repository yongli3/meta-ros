DESCRIPTION = "Catkin metapackage for the turtlebot_create stack"
HOMEPAGE = "http://ros.org/wiki/turtlebot_create"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

require turtlebot-apps.inc

DEPENDS = "catkin rospy std-msgs sensor-msgs nav-msgs geometry-msgs message-generation"

RDEPENDS_${PN} = "rospy std-msgs sensor-msgs nav-msgs geometry-msgs message-generation turtlebot-bringup"