// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineConnector")
@file:JsNonModule

package mui.lab

import kotlinext.js.ReadonlyArray

external interface TimelineConnectorProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TimelineConnectorClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Timeline](https://mui.com/components/timeline/)
 *
 * API:
 *
 * - [TimelineConnector API](https://mui.com/api/timeline-connector/)
 */
@JsName("default")
external val TimelineConnector: react.FC<TimelineConnectorProps>
