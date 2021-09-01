@file:Suppress("NOTHING_TO_INLINE")

package ringui

import kotlinext.js.jso

external interface Color {
    var r: Short
    var g: Short
    var b: Short
}

inline fun Color(
    r: Short,
    g: Short,
    b: Short
): Color =
    jso {
        this.r = r
        this.g = g
        this.b = b
    }
