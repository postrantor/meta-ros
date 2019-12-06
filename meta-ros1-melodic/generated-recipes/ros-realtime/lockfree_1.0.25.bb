# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The lockfree package contains lock-free data structures for use in multithreaded programming.  These      kinds of data structures are generally not as easy to use as single-threaded equivalents, and are not      always faster.  If you don't know you need to use one, try another structure with a lock around it      first."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
ROS_AUTHOR = "Josh Faust"
HOMEPAGE = "http://ros.org/wiki/lockfree"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_realtime"
ROS_BPN = "lockfree"

ROS_BUILD_DEPENDS = " \
    allocators \
    rosatomic \
    rosconsole \
    roslib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    allocators \
    rosatomic \
    rosconsole \
    roslib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    allocators \
    rosatomic \
    rosconsole \
    roslib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_realtime-release/archive/release/melodic/lockfree/1.0.25-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/lockfree"
SRC_URI = "git://github.com/ros-gbp/ros_realtime-release;${ROS_BRANCH};protocol=https"
SRCREV = "e89f5389129e0710328bb0644528be23f7057579"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
