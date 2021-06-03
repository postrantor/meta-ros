# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "rqt_robot_dashboard provides an infrastructure for building robot dashboard plugins in rqt."
AUTHOR = "Aaron Blasdel <ablasdel@gmail.com>"
ROS_AUTHOR = "Ze'ev Klapow"
HOMEPAGE = "http://wiki.ros.org/rqt_robot_dashboard"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_robot_dashboard"
ROS_BPN = "rqt_robot_dashboard"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    python-qt-binding \
    qt-gui \
    rclpy \
    rqt-console \
    rqt-gui \
    rqt-gui-py \
    rqt-robot-monitor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rqt_robot_dashboard-release/archive/release/foxy/rqt_robot_dashboard/0.6.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rqt_robot_dashboard"
SRC_URI = "git://github.com/ros-gbp/rqt_robot_dashboard-release;${ROS_BRANCH};protocol=https"
SRCREV = "5e6dc449522bb2e9100fa9d604e05b4980704d8e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
