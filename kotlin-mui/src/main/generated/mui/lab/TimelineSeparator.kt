// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineSeparator")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface TimelineSeparatorProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TimelineSeparatorClasses?

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
 * - [TimelineSeparator API](https://mui.com/material-ui/api/timeline-separator/)
 */
@JsName("default")
external val TimelineSeparator: react.FC<TimelineSeparatorProps>
