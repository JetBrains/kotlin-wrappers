// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineConnector")

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface TimelineConnectorProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
 * - [Timeline](https://mui.com/material-ui/react-timeline/)
 *
 * API:
 *
 * - [TimelineConnector API](https://mui.com/material-ui/api/timeline-connector/)
 */
@JsName("default")
external val TimelineConnector: react.FC<TimelineConnectorProps>
