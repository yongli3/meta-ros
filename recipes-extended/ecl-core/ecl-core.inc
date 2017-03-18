SRC_URI = "git://github.com/stonier/ecl_core.git;branch=devel"
#SRCREV = "9757c8aecfe254f2345b7ec69f85ee2ff073c6f4"
SRCREV = "e0e1072d8f4e92c46c2ef4a131b59f4b7b4ee2b7"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl"
