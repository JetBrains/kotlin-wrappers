// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepButton")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface StepButtonProps :
    StepButtonOwnProps,
    PropsWithComponent,
    ButtonBaseProps

external interface StepButtonOwnProps :
    PropsWithChildren,
    PropsWithSx,
    ButtonBaseProps {
    /**
     * Can be a `StepLabel` or a node to place inside `StepLabel` as children.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: StepButtonClasses?

    /**
     * The icon displayed by the step label.
     */
    var icon: ReactNode?

    /**
     * The optional node to display.
     */
    var optional: ReactNode?

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
 * - [StepButton API](https://v6.mui.com/material-ui/api/step-button/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val StepButton: FC<StepButtonProps>
