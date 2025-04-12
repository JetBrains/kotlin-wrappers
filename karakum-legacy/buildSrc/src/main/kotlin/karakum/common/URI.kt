package karakum.common

import java.net.URI

fun loadContent(uri: URI): String =
    uri.toURL().openStream()
        .use { stream -> String(stream.readAllBytes()) }
