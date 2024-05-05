// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionSummary")

package mui.material

import web.cssom.ClassName

sealed external interface AccordionSummaryClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** State class applied to the root element, children wrapper element and `IconButton` component if `expanded={true}`. */
    val expanded: ClassName

    /** State class applied to the ButtonBase root element if the button is keyboard focused. */
    val focusVisible: ClassName

    /** State class applied to the root element if `disabled={true}`. */
    val disabled: ClassName

    /** Styles applied to the root element unless `disableGutters={true}`. */
    val gutters: ClassName

    /**
     * Styles applied to the children wrapper element unless `disableGutters={true}`.
     * @deprecated Combine the [.MuiAccordionSummary-gutters](/material-ui/api/accordion-summary/#AccordionSummary-classes-gutters) and [.MuiAccordionSummary-content](/material-ui/api/accordion-summary/#AccordionSummary-classes-content) classes instead. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/).
     */
    val contentGutters: ClassName

    /** Styles applied to the children wrapper element. */
    val content: ClassName

    /** Styles applied to the `expandIcon`'s wrapper element. */
    val expandIconWrapper: ClassName
}

@JsName("default")
external val accordionSummaryClasses: AccordionSummaryClasses
