SRC_URI = "git://github.com/stonier/ecl_tools.git;branch=devel"  
#SRCREV = "9757c8aecfe254f2345b7ec69f85ee2ff073c6f4"
SRCREV = "028a313834a5839fac7fa2c4b27c2a33f76801e1"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl"
