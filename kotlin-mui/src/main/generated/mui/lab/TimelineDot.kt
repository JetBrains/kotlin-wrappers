// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineDot")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface TimelineDotProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<dom.html.HTMLSpanElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
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
    override var sx: SxProps<Theme>?

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
 * - [Timeline](https://mui.com/material-ui/react-timeline/)
 *
 * API:
 *
 * - [TimelineDot API](https://mui.com/material-ui/api/timeline-dot/)
 */
@JsName("default")
external val TimelineDot: react.FC<TimelineDotProps>
