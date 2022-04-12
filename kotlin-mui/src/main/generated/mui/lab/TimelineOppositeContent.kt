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
    react.PropsWithChildren,
    mui.system.PropsWithSx {
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
 * - [TimelineOppositeContent API](https://mui.com/material-ui/api/timeline-opposite-content/)
 * - inherits [Typography API](https://mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val TimelineOppositeContent: react.FC<TimelineOppositeContentProps>
