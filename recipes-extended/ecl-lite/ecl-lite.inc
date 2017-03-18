SRC_URI = "git://github.com/stonier/ecl_lite.git;branch=devel"  
#SRCREV = "9757c8aecfe254f2345b7ec69f85ee2ff073c6f4"
SRCREV = "3ca3a4939f60fdabca764ff97065a6b4eecb7bea"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl"
