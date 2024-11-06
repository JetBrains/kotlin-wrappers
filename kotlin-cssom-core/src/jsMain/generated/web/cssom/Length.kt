// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast
import seskar.js.JsValue

sealed external interface Length : LengthType {
    companion object {
        @JsValue("fit-content")
        val fitContent: LengthType.FitContent

        @JsValue("intrinsic")
        val intrinsic: LengthType.Intrinsic

        @JsValue("max-content")
        val maxContent: LengthType.MaxContent

        @JsValue("min-content")
        val minContent: LengthType.MinContent

        @JsValue("min-intrinsic")
        val minIntrinsic: LengthType.MinIntrinsic

        @JsValue("normal")
        val normal: LengthType.Normal
    }
}

inline val Number.ch: Length
    get() = unsafeCast("${this}ch")

inline val Number.em: Length
    get() = unsafeCast("${this}em")

inline val Number.ex: Length
    get() = unsafeCast("${this}ex")

inline val Number.rem: Length
    get() = unsafeCast("${this}rem")

inline val Number.cqw: Length
    get() = unsafeCast("${this}cqw")

inline val Number.cqh: Length
    get() = unsafeCast("${this}cqh")

inline val Number.cqi: Length
    get() = unsafeCast("${this}cqi")

inline val Number.cqb: Length
    get() = unsafeCast("${this}cqb")

inline val Number.cqmin: Length
    get() = unsafeCast("${this}cqmin")

inline val Number.cqmax: Length
    get() = unsafeCast("${this}cqmax")

inline val Number.dvw: Length
    get() = unsafeCast("${this}dvw")

inline val Number.dvh: Length
    get() = unsafeCast("${this}dvh")

inline val Number.dvi: Length
    get() = unsafeCast("${this}dvi")

inline val Number.dvb: Length
    get() = unsafeCast("${this}dvb")

inline val Number.dvmin: Length
    get() = unsafeCast("${this}dvmin")

inline val Number.dvmax: Length
    get() = unsafeCast("${this}dvmax")

inline val Number.lvw: Length
    get() = unsafeCast("${this}lvw")

inline val Number.lvh: Length
    get() = unsafeCast("${this}lvh")

inline val Number.lvi: Length
    get() = unsafeCast("${this}lvi")

inline val Number.lvb: Length
    get() = unsafeCast("${this}lvb")

inline val Number.lvmin: Length
    get() = unsafeCast("${this}lvmin")

inline val Number.lvmax: Length
    get() = unsafeCast("${this}lvmax")

inline val Number.svw: Length
    get() = unsafeCast("${this}svw")

inline val Number.svh: Length
    get() = unsafeCast("${this}svh")

inline val Number.svi: Length
    get() = unsafeCast("${this}svi")

inline val Number.svb: Length
    get() = unsafeCast("${this}svb")

inline val Number.svmin: Length
    get() = unsafeCast("${this}svmin")

inline val Number.svmax: Length
    get() = unsafeCast("${this}svmax")

inline val Number.vw: Length
    get() = unsafeCast("${this}vw")

inline val Number.vh: Length
    get() = unsafeCast("${this}vh")

inline val Number.vmin: Length
    get() = unsafeCast("${this}vmin")

inline val Number.vmax: Length
    get() = unsafeCast("${this}vmax")

inline val Number.px: Length
    get() = unsafeCast("${this}px")

inline val Number.cm: Length
    get() = unsafeCast("${this}cm")

inline val Number.mm: Length
    get() = unsafeCast("${this}mm")

inline val Number.`in`: Length
    get() = unsafeCast("${this}in")

inline val Number.pc: Length
    get() = unsafeCast("${this}pc")

inline val Number.pt: Length
    get() = unsafeCast("${this}pt")
