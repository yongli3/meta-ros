DESCRIPTION = "ROS nodelet for Kobuki: ROS wrapper for the Kobuki driver."
HOMEPAGE = "https://github.com/yujinrobot/kobuki/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin nodelet dynamic-reconfigure pluginlib geometry-msgs yaml-cpp"
require yujin-ocs.inc
