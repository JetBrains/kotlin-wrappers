package karakum.query

class Const(
    override val source: String,
) : Declaration() {
    override val name: String = source
        .substringAfter("${JsTypeKeyword.CONST} ")
        .substringBefore(": ")

    private val type: String by lazy {
        kotlinType(
            source.substringAfter(": ")
                .removeSuffix(";")
        )
    }

    override fun toCode(): String {
        if (type == "unique symbol") {
            return when (name) {
                "skipToken",
                    -> """
                external object $name: 
                    Symbol,
                    QueryFunctionOrSkipToken<Nothing, Nothing, Nothing>
                """.trimIndent()

                else -> "external object $name: Symbol"
            }
        }

        return "external val $name: $type"
    }
}
