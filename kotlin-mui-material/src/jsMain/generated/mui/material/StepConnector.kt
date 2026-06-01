// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepConnector")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface StepConnectorProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithSx {
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
 * - [Stepper](https://v6.mui.com/material-ui/react-stepper/)
 *
 * API:
 *
 * - [StepConnector API](https://v6.mui.com/material-ui/api/step-connector/)
 */
@JsName("default")
external val StepConnector: FC<StepConnectorProps>
