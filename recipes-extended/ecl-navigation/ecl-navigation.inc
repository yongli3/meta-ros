SRC_URI = "git://github.com/stonier/ecl_navigation.git;branch=devel"  
#SRCREV = "9757c8aecfe254f2345b7ec69f85ee2ff073c6f4"
SRCREV = "9bac52d0e386b6cf1003e1b63e65483dacd76963"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl"
