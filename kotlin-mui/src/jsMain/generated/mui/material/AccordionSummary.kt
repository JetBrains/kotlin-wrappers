// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionSummary")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AccordionSummaryProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
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
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Accordion](https://mui.com/material-ui/react-accordion/)
 *
 * API:
 *
 * - [AccordionSummary API](https://mui.com/material-ui/api/accordion-summary/)
 * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val AccordionSummary: react.FC<AccordionSummaryProps>
