# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>Metapackage that contains visualization package for jsk-ros-pkg</p>"
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/jsk_visualization"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_visualization"
ROS_BPN = "jsk_visualization"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    jsk-interactive \
    jsk-interactive-marker \
    jsk-interactive-test \
    jsk-rqt-plugins \
    jsk-rviz-plugins \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    jsk-interactive \
    jsk-interactive-marker \
    jsk-interactive-test \
    jsk-rqt-plugins \
    jsk-rviz-plugins \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_visualization/2.1.5-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_visualization"
SRC_URI = "git://github.com/tork-a/jsk_visualization-release;${ROS_BRANCH};protocol=https"
SRCREV = "b9fdedd37c4b4d53df7531c09f3c7e04e3d7fddd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
