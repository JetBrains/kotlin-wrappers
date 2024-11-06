// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

inline fun fitContent(
    value: Length,
): GridTemplateTracks =
    unsafeCast("fit-content($value)")

inline fun minmax(
    min: GridAutoTracks,
    max: GridAutoTracks,
): GridAutoTracks =
    unsafeCast("minmax($min,$max)")

inline fun repeat(
    times: Int,
    value: GridTemplateTracks,
): GridTemplateTracks =
    unsafeCast("repeat($times,$value)")

inline fun repeat(
    repeat: AutoRepeat,
    value: GridTemplateTracks,
): GridTemplateTracks =
    unsafeCast("repeat($repeat,$value)")
