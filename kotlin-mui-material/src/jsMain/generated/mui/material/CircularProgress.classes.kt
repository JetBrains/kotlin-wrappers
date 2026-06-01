// Automatically generated - do not modify!

@file:JsModule("@mui/material/CircularProgress")

package mui.material

import web.cssom.ClassName

sealed external interface CircularProgressClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `variant="determinate"`. */
    val determinate: ClassName

    /** Styles applied to the root element if `variant="indeterminate"`. */
    val indeterminate: ClassName

    /** Styles applied to the root element if `color="primary"`. */
    val colorPrimary: ClassName

    /** Styles applied to the root element if `color="secondary"`. */
    val colorSecondary: ClassName

    /** Styles applied to the svg element. */
    val svg: ClassName

    /** Styles applied to the `circle` svg path. */
    val circle: ClassName

    /** Styles applied to the `circle` svg path if `variant="determinate"`.
     * @deprecated Combine the [.MuiCircularProgress-circle](/material-ui/api/circular-progress/#circular-progress-classes-circle) and [.MuiCircularProgress-determinate](/material-ui/api/circular-progress/#circular-progress-classes-determinate) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val circleDeterminate: ClassName

    /** Styles applied to the `circle` svg path if `variant="indeterminate"`.
     * @deprecated Combine the [.MuiCircularProgress-circle](/material-ui/api/circular-progress/#circular-progress-classes-circle) and [.MuiCircularProgress-indeterminate](/material-ui/api/circular-progress/#circular-progress-classes-indeterminate) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val circleIndeterminate: ClassName

    /** Styles applied to the `circle` svg path if `disableShrink={true}`. */
    val circleDisableShrink: ClassName
}

external val circularProgressClasses: CircularProgressClasses
