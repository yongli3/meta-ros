DESCRIPTION = "Catkin metapackage for the turtlebot_create stack"
HOMEPAGE = "http://ros.org/wiki/turtlebot_create"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

require turtlebot-apps.inc

DEPENDS = "catkin depth-image-proc nodelet roscpp visualization-msgs dynamic-reconfigure turtlebot-msgs"

RDEPENDS_${PN} = "depth-image-proc nodelet roscpp visualization-msgs dynamic-reconfigure topic-tools turtlebot-bringup turtlebot-teleop turtlebot-msgs"