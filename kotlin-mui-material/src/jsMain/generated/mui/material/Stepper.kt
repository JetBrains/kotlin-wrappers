// Automatically generated - do not modify!

@file:JsModule("@mui/material/Stepper")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface StepperProps :
    StepperOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent,
    StandardProps,
    PaperProps

external interface StepperOwnProps :
    PaperProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * Set the active step (zero based index).
     * Set to -1 to disable all the steps.
     * @default 0
     */
    var activeStep: Number?

    /**
     * If set to 'true' and orientation is horizontal,
     * then the step label will be positioned under the icon.
     * @default false
     */
    var alternativeLabel: Boolean?

    /**
     * Two or more `<Step />` components.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepperClasses?

    /**
     * An element to be placed between each step.
     * @default <StepConnector />
     */
    var connector: Any? /* React.ReactElement<unknown, any> */

    /**
     * If set the `Stepper` will not assist in controlling steps for linear flow.
     * @default false
     */
    var nonLinear: Boolean?

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: Orientation?

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
 * - [Stepper API](https://v6.mui.com/material-ui/api/stepper/)
 */
@JsName("default")
external val Stepper: FC<StepperProps>
