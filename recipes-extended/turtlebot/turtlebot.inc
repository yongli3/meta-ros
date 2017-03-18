#SRC_URI = "git://github.com/turtlebot/turtlebot.git;branch=hydro"
#SRCREV = "18337405f7b27c09805364fae41febe9ef1ed42f"

SRC_URI = "git://github.com/turtlebot/turtlebot.git;branch=kinetic"
#SRCREV = "${AUTOREV}"
SRCREV = "fe98e7208bba439dd3b744b1ac1b84d102a43364"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "turtlebot"
