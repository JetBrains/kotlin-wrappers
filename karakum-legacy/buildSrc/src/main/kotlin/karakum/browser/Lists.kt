package karakum.browser

private val LISTS_BODY = """
typealias Float32List = Float32Array<*> /* | GLfloat[] */
typealias Int32List = Int32Array<*> /* | GLint[] */
typealias Uint32List = Uint32Array<*> /* | GLuint[] */
""".trimIndent()

internal fun Lists(): ConversionResult =
    ConversionResult(
        name = "Lists",
        body = LISTS_BODY,
    )
