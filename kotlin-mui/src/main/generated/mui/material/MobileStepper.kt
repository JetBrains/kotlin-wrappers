// Automatically generated - do not modify!

@file:JsModule("@mui/material/MobileStepper")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface MobileStepperProps :
    mui.system.StandardProps,
    PaperProps {
    /**
     * Set the active step (zero based index).
     * Defines which dot is highlighted when the variant is 'dots'.
     * @default 0
     */
    var activeStep: Number?

    /**
     * A back button element. For instance, it can be a `Button` or an `IconButton`.
     */
    var backButton: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MobileStepperClasses?

    /**
     * Props applied to the `LinearProgress` element.
     */
    var LinearProgressProps: LinearProgressProps?

    /**
     * A next button element. For instance, it can be a `Button` or an `IconButton`.
     */
    var nextButton: react.ReactNode

    /**
     * Set the positioning type.
     * @default 'bottom'
     */
    var position: MobileStepperPosition?

    /**
     * The total steps.
     */
    var steps: Number

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The variant to use.
     * @default 'dots'
     */
    var variant: MobileStepperVariant?
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/components/steppers/)
 *
 * API:
 *
 * - [MobileStepper API](https://mui.com/api/mobile-stepper/)
 * - inherits [Paper API](https://mui.com/api/paper/)
 */
@JsName("default")
external val MobileStepper: react.FC<MobileStepperProps>
