// Automatically generated - do not modify!

@file:JsModule("@mui/material/OutlinedInput")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface OutlinedInputProps :
    mui.system.StandardProps,
    InputBaseProps {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: OutlinedInputClasses?

    /**
     * The label of the `input`. It is only used for layout. The actual labelling
     * is handled by `InputLabel`.
     */
    var label: react.ReactNode?

    /**
     * If `true`, the outline is notched to accommodate the label.
     */
    var notched: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Text Fields](https://mui.com/components/text-fields/)
 *
 * API:
 *
 * - [OutlinedInput API](https://mui.com/api/outlined-input/)
 * - inherits [InputBase API](https://mui.com/api/input-base/)
 */
@JsName("default")
external val OutlinedInput: react.FC<OutlinedInputProps>
