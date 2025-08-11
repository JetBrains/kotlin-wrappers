package web.css.painting

import js.reflect.unsafeCast

sealed external interface PaintName

inline fun PaintName(
    value: String,
): PaintName =
    unsafeCast(value)
