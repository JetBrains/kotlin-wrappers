package web.url

import media.source.MediaSource

fun URL.Companion.createObjectURL(
    obj: MediaSource,
): String =
    asDynamic().createObjectURL(obj)
