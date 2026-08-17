// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PositionAlignSetting

inline val PositionAlignSetting.Companion.auto: PositionAlignSetting
    get() = unsafeCast("auto")

inline val PositionAlignSetting.Companion.center: PositionAlignSetting
    get() = unsafeCast("center")

inline val PositionAlignSetting.Companion.lineLeft: PositionAlignSetting
    get() = unsafeCast("line-left")

inline val PositionAlignSetting.Companion.lineRight: PositionAlignSetting
    get() = unsafeCast("line-right")
