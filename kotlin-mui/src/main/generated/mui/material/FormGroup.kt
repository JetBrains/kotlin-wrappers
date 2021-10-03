// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormGroup")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface FormGroupProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormGroupClasses

    /**
     * Display group of elements in a compact row.
     * @default false
     */
    var row: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 * `FormGroup` wraps controls such as `Checkbox` and `Switch`.
 * It provides compact row layout.
 * For the `Radio`, you should be using the `RadioGroup` component instead of this one.
 *
 * Demos:
 *
 * - [Checkboxes](https://mui.com/components/checkboxes/)
 * - [Switches](https://mui.com/components/switches/)
 *
 * API:
 *
 * - [FormGroup API](https://mui.com/api/form-group/)
 */
@JsName("default")
external val FormGroup: react.FC<FormGroupProps>
