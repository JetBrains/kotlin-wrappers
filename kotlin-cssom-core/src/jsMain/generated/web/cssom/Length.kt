// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
    get() = "${this}ch".unsafeCast<Length>()

inline val Number.em: Length
    get() = "${this}em".unsafeCast<Length>()

inline val Number.ex: Length
    get() = "${this}ex".unsafeCast<Length>()

inline val Number.rem: Length
    get() = "${this}rem".unsafeCast<Length>()

inline val Number.cqw: Length
    get() = "${this}cqw".unsafeCast<Length>()

inline val Number.cqh: Length
    get() = "${this}cqh".unsafeCast<Length>()

inline val Number.cqi: Length
    get() = "${this}cqi".unsafeCast<Length>()

inline val Number.cqb: Length
    get() = "${this}cqb".unsafeCast<Length>()

inline val Number.cqmin: Length
    get() = "${this}cqmin".unsafeCast<Length>()

inline val Number.cqmax: Length
    get() = "${this}cqmax".unsafeCast<Length>()

inline val Number.dvw: Length
    get() = "${this}dvw".unsafeCast<Length>()

inline val Number.dvh: Length
    get() = "${this}dvh".unsafeCast<Length>()

inline val Number.dvi: Length
    get() = "${this}dvi".unsafeCast<Length>()

inline val Number.dvb: Length
    get() = "${this}dvb".unsafeCast<Length>()

inline val Number.dvmin: Length
    get() = "${this}dvmin".unsafeCast<Length>()

inline val Number.dvmax: Length
    get() = "${this}dvmax".unsafeCast<Length>()

inline val Number.lvw: Length
    get() = "${this}lvw".unsafeCast<Length>()

inline val Number.lvh: Length
    get() = "${this}lvh".unsafeCast<Length>()

inline val Number.lvi: Length
    get() = "${this}lvi".unsafeCast<Length>()

inline val Number.lvb: Length
    get() = "${this}lvb".unsafeCast<Length>()

inline val Number.lvmin: Length
    get() = "${this}lvmin".unsafeCast<Length>()

inline val Number.lvmax: Length
    get() = "${this}lvmax".unsafeCast<Length>()

inline val Number.svw: Length
    get() = "${this}svw".unsafeCast<Length>()

inline val Number.svh: Length
    get() = "${this}svh".unsafeCast<Length>()

inline val Number.svi: Length
    get() = "${this}svi".unsafeCast<Length>()

inline val Number.svb: Length
    get() = "${this}svb".unsafeCast<Length>()

inline val Number.svmin: Length
    get() = "${this}svmin".unsafeCast<Length>()

inline val Number.svmax: Length
    get() = "${this}svmax".unsafeCast<Length>()

inline val Number.vw: Length
    get() = "${this}vw".unsafeCast<Length>()

inline val Number.vh: Length
    get() = "${this}vh".unsafeCast<Length>()

inline val Number.vmin: Length
    get() = "${this}vmin".unsafeCast<Length>()

inline val Number.vmax: Length
    get() = "${this}vmax".unsafeCast<Length>()

inline val Number.px: Length
    get() = "${this}px".unsafeCast<Length>()

inline val Number.cm: Length
    get() = "${this}cm".unsafeCast<Length>()

inline val Number.mm: Length
    get() = "${this}mm".unsafeCast<Length>()

inline val Number.`in`: Length
    get() = "${this}in".unsafeCast<Length>()

inline val Number.pc: Length
    get() = "${this}pc".unsafeCast<Length>()

inline val Number.pt: Length
    get() = "${this}pt".unsafeCast<Length>()
