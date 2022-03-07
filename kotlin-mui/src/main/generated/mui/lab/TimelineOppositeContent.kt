// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineOppositeContent")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface TimelineOppositeContentProps :
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
    var classes: TimelineOppositeContentClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Timeline](https://mui.com/components/timeline/)
 *
 * API:
 *
 * - [TimelineOppositeContent API](https://mui.com/api/timeline-opposite-content/)
 * - inherits [Typography API](https://mui.com/api/typography/)
 */
@JsName("default")
external val TimelineOppositeContent: react.FC<TimelineOppositeContentProps>
