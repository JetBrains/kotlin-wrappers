package web.fs

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface WellKnownDirectory :
    StartInDirectory

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
