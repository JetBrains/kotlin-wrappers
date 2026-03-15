package floating.ui.utils

import js.reflect.unsafeCast

// number | Partial<SideObject>
@JsExternalInheritorsOnly
external interface Padding

inline fun Padding(
    value: Double,
): Padding =
    unsafeCast(value)
