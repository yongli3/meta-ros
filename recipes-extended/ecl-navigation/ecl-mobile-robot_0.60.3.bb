DESCRIPTION = "ROS nodelet for Kobuki: ROS wrapper for the Kobuki driver."
HOMEPAGE = "https://github.com/yujinrobot/kobuki/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin ecl-build ecl-license ecl-errors ecl-geometry ecl-math ecl-formatters ecl-linear-algebra "
require ecl-navigation.inc
