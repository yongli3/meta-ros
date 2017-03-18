SRC_URI = "git://github.com/ros-drivers/linux_peripheral_interfaces.git;branch=kinetic"
SRCREV = "2b207dfa3a8a6abc9ffe416c24bc9b7005f4d043"
SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin

ROS_SPN = "linux-peripheral-interfaces"
