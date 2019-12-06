# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launch files to open an RGBD device and load all nodelets to       convert raw depth/RGB/IR streams to depth images, disparity images,       and (registered) point clouds."
AUTHOR = "Piyush Khandelwal <piyushk@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich and others"
HOMEPAGE = "http://www.ros.org/wiki/rgbd_launch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rgbd_launch"
ROS_BPN = "rgbd_launch"

ROS_BUILD_DEPENDS = " \
    depth-image-proc \
    image-proc \
    nodelet \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    depth-image-proc \
    image-proc \
    nodelet \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    depth-image-proc \
    image-proc \
    nodelet \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rgbd_launch-release/archive/release/melodic/rgbd_launch/2.2.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rgbd_launch"
SRC_URI = "git://github.com/ros-gbp/rgbd_launch-release;${ROS_BRANCH};protocol=https"
SRCREV = "3a34fdc2e146020fdb89e8eddad6409f13661d78"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
