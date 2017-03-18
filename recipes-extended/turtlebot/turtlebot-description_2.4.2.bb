DESCRIPTION = "turtlebot_description provides a complete 3D model of the TurtleBot for simulation and visualization. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
HOMEPAGE = "http://ros.org/wiki/turtlebot_description"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdf xacro"

require turtlebot.inc

#SRC_URI += "file://0001-Check-if-unit-testing-is-enabled.patch;striplevel=2"
