// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionActions")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AccordionActionsProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AccordionActionsClasses?

    /**
     * If `true`, the actions do not have additional margin.
     * @default false
     */
    var disableSpacing: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Accordion](https://mui.com/components/accordion/)
 *
 * API:
 *
 * - [AccordionActions API](https://mui.com/api/accordion-actions/)
 */
@JsName("default")
external val AccordionActions: react.FC<AccordionActionsProps>
