# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Components of MoveIt! that offer simpler interfaces to planning and execution"
AUTHOR = "Michael Ferguson <mferguson@fetchrobotics.com>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_ros_planning_interface"

ROS_BUILD_DEPENDS = " \
    actionlib \
    eigenpy \
    geometry-msgs \
    libeigen \
    moveit-msgs \
    moveit-ros-manipulation \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-warehouse \
    python \
    rosconsole \
    roscpp \
    rospy \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python-catkin-pkg-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    eigenpy \
    geometry-msgs \
    moveit-msgs \
    moveit-ros-manipulation \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-warehouse \
    python \
    rosconsole \
    roscpp \
    rospy \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    eigenpy \
    geometry-msgs \
    moveit-msgs \
    moveit-ros-manipulation \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-warehouse \
    python \
    rosconsole \
    roscpp \
    rospy \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    moveit-resources \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_planning_interface/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_ros_planning_interface"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "62570c4e00f4509bda9c329e54a2cdf6e51db5d2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
