// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepLabel")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import kotlinext.js.ReadonlyArray

external interface StepLabelProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * In most cases will simply be a string containing a title for the label.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepLabelClasses

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
    var error: Boolean

    /**
     * Override the default label of the step icon.
     */
    var icon: react.ReactNode

    /**
     * The optional node to display.
     */
    var optional: react.ReactNode

    /**
     * The component to render in place of the [`StepIcon`](/api/step-icon/).
     */
    var StepIconComponent: react.ElementType<*>

    /**
     * Props applied to the [`StepIcon`](/api/step-icon/) element.
     */
    var StepIconProps: StepIconProps

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
 * - [StepLabel API](https://mui.com/api/step-label/)
 */
@JsName("default")
external val StepLabel: react.FC<StepLabelProps>
