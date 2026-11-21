// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

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
    }
}

inline val Int.ch: Length
    get() = unsafeCast("${this}ch")

inline val Double.ch: Length
    get() = unsafeCast("${this}ch")

inline val Int.em: Length
    get() = unsafeCast("${this}em")

inline val Double.em: Length
    get() = unsafeCast("${this}em")

inline val Int.ex: Length
    get() = unsafeCast("${this}ex")

inline val Double.ex: Length
    get() = unsafeCast("${this}ex")

inline val Int.rem: Length
    get() = unsafeCast("${this}rem")

inline val Double.rem: Length
    get() = unsafeCast("${this}rem")

inline val Int.cqw: Length
    get() = unsafeCast("${this}cqw")

inline val Double.cqw: Length
    get() = unsafeCast("${this}cqw")

inline val Int.cqh: Length
    get() = unsafeCast("${this}cqh")

inline val Double.cqh: Length
    get() = unsafeCast("${this}cqh")

inline val Int.cqi: Length
    get() = unsafeCast("${this}cqi")

inline val Double.cqi: Length
    get() = unsafeCast("${this}cqi")

inline val Int.cqb: Length
    get() = unsafeCast("${this}cqb")

inline val Double.cqb: Length
    get() = unsafeCast("${this}cqb")

inline val Int.cqmin: Length
    get() = unsafeCast("${this}cqmin")

inline val Double.cqmin: Length
    get() = unsafeCast("${this}cqmin")

inline val Int.cqmax: Length
    get() = unsafeCast("${this}cqmax")

inline val Double.cqmax: Length
    get() = unsafeCast("${this}cqmax")

inline val Int.dvw: Length
    get() = unsafeCast("${this}dvw")

inline val Double.dvw: Length
    get() = unsafeCast("${this}dvw")

inline val Int.dvh: Length
    get() = unsafeCast("${this}dvh")

inline val Double.dvh: Length
    get() = unsafeCast("${this}dvh")

inline val Int.dvi: Length
    get() = unsafeCast("${this}dvi")

inline val Double.dvi: Length
    get() = unsafeCast("${this}dvi")

inline val Int.dvb: Length
    get() = unsafeCast("${this}dvb")

inline val Double.dvb: Length
    get() = unsafeCast("${this}dvb")

inline val Int.dvmin: Length
    get() = unsafeCast("${this}dvmin")

inline val Double.dvmin: Length
    get() = unsafeCast("${this}dvmin")

inline val Int.dvmax: Length
    get() = unsafeCast("${this}dvmax")

inline val Double.dvmax: Length
    get() = unsafeCast("${this}dvmax")

inline val Int.lvw: Length
    get() = unsafeCast("${this}lvw")

inline val Double.lvw: Length
    get() = unsafeCast("${this}lvw")

inline val Int.lvh: Length
    get() = unsafeCast("${this}lvh")

inline val Double.lvh: Length
    get() = unsafeCast("${this}lvh")

inline val Int.lvi: Length
    get() = unsafeCast("${this}lvi")

inline val Double.lvi: Length
    get() = unsafeCast("${this}lvi")

inline val Int.lvb: Length
    get() = unsafeCast("${this}lvb")

inline val Double.lvb: Length
    get() = unsafeCast("${this}lvb")

inline val Int.lvmin: Length
    get() = unsafeCast("${this}lvmin")

inline val Double.lvmin: Length
    get() = unsafeCast("${this}lvmin")

inline val Int.lvmax: Length
    get() = unsafeCast("${this}lvmax")

inline val Double.lvmax: Length
    get() = unsafeCast("${this}lvmax")

inline val Int.svw: Length
    get() = unsafeCast("${this}svw")

inline val Double.svw: Length
    get() = unsafeCast("${this}svw")

inline val Int.svh: Length
    get() = unsafeCast("${this}svh")

inline val Double.svh: Length
    get() = unsafeCast("${this}svh")

inline val Int.svi: Length
    get() = unsafeCast("${this}svi")

inline val Double.svi: Length
    get() = unsafeCast("${this}svi")

inline val Int.svb: Length
    get() = unsafeCast("${this}svb")

inline val Double.svb: Length
    get() = unsafeCast("${this}svb")

inline val Int.svmin: Length
    get() = unsafeCast("${this}svmin")

inline val Double.svmin: Length
    get() = unsafeCast("${this}svmin")

inline val Int.svmax: Length
    get() = unsafeCast("${this}svmax")

inline val Double.svmax: Length
    get() = unsafeCast("${this}svmax")

inline val Int.vw: Length
    get() = unsafeCast("${this}vw")

inline val Double.vw: Length
    get() = unsafeCast("${this}vw")

inline val Int.vh: Length
    get() = unsafeCast("${this}vh")

inline val Double.vh: Length
    get() = unsafeCast("${this}vh")

inline val Int.vmin: Length
    get() = unsafeCast("${this}vmin")

inline val Double.vmin: Length
    get() = unsafeCast("${this}vmin")

inline val Int.vmax: Length
    get() = unsafeCast("${this}vmax")

inline val Double.vmax: Length
    get() = unsafeCast("${this}vmax")

inline val Int.px: Length
    get() = unsafeCast("${this}px")

inline val Double.px: Length
    get() = unsafeCast("${this}px")

inline val Int.cm: Length
    get() = unsafeCast("${this}cm")

inline val Double.cm: Length
    get() = unsafeCast("${this}cm")

inline val Int.mm: Length
    get() = unsafeCast("${this}mm")

inline val Double.mm: Length
    get() = unsafeCast("${this}mm")

inline val Int.`in`: Length
    get() = unsafeCast("${this}in")

inline val Double.`in`: Length
    get() = unsafeCast("${this}in")

inline val Int.pc: Length
    get() = unsafeCast("${this}pc")

inline val Double.pc: Length
    get() = unsafeCast("${this}pc")

inline val Int.pt: Length
    get() = unsafeCast("${this}pt")

inline val Double.pt: Length
    get() = unsafeCast("${this}pt")
