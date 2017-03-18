SRC_URI = "git://github.com/turtlebot/turtlebot_apps.git;branch=indigo"
SRCREV = "0690aceb71e128ef76fad093556a6b9c170e63d8"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "turtlebot_apps"
