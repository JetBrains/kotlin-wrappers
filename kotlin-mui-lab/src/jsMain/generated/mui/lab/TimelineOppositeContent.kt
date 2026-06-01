// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineOppositeContent")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.lab

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface TimelineOppositeContentProps :
    StandardProps,
    mui.material.TypographyProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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
 * - [Timeline](https://v6.mui.com/material-ui/react-timeline/)
 *
 * API:
 *
 * - [TimelineOppositeContent API](https://v6.mui.com/material-ui/api/timeline-opposite-content/)
 * - inherits [Typography API](https://v6.mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val TimelineOppositeContent: FC<TimelineOppositeContentProps>
