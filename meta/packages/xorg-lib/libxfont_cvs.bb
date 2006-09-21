PV = "0.0+cvs${SRCDATE}"
LICENSE = "BSD-X"
SECTION = "x11/libs"
PRIORITY = "optional"
DEPENDS = "xproto xtrans zlib"
PROVIDES = "xfont"
DESCRIPTION = "X font library (used by the X server)."

SRC_URI = "${FREEDESKTOP_CVS}/xlibs;module=Xfont \
	file://scalable.patch;patch=1"
S = "${WORKDIR}/Xfont"

inherit autotools pkgconfig 

do_stage() {
	autotools_stage_all
}
