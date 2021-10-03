// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepButton")
@file:JsNonModule

package mui.material

external interface StepButtonProps : react.PropsWithChildren {
    /**
     * Can be a `StepLabel` or a node to place inside `StepLabel` as children.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepButtonClasses

    /**
     * The icon displayed by the step label.
     */
    var icon: react.ReactNode

    /**
     * The optional node to display.
     */
    var optional: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/components/steppers/)
 *
 * API:
 *
 * - [StepButton API](https://mui.com/api/step-button/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val StepButton: react.FC<StepButtonProps>
