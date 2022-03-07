// Automatically generated - do not modify!

@file:JsModule("@mui/material/Step")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface StepProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * Sets the step as active. Is passed to child components.
     */
    var active: Boolean?

    /**
     * Should be `Step` sub-components such as `StepLabel`, `StepContent`.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepClasses?

    /**
     * Mark the step as completed. Is passed to child components.
     */
    var completed: Boolean?

    /**
     * If `true`, the step is disabled, will also disable the button if
     * `StepButton` is a child of `Step`. Is passed to child components.
     */
    var disabled: Boolean?

    /**
     * Expand the step.
     * @default false
     */
    var expanded: Boolean?

    /**
     * The position of the step.
     * The prop defaults to the value inherited from the parent Stepper component.
     */
    var index: Number?

    /**
     * If `true`, the Step is displayed as rendered last.
     * The prop defaults to the value inherited from the parent Stepper component.
     */
    var last: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/components/steppers/)
 *
 * API:
 *
 * - [Step API](https://mui.com/api/step/)
 */
@JsName("default")
external val Step: react.FC<StepProps>
