DESCRIPTION = "ROS nodelet for Kobuki: ROS wrapper for the Kobuki driver."
HOMEPAGE = "https://github.com/yujinrobot/kobuki/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp kobuki-msgs yocs-controllers ecl-threads"

DEPENDS = "roscpp nodelet class-loader kobuki-msgs ecl-exceptions ecl-threads"
require kobuki.inc
