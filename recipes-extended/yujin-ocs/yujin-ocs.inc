SRC_URI = "git://github.com/yujinrobot/yujin_ocs.git;branch=devel"
SRCREV = "bf003ad4f4ba4d6abac234a99a88edc2dd3c03a7"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl"
