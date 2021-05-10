# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The mqtt_bridge package"
AUTHOR = "Junya Hayashi <junya.hayashi@groove-x.com>"
ROS_AUTHOR = "Junya Hayashi <junya.hayashi@groove-x.com>"
HOMEPAGE = "http://www.ros.org/wiki/mqtt_bridge"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "mqtt_bridge"
ROS_BPN = "mqtt_bridge"

ROS_BUILD_DEPENDS = " \
    python3-pip \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-msgpack \
    python3-pymongo \
    rosbridge-library \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/groove-x/mqtt_bridge-release/archive/release/noetic/mqtt_bridge/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mqtt_bridge"
SRC_URI = "git://github.com/groove-x/mqtt_bridge-release;${ROS_BRANCH};protocol=https"
SRCREV = "0279e4aef09df8d774e08a964b6fb0bc831f9599"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}