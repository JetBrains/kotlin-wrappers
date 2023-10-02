// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineItem")

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface TimelineItemProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The position where the timeline's item should appear.
     */
    var position: TimelineItemPosition?

    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TimelineItemClasses?

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
 * - [TimelineItem API](https://mui.com/material-ui/api/timeline-item/)
 */
@JsName("default")
external val TimelineItem: react.FC<TimelineItemProps>
