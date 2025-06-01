package web.url

import web.mediasource.MediaSource

fun URL.Companion.createObjectURL(
    obj: MediaSource,
): String =
    asDynamic().createObjectURL(obj)
