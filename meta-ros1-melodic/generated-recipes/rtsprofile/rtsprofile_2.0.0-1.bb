# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>Library to read, manipulate and write RT system profiles using the RTSProfile XML schema.</p>"
AUTHOR = "Kei OKada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Geoffrey Biggs <git@killbots.net>"
HOMEPAGE = "http://ros.org/wiki/openrtm_tools"
SECTION = "devel"
LICENSE = "EPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=b1456987590b6d6fb15d36f398651b8b"

ROS_CN = "rtsprofile"
ROS_BPN = "rtsprofile"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-omniorb} \
    python-setuptools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtsprofile-release/archive/release/melodic/rtsprofile/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rtsprofile"
SRC_URI = "git://github.com/tork-a/rtsprofile-release;${ROS_BRANCH};protocol=https"
SRCREV = "9b0bb558c00e9523afa64793466a9fdec9d067e5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
