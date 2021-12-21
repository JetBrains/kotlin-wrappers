// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionSummary")
@file:JsNonModule

package mui.material

external interface AccordionSummaryProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AccordionSummaryClasses?

    /**
     * The icon to display as the expand indicator.
     */
    var expandIcon: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Accordion](https://mui.com/components/accordion/)
 *
 * API:
 *
 * - [AccordionSummary API](https://mui.com/api/accordion-summary/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val AccordionSummary: react.FC<AccordionSummaryProps>
