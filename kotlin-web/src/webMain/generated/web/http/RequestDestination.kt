// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface RequestDestination {
    companion object
}

inline val RequestDestination.Companion.none: RequestDestination
    get() = unsafeCast("")

inline val RequestDestination.Companion.audio: RequestDestination
    get() = unsafeCast("audio")

inline val RequestDestination.Companion.audioworklet: RequestDestination
    get() = unsafeCast("audioworklet")

inline val RequestDestination.Companion.document: RequestDestination
    get() = unsafeCast("document")

inline val RequestDestination.Companion.embed: RequestDestination
    get() = unsafeCast("embed")

inline val RequestDestination.Companion.font: RequestDestination
    get() = unsafeCast("font")

inline val RequestDestination.Companion.frame: RequestDestination
    get() = unsafeCast("frame")

inline val RequestDestination.Companion.iframe: RequestDestination
    get() = unsafeCast("iframe")

inline val RequestDestination.Companion.image: RequestDestination
    get() = unsafeCast("image")

inline val RequestDestination.Companion.manifest: RequestDestination
    get() = unsafeCast("manifest")

inline val RequestDestination.Companion.`object`: RequestDestination
    get() = unsafeCast("object")

inline val RequestDestination.Companion.paintworklet: RequestDestination
    get() = unsafeCast("paintworklet")

inline val RequestDestination.Companion.report: RequestDestination
    get() = unsafeCast("report")

inline val RequestDestination.Companion.script: RequestDestination
    get() = unsafeCast("script")

inline val RequestDestination.Companion.sharedworker: RequestDestination
    get() = unsafeCast("sharedworker")

inline val RequestDestination.Companion.style: RequestDestination
    get() = unsafeCast("style")

inline val RequestDestination.Companion.track: RequestDestination
    get() = unsafeCast("track")

inline val RequestDestination.Companion.video: RequestDestination
    get() = unsafeCast("video")

inline val RequestDestination.Companion.worker: RequestDestination
    get() = unsafeCast("worker")

inline val RequestDestination.Companion.xslt: RequestDestination
    get() = unsafeCast("xslt")
