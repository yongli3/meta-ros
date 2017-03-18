SRC_URI = "git://github.com/turtlebot/turtlebot_create.git;branch=hydro"
SRCREV = "3510b920f74e6b5148ed0e8a58111388b196c444"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "turtlebot_create"
