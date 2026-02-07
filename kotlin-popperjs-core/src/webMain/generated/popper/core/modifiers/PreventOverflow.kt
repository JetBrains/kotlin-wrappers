// Automatically generated - do not modify!

package popper.core.modifiers

import kotlinx.js.JsPlainObject
import seskar.js.JsValue
import kotlin.js.JsAny

sealed external interface TetherOffsetType

@JsPlainObject
external interface PreventOverflowOptions {
    val mainAxis: Boolean
    val altAxis: Boolean
    val boundary: JsAny /* Boundary */
    val rootBoundary: JsAny /* RootBoundary */
    val altBoundary: Boolean

    /**
     * Allows the popper to overflow from its boundaries to keep it near its
     * reference element
     */
    val tether: Boolean
    val tetherOffset: TetherOffsetType
    val padding: popper.core.Padding
}

@JsValue("preventOverflow")
external val PreventOverflow: popper.core.ModifierName<PreventOverflowOptions>
