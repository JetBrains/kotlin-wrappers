// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormGroup")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface FormGroupProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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
 * - [Checkbox](https://v6.mui.com/material-ui/react-checkbox/)
 * - [Switch](https://v6.mui.com/material-ui/react-switch/)
 *
 * API:
 *
 * - [FormGroup API](https://v6.mui.com/material-ui/api/form-group/)
 */
@JsName("default")
external val FormGroup: FC<FormGroupProps>
