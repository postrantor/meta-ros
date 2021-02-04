# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Display satellite map tiles in RViz"
AUTHOR = "Tim Clephas <tim.clephas@nobleo.nl>"
ROS_AUTHOR = "Gareth Cross <gcross.code@icloud.com>"
HOMEPAGE = "https://github.com/nobleo/rviz_satellite"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "rviz_satellite"
ROS_BPN = "rviz_satellite"

ROS_BUILD_DEPENDS = " \
    qtbase \
    roscpp \
    rviz \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    rviz \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    rviz \
    sensor-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/nobleo/rviz_satellite-release/archive/release/melodic/rviz_satellite/3.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rviz_satellite"
SRC_URI = "git://github.com/nobleo/rviz_satellite-release;${ROS_BRANCH};protocol=https"
SRCREV = "740438082a24b14964f09a132ffe6ec4fa422461"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
