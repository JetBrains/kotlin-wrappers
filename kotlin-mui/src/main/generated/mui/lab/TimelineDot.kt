// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineDot")
@file:JsNonModule

package mui.lab

external interface TimelineDotProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TimelineDotClasses?

    /**
     * The dot can have a different colors.
     * @default 'grey'
     */
    var color: TimelineDotColor?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The dot can appear filled or outlined.
     * @default 'filled'
     */
    var variant: TimelineDotVariant?
}

/**
 *
 * Demos:
 *
 * - [Timeline](https://mui.com/components/timeline/)
 *
 * API:
 *
 * - [TimelineDot API](https://mui.com/api/timeline-dot/)
 */
@JsName("default")
external val TimelineDot: react.FC<TimelineDotProps>
