// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineConnector")

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

external interface TimelineConnectorProps :
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
    var classes: TimelineConnectorClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Timeline](https://v6.mui.com/material-ui/react-timeline/)
 *
 * API:
 *
 * - [TimelineConnector API](https://v6.mui.com/material-ui/api/timeline-connector/)
 */
@JsName("default")
external val TimelineConnector: FC<TimelineConnectorProps>
