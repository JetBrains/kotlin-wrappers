// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionActions")
@file:JsNonModule

package mui.material

external interface AccordionActionsProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AccordionActionsClasses

    /**
     * If `true`, the actions do not have additional margin.
     * @default false
     */
    var disableSpacing: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
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
