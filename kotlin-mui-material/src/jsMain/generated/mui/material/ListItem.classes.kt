// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItem")

package mui.material

import web.cssom.ClassName

sealed external interface ListItemClasses {
    /** Styles applied to the (normally root) `component` element. May be wrapped by a `container`. */
    val root: ClassName

    /** Styles applied to the container element if `children` includes `ListItemSecondaryAction`. */
    val container: ClassName

    /** Styles applied to the component element if dense. */
    val dense: ClassName

    /** Styles applied to the component element if `alignItems="flex-start"`. */
    val alignItemsFlexStart: ClassName

    /** Styles applied to the inner `component` element if `divider={true}`. */
    val divider: ClassName

    /** Styles applied to the inner `component` element unless `disableGutters={true}`. */
    val gutters: ClassName

    /** Styles applied to the root element unless `disablePadding={true}`. */
    val padding: ClassName

    /** Styles applied to the component element if `children` includes `ListItemSecondaryAction`. */
    val secondaryAction: ClassName
}

external val listItemClasses: ListItemClasses
