// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepConnector")
@file:JsNonModule

package mui.material

external interface StepConnectorProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepConnectorClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/components/steppers/)
 *
 * API:
 *
 * - [StepConnector API](https://mui.com/api/step-connector/)
 */
@JsName("default")
external val StepConnector: react.FC<StepConnectorProps>
