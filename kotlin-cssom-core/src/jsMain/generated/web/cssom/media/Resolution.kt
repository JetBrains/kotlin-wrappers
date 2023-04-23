// Automatically generated - do not modify!

package web.cssom.media

sealed interface Resolution

inline val Number.dpi: Resolution
    get() = "${this}dpi".unsafeCast<Resolution>()

inline val Number.dpcm: Resolution
    get() = "${this}dpcm".unsafeCast<Resolution>()

inline val Number.dppx: Resolution
    get() = "${this}dppx".unsafeCast<Resolution>()
