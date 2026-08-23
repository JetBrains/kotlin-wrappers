package karakum.browser

import java.io.File

internal object MDN {
    lateinit var root: File
}

internal fun mdnContent(path: String): String =
    MDN.root.resolve(path).readText()

internal fun hasMdnPage(typeName: String): Boolean =
    MDN.root
        .resolve("api")
        .resolve(typeName.lowercase())
        .isDirectory
