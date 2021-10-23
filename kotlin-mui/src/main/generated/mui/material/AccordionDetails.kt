// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionDetails")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface AccordionDetailsProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AccordionDetailsClasses?

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
 * - [AccordionDetails API](https://mui.com/api/accordion-details/)
 */
@JsName("default")
external val AccordionDetails: react.FC<AccordionDetailsProps>
