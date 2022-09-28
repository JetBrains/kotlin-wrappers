// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepConnector")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface StepConnectorProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepConnectorClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/material-ui/react-stepper/)
 *
 * API:
 *
 * - [StepConnector API](https://mui.com/material-ui/api/step-connector/)
 */
@JsName("default")
external val StepConnector: react.FC<StepConnectorProps>
