# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "RoboCup SPL GameController Data V14 ROS msg"
AUTHOR = "ijnek <kenjibrameld@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "gc_spl"
ROS_BPN = "rcgcd_spl_14"

ROS_BUILD_DEPENDS = " \
    rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/gc_spl-release/archive/release/iron/rcgcd_spl_14/3.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/rcgcd_spl_14"
SRC_URI = "git://github.com/ros2-gbp/gc_spl-release;${ROS_BRANCH};protocol=https"
SRCREV = "2dab93b4f4ed2f90d5005579a16c889a054e5266"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}