# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The quanergy_client_ros package provides a ROS driver for Quanergy sensors"
AUTHOR = "Ross Taylor <ross.taylor@quanergy.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "quanergy_client_ros"
ROS_BPN = "quanergy_client_ros"

ROS_BUILD_DEPENDS = " \
    pcl-ros \
    quanergy-client \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    pcl-ros \
    quanergy-client \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pcl-ros \
    quanergy-client \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/QuanergySystems/quanergy_client_ros-release/archive/release/noetic/quanergy_client_ros/4.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/quanergy_client_ros"
SRC_URI = "git://github.com/QuanergySystems/quanergy_client_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "59b1d693ff715acead22320f35261ce684ce7bb7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}