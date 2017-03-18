DESCRIPTION = "iRobot Create ROS driver node \
     \
    ROS bindings for the Create/Roomba driver. \
     \
    This is based on otl_roomba driver by OTL, ported to use \
    create_driver's implementation instead.  \
    This also contains a 'bonus' feature from the turtlebot  \
    driver by Xuwen Cao and Morgan Quigley."
HOMEPAGE = "http://ros.org/wiki/create_node"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "create-driver diagnostic-msgs dynamic-reconfigure geometry-msgs message-generation nav-msgs rospy tf"

require turtlebot-create.inc
