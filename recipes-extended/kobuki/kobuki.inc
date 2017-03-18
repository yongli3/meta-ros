SRC_URI = "git://github.com/yujinrobot/kobuki.git;branch=kinetic"
#SRCREV = "9757c8aecfe254f2345b7ec69f85ee2ff073c6f4"
SRCREV = "8ccf1fe96d1397096c91e52c003c729b86f76650"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "kobuki"
