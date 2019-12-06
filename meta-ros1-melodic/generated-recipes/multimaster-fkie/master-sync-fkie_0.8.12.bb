# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Synchronize the local ROS master to the remote masters       discovered by master_discovery_fkie node. The registration      of topics and services is only perform by local ROS master."
AUTHOR = "Alexander Tiderko <alexander.tiderko@gmail.com>"
ROS_AUTHOR = "Alexander Tiderko"
HOMEPAGE = "http://ros.org/wiki/master_sync_fkie"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "multimaster_fkie"
ROS_BPN = "master_sync_fkie"

ROS_BUILD_DEPENDS = " \
    master-discovery-fkie \
    multimaster-msgs-fkie \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    master-discovery-fkie \
    multimaster-msgs-fkie \
    rosgraph \
    roslib \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    master-discovery-fkie \
    multimaster-msgs-fkie \
    rosgraph \
    roslib \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/master_sync_fkie/0.8.12-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/master_sync_fkie"
SRC_URI = "git://github.com/fkie-release/multimaster_fkie-release;${ROS_BRANCH};protocol=https"
SRCREV = "d9fb550fc1976237f4040ee0045565d3e0b786da"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
