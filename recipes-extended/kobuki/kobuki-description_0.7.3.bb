DESCRIPTION = "Description of the Kobuki model.                                                            \
      Provides the model description of Kobuki for simulation and visualisation. The files in this         \
      package are parsed and used by a variety of other components. Most users will not interact directly  \
      with this package.                                                                                   \
                                                                                                           \
      WARNING: This package is disabled because it cannot be catkinized by now, as xacro dependency is not \
      catkin still. In the interim we use a unary pre-catkin stack named kobuki_description."
HOMEPAGE = "https://github.com/yujinrobot/kobuki/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

require kobuki.inc

DEPENDS = "urdf xacro"

