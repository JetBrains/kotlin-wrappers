// Automatically generated - do not modify!

package mui.material.styles

import react.CSSProperties
import seskar.js.JsValue

sealed /* union */
external interface FocusVisiblePosition {
    companion object {
        @JsValue("inset")
        val inset: FocusVisiblePosition

        @JsValue("outset")
        val outset: FocusVisiblePosition
    }
}

/**
 * CSS of the keyboard focus ring, spread onto the `Mui-focusVisible` state.
 */
typealias FocusVisible = CSSProperties

/**
 * The `focusVisible` theme option. `insetOverrides` holds the styles that change on components that
 * draw the ring inside their edge.
 */
external interface FocusVisibleOptions : CSSProperties {
    var insetOverrides: CSSProperties?
}

inline fun FocusVisibleOptions(
    block: FocusVisibleOptions.() -> Unit,
): FocusVisibleOptions =
    js.objects.unsafeJso(block)

/**
 * Returns the `theme.focusVisible` ring for a focus selector. `'outset'` is `theme.focusVisible`,
 * and `'inset'` merges the inset ring over it. Returns `{}` when `theme.focusVisible` is off.
 */
inline fun BaseTheme.applyFocusVisible(
    position: FocusVisiblePosition,
): CSSProperties =
    asDynamic().applyFocusVisible(position)
