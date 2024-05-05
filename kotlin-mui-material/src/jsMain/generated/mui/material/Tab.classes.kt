// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tab")

package mui.material

import web.cssom.ClassName

sealed external interface TabClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if both `icon` and `label` are provided. */
    val labelIcon: ClassName

    /** Styles applied to the root element if the parent [`Tabs`](/material-ui/api/tabs/) has `textColor="inherit"`. */
    val textColorInherit: ClassName

    /** Styles applied to the root element if the parent [`Tabs`](/material-ui/api/tabs/) has `textColor="primary"`. */
    val textColorPrimary: ClassName

    /** Styles applied to the root element if the parent [`Tabs`](/material-ui/api/tabs/) has `textColor="secondary"`. */
    val textColorSecondary: ClassName

    /** State class applied to the root element if `selected={true}` (controlled by the Tabs component). */
    val selected: ClassName

    /** State class applied to the root element if `disabled={true}` (controlled by the Tabs component). */
    val disabled: ClassName

    /** Styles applied to the root element if `fullWidth={true}` (controlled by the Tabs component). */
    val fullWidth: ClassName

    /** Styles applied to the root element if `wrapped={true}`. */
    val wrapped: ClassName

    /** Styles applied to the wrapper element of `icon` if `icon` is provided. */
    val iconWrapper: ClassName
}

external val tabClasses: TabClasses
