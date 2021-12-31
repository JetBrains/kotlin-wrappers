// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineItem")
@file:JsNonModule

package mui.lab

external interface TimelineItemProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
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
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Timeline](https://mui.com/components/timeline/)
 *
 * API:
 *
 * - [TimelineItem API](https://mui.com/api/timeline-item/)
 */
@JsName("default")
external val TimelineItem: react.FC<TimelineItemProps>
