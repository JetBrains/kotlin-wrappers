package karakum.browser

import karakum.common.CommonUnionConverter.sealedUnionBody
import karakum.common.UnionConverter

private const val API: String = "api"
private const val GLOBAL_OBJECTS: String = "javascript/reference/global_objects"

internal data class UnionData(
    val name: String,
    val values: List<String>,
    private val pkg: String,
    private val contentPath: String,
) {
    private fun hasValueHashes(
        content: String,
    ): Boolean =
        values.all { "\n- `$it`" in content }
                || values.all { "\n- `\"$it\"`" in content }

    fun toConversionResult(): ConversionResult {
        val contentPathWithoutHash = contentPath.substringBefore("#")
        val file = sequenceOf(API, GLOBAL_OBJECTS)
            .map { MDN.root.resolve(it) }
            .map { it.resolve(contentPathWithoutHash) }
            .first { it.isDirectory }
            .resolve("index.md")

        val rootPath = if (GLOBAL_OBJECTS in file.absolutePath)
            "JavaScript/Reference/Global_Objects"
        else
            "API"

        val content = file.readText()
        val textFragment = !hasValueHashes(content)

        val commentProvider = object : UnionConverter.CommentProvider {
            override fun getComment(name: String): String =
                """
                /**
                 * [MDN Reference](https://developer.mozilla.org/docs/Web/$rootPath/$contentPath)
                 */
                """.trimIndent()

            override fun getComment(name: String, unionValue: String): String {
                val hash = if (textFragment)
                    ":~:text=$unionValue"
                else
                    unionValue.lowercase()

                return """
                /**
                 * [MDN Reference](https://developer.mozilla.org/docs/Web/$rootPath/$contentPathWithoutHash#$hash)
                 */
                """.trimIndent()
            }
        }

        return ConversionResult(
            name = name,
            body = sealedUnionBody(
                name = name,
                values = values,
                commentProvider = commentProvider,
            ),
            pkg = pkg,
        )
    }
}
