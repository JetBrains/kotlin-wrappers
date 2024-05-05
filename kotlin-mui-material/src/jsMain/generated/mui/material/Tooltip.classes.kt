// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tooltip")

package mui.material

import web.cssom.ClassName

sealed external interface TooltipClasses {
    /** Styles applied to the Popper component. */
    val popper: ClassName

    /** Styles applied to the Popper component unless `disableInteractive={true}`. */
    val popperInteractive: ClassName

    /** Styles applied to the Popper component if `arrow={true}`. */
    val popperArrow: ClassName

    /** Styles applied to the Popper component unless the tooltip is open. */
    val popperClose: ClassName

    /** Styles applied to the tooltip (label wrapper) element. */
    val tooltip: ClassName

    /** Styles applied to the tooltip (label wrapper) element if `arrow={true}`. */
    val tooltipArrow: ClassName

    /** Styles applied to the arrow element. */
    val arrow: ClassName

    /** Styles applied to the tooltip (label wrapper) element if the tooltip is opened by touch. */
    val touch: ClassName

    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "left". */
    val tooltipPlacementLeft: ClassName

    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "right". */
    val tooltipPlacementRight: ClassName

    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "top". */
    val tooltipPlacementTop: ClassName

    /** Styles applied to the tooltip (label wrapper) element if `placement` contains "bottom". */
    val tooltipPlacementBottom: ClassName
}

external val tooltipClasses: TooltipClasses
