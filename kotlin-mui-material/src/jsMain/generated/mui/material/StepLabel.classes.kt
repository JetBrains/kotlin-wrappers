// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepLabel")

package mui.material

import web.cssom.ClassName

sealed external interface StepLabelClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `orientation="horizontal"`. */
    val horizontal: ClassName

    /** Styles applied to the root element if `orientation="vertical"`. */
    val vertical: ClassName

    /** Styles applied to the label element that wraps `children`. */
    val label: ClassName

    /** State class applied to the label element if `active={true}`. */
    val active: ClassName

    /** State class applied to the label element if `completed={true}`. */
    val completed: ClassName

    /** State class applied to the root and label elements if `error={true}`. */
    val error: ClassName

    /** State class applied to the root and label elements if `disabled={true}`. */
    val disabled: ClassName

    /** Styles applied to the `icon` container element. */
    val iconContainer: ClassName

    /** State class applied to the root and icon container and label if `alternativeLabel={true}`. */
    val alternativeLabel: ClassName

    /** Styles applied to the container element which wraps label and `optional`. */
    val labelContainer: ClassName
}

@JsName("default")
external val stepLabelClasses: StepLabelClasses
