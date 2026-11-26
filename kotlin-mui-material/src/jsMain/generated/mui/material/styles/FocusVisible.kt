// Automatically generated - do not modify!

package mui.material.styles

import csstype.PropertiesBuilder
import js.objects.Object
import js.objects.unsafeJso
import kotlinx.js.JsPlainObject
import react.CSSProperties

/**
 * CSS of the keyboard focus ring, spread onto the `Mui-focusVisible` state.
 */
typealias FocusVisible = CSSProperties

/**
 * The `focusVisible` theme option. `insetOverrides` holds the styles that change on components that
 * draw the ring inside their edge.
 */
@JsPlainObject
external interface FocusVisibleOptions {
    val insetOverrides: CSSProperties?
}

inline fun FocusVisibleOptions(
    style: CSSProperties,
    insetOverrides: CSSProperties? = null,
): FocusVisibleOptions =
    Object.assign(
        unsafeJso(),
        style,
        FocusVisibleOptions(
            insetOverrides = insetOverrides,
        ),
    )

inline fun FocusVisibleOptions(
    insetOverrides: CSSProperties? = null,
    crossinline block: PropertiesBuilder.() -> Unit,
): FocusVisibleOptions =
    Object.assign(
        unsafeJso(block),
        FocusVisibleOptions(
            insetOverrides = insetOverrides,
        ),
    )
