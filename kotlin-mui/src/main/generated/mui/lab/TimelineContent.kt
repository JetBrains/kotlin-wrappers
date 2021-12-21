// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineContent")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.lab

external interface TimelineContentProps :
    mui.system.StandardProps,
    mui.material.TypographyProps,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TimelineContentClasses?

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
 * - [TimelineContent API](https://mui.com/api/timeline-content/)
 * - inherits [Typography API](https://mui.com/api/typography/)
 */
@JsName("default")
external val TimelineContent: react.FC<TimelineContentProps>
