// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormGroup")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface FormGroupProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormGroupClasses?

    /**
     * Display group of elements in a compact row.
     * @default false
     */
    var row: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * `FormGroup` wraps controls such as `Checkbox` and `Switch`.
 * It provides compact row layout.
 * For the `Radio`, you should be using the `RadioGroup` component instead of this one.
 *
 * Demos:
 *
 * - [Checkboxes](https://mui.com/material-ui/react-checkbox/)
 * - [Switches](https://mui.com/material-ui/react-switch/)
 *
 * API:
 *
 * - [FormGroup API](https://mui.com/material-ui/api/form-group/)
 */
@JsName("default")
external val FormGroup: react.FC<FormGroupProps>
