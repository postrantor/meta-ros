# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Radar message type plugins for RViz."
AUTHOR = "Nick Rotella <nick.rotella@ainstein.ai>"
ROS_AUTHOR = "Nick Rotella"
HOMEPAGE = "https://wiki.ros.org/ainstein_radar_rviz_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ainstein_radar"
ROS_BPN = "ainstein_radar_rviz_plugins"

ROS_BUILD_DEPENDS = " \
    ainstein-radar-msgs \
    qtbase \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ainstein-radar-msgs \
    pcl \
    qtbase \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/AinsteinAI/ainstein_radar-release/archive/release/melodic/ainstein_radar_rviz_plugins/2.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ainstein_radar_rviz_plugins"
SRC_URI = "git://github.com/AinsteinAI/ainstein_radar-release;${ROS_BRANCH};protocol=https"
SRCREV = "d8db3893575c5c2c3125fb965507bdf3ed97707a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}