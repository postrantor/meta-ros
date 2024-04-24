# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "RTAB-Map's costmap_2d plugins"
AUTHOR = "Mathieu Labbe <matlabbe@gmail.com>"
ROS_AUTHOR = "Mathieu Labbe"
HOMEPAGE = "https://github.com/introlab/rtabmap_ros/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtabmap_ros"
ROS_BPN = "rtabmap_costmap_plugins"

ROS_BUILD_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    message-generation \
    pcl \
    pcl-conversions \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    genmsg-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    pcl-conversions \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    pcl-conversions \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/introlab/rtabmap_ros-release/archive/release/noetic/rtabmap_costmap_plugins/0.21.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rtabmap_costmap_plugins"
SRC_URI = "git://github.com/introlab/rtabmap_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "25154b17854fd06aa20723fdb982f3cd47e25f8a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}