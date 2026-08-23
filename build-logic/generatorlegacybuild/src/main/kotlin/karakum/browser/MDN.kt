package karakum.browser

import java.io.File

internal object MDN {
    lateinit var root: File
}

internal fun mdnContent(path: String): String =
    MDN.root.resolve(path).readText()

private fun getApiDirectory(typeName: String): File? =
    MDN.root
        .resolve("api")
        .resolve(typeName.lowercase())
        .takeIf { it.isDirectory }

internal fun hasMdnPage(typeName: String): Boolean =
    getApiDirectory(typeName) != null

internal fun hasMdnSubpages(typeName: String): Boolean =
    getApiDirectory(typeName)
        ?.listFiles { it.isDirectory }
        ?.isNotEmpty()
        ?: false
