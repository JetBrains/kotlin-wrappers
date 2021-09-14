// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface Length

inline fun Length(value: String): Length =
    value.unsafeCast<Length>()

inline val Number.ch: Length
    get() = "${this}ch".unsafeCast<Length>()

inline val Number.em: Length
    get() = "${this}em".unsafeCast<Length>()

inline val Number.ex: Length
    get() = "${this}ex".unsafeCast<Length>()

inline val Number.rem: Length
    get() = "${this}rem".unsafeCast<Length>()

inline val Number.vh: Length
    get() = "${this}vh".unsafeCast<Length>()

inline val Number.vw: Length
    get() = "${this}vw".unsafeCast<Length>()

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

inline val Number.pct: Length
    get() = "${this}%".unsafeCast<Length>()
