// Automatically generated - do not modify!

@file:JsModule("@mui/material/Stepper")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import kotlinext.js.ReadonlyArray

external interface StepperProps :
    mui.system.StandardProps,
    PaperProps,
    react.PropsWithChildren {
    /**
     * Set the active step (zero based index).
     * Set to -1 to disable all the steps.
     * @default 0
     */
    var activeStep: Number

    /**
     * If set to 'true' and orientation is horizontal,
     * then the step label will be positioned under the icon.
     * @default false
     */
    var alternativeLabel: Boolean

    /**
     * Two or more `<Step />` components.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepperClasses

    /**
     * An element to be placed between each step.
     * @default <StepConnector />
     */
    var connector: react.ReactElement?

    /**
     * If set the `Stepper` will not assist in controlling steps for linear flow.
     * @default false
     */
    var nonLinear: Boolean

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: Orientation

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/components/steppers/)
 *
 * API:
 *
 * - [Stepper API](https://mui.com/api/stepper/)
 */
@JsName("default")
external val Stepper: react.FC<StepperProps>
