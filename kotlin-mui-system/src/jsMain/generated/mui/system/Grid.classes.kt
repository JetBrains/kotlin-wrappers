// Automatically generated - do not modify!

@file:JsModule("@mui/system/Grid")

package mui.system

import web.cssom.ClassName

sealed external interface GridClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `container={true}`. */
    val container: ClassName

    /** Styles applied to the root element if `direction="column"`. */
    @JsName("direction-xs-column")
    val directionXsColumn: ClassName

    /** Styles applied to the root element if `direction="column-reverse"`. */
    @JsName("direction-xs-column-reverse")
    val directionXsColumnReverse: ClassName

    /** Styles applied to the root element if `direction="row-reverse"`. */
    @JsName("direction-xs-row-reverse")
    val directionXsRowReverse: ClassName

    /** Styles applied to the root element if `wrap="nowrap"`. */
    @JsName("wrap-xs-nowrap")
    val wrapXsNowrap: ClassName

    /** Styles applied to the root element if `wrap="reverse"`. */
    @JsName("wrap-xs-wrap-reverse")
    val wrapXsWrapReverse: ClassName
}

external val gridClasses: GridClasses
