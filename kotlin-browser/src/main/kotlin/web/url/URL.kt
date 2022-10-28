package web.url

import org.w3c.dom.mediasource.MediaSource

fun URL.Companion.createObjectURL(
    obj: MediaSource,
): String =
    asDynamic().createObjectURL(obj)
