DESCRIPTION = "Platform Loader and Manager"
SUMMARY = "Platform Loader and Manager for Versal devices"

PROVIDES = "virtual/plm"

inherit xsctapp xsctyaml deploy

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE_versal = "versal"

XSCTH_PROC_IP_versal = "psv_pmc"
XSCTH_APP   = "versal PLM"

INSANE_SKIP_${PN} = "arch"
INSANE_SKIP_${PN}-dbg = "arch"

