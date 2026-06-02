// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineDot")

package mui.lab

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface TimelineDotProps :
    StandardProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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
 * - [Timeline](https://v6.mui.com/material-ui/react-timeline/)
 *
 * API:
 *
 * - [TimelineDot API](https://v6.mui.com/material-ui/api/timeline-dot/)
 */
@JsName("default")
external val TimelineDot: FC<TimelineDotProps>
