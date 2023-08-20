// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepButton")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface StepButtonProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent,
    ButtonBaseProps {
    /**
     * Can be a `StepLabel` or a node to place inside `StepLabel` as children.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: StepButtonClasses?

    /**
     * The icon displayed by the step label.
     */
    var icon: react.ReactNode?

    /**
     * The optional node to display.
     */
    var optional: react.ReactNode?

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
 * - [StepButton API](https://mui.com/material-ui/api/step-button/)
 * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val StepButton: react.FC<StepButtonProps>
