// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepLabel")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface StepLabelProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * In most cases will simply be a string containing a title for the label.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepLabelClasses?

    /**
     * The props used for each slot inside.
     * @default {}
     */
    var componentsProps: dynamic
    var label: dynamic

    /**
     * If `true`, the step is marked as failed.
     * @default false
     */
    var error: Boolean?

    /**
     * Override the default label of the step icon.
     */
    var icon: react.ReactNode?

    /**
     * The optional node to display.
     */
    var optional: react.ReactNode?

    /**
     * The component to render in place of the [`StepIcon`](/material-ui/api/step-icon/).
     */
    var StepIconComponent: react.ElementType<*>?

    /**
     * Props applied to the [`StepIcon`](/material-ui/api/step-icon/) element.
     */
    var StepIconProps: StepIconProps?

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
 * - [StepLabel API](https://mui.com/material-ui/api/step-label/)
 */
@JsName("default")
external val StepLabel: react.FC<StepLabelProps>
