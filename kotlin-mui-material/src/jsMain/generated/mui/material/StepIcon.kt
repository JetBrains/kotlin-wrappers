// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepIcon")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface StepIconProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithSx {
    /**
     * Whether this step is active.
     * @default false
     */
    var active: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepIconClasses?

    /**
     * Mark the step as completed. Is passed to child components.
     * @default false
     */
    var completed: Boolean?

    /**
     * If `true`, the step is marked as failed.
     * @default false
     */
    var error: Boolean?

    /**
     * The label displayed in the step icon.
     */
    var icon: ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Stepper](https://v6.mui.com/material-ui/react-stepper/)
 *
 * API:
 *
 * - [StepIcon API](https://v6.mui.com/material-ui/api/step-icon/)
 * - inherits [SvgIcon API](https://v6.mui.com/material-ui/api/svg-icon/)
 */
@JsName("default")
external val StepIcon: FC<StepIconProps>
