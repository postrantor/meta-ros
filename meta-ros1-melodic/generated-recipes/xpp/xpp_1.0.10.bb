# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Visualization of motion-plans for legged robots. It draws support areas,      contact forces and motion trajectories in RVIZ and displays URDFs for      specific robots, including a one-legged, a two-legged hopper and     <a href="http://dls.iit.it/">HyQ</a>.      Example motions were generated by     <a href="https://github.com/ethz-adrl/towr">towr</a>."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
ROS_AUTHOR = "Alexander W. Winkler"
HOMEPAGE = "http://github.com/leggedrobotics/xpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "xpp"
ROS_BPN = "xpp"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    xpp-examples \
    xpp-hyq \
    xpp-msgs \
    xpp-quadrotor \
    xpp-states \
    xpp-vis \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp/1.0.10-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/xpp"
SRC_URI = "git://github.com/leggedrobotics/xpp-release;${ROS_BRANCH};protocol=https"
SRCREV = "c2045db8bef813e31bf815cd0dc6c2301e39521c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
