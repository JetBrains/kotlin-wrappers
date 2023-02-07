package web.url

import web.media.source.MediaSource

fun URL.Companion.createObjectURL(
    obj: MediaSource,
): String =
    asDynamic().createObjectURL(obj)
