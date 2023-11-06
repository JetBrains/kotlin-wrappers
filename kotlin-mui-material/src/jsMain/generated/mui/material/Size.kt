// Automatically generated - do not modify!

package mui.material

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("(/*union*/{small: 'small', medium: 'medium', normal: 'normal', large: 'large'}/*union*/)")
sealed external interface Size {
    object small : Size, BaseSize, NormalSize
    object medium : Size, BaseSize
    object normal : NormalSize
    object large : Size
}

sealed external interface BaseSize
sealed external interface NormalSize
