// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import js.reflect.unsafeCast

sealed external interface BiquadFilterType {
    companion object
}

inline val BiquadFilterType.Companion.allpass: BiquadFilterType
    get() = unsafeCast("allpass")

inline val BiquadFilterType.Companion.bandpass: BiquadFilterType
    get() = unsafeCast("bandpass")

inline val BiquadFilterType.Companion.highpass: BiquadFilterType
    get() = unsafeCast("highpass")

inline val BiquadFilterType.Companion.highshelf: BiquadFilterType
    get() = unsafeCast("highshelf")

inline val BiquadFilterType.Companion.lowpass: BiquadFilterType
    get() = unsafeCast("lowpass")

inline val BiquadFilterType.Companion.lowshelf: BiquadFilterType
    get() = unsafeCast("lowshelf")

inline val BiquadFilterType.Companion.notch: BiquadFilterType
    get() = unsafeCast("notch")

inline val BiquadFilterType.Companion.peaking: BiquadFilterType
    get() = unsafeCast("peaking")
