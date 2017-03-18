SRC_URI = "git://github.com/yujinrobot/kobuki_core.git;branch=kinetic"
#SRCREV = "9757c8aecfe254f2345b7ec69f85ee2ff073c6f4"
SRCREV = "461a75274c9788a163e8e3be360e3c19030c5606"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "kobuki"
