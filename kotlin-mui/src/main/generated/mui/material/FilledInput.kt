// Automatically generated - do not modify!

@file:JsModule("@mui/material/FilledInput")
@file:JsNonModule

package mui.material

external interface FilledInputProps : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FilledInputClasses

    /**
     * If `true`, the label is hidden.
     * This is used to increase density for a `FilledInput`.
     * Be sure to add `aria-label` to the `input` element.
     * @default false
     */
    var hiddenLabel: Boolean

    /**
     * If `true`, the input will not have an underline.
     */
    var disableUnderline: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Text Fields](https://mui.com/components/text-fields/)
 *
 * API:
 *
 * - [FilledInput API](https://mui.com/api/filled-input/)
 * - inherits [InputBase API](https://mui.com/api/input-base/)
 */
@JsName("default")
external val FilledInput: react.FC<FilledInputProps>
