@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fs

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface WellKnownDirectory :
    StartInDirectory {

    companion object
}

@ExperimentalWebApi
inline val WellKnownDirectory.Companion.desktop: WellKnownDirectory
    get() = unsafeCast("desktop")

@ExperimentalWebApi
inline val WellKnownDirectory.Companion.documents: WellKnownDirectory
    get() = unsafeCast("documents")

@ExperimentalWebApi
inline val WellKnownDirectory.Companion.downloads: WellKnownDirectory
    get() = unsafeCast("downloads")

@ExperimentalWebApi
inline val WellKnownDirectory.Companion.music: WellKnownDirectory
    get() = unsafeCast("music")

@ExperimentalWebApi
inline val WellKnownDirectory.Companion.pictures: WellKnownDirectory
    get() = unsafeCast("pictures")

@ExperimentalWebApi
inline val WellKnownDirectory.Companion.videos: WellKnownDirectory
    get() = unsafeCast("videos")
