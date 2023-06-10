// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepIcon")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface StepIconProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.system.PropsWithSx {
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
    var icon: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Stepper](https://mui.com/material-ui/react-stepper/)
 *
 * API:
 *
 * - [StepIcon API](https://mui.com/material-ui/api/step-icon/)
 */
@JsName("default")
external val StepIcon: react.FC<StepIconProps>
