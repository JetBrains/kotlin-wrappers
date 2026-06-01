// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tabs")

package mui.material

import web.cssom.ClassName

sealed external interface TabsClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `orientation="vertical"`. */
    val vertical: ClassName
    /** Styles applied to the flex container element. */
    /** @deprecated use `list` instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details. */
    val flexContainer: ClassName
    /** Styles applied to the flex container element if `orientation="vertical"`. */
    /** @deprecated use a combination of `list` and `vertical` instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details. */
    val flexContainerVertical: ClassName

    /** Styles applied to the list element. */
    val list: ClassName

    /** Styles applied to the flex container element if `centered={true}` & `!variant="scrollable"`. */
    val centered: ClassName

    /** Styles applied to the tablist element. */
    val scroller: ClassName

    /** Styles applied to the tablist element if `!variant="scrollable"`. */
    val fixed: ClassName

    /** Styles applied to the tablist element if `variant="scrollable"` and `orientation="horizontal"`. */
    val scrollableX: ClassName

    /** Styles applied to the tablist element if `variant="scrollable"` and `orientation="vertical"`. */
    val scrollableY: ClassName

    /** Styles applied to the tablist element if `variant="scrollable"` and `visibleScrollbar={false}`. */
    val hideScrollbar: ClassName

    /** Styles applied to the ScrollButtonComponent component. */
    val scrollButtons: ClassName

    /** Styles applied to the ScrollButtonComponent component if `allowScrollButtonsMobile={true}`. */
    val scrollButtonsHideMobile: ClassName

    /** Styles applied to the TabIndicator component. */
    val indicator: ClassName
}

external val tabsClasses: TabsClasses
