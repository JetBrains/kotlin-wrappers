package karakum.query

class Class(
    override val source: String,
) : TypeBase() {
    override val name: String =
        getTypeName(source, JsTypeKeyword.CLASS)

    override val openByDefault: Boolean = true

    private val abstract: Boolean = " abstract " in source.substringBefore("{")

    override fun toCode(): String {
        val constructor = members.asSequence()
            .filterIsInstance<Constructor>()
            .firstOrNull()
            ?.toCode() ?: ""

        val extends = parentType?.let {
            val parent = if (it == "Error") "JsError" else it

            ":" + (if ("\n" !in constructor) "\n" else "") + parent
        } ?: ""

        val modifier = if (abstract) "abstract" else "open"
        val result = "$modifier external class $name ${formatParameters(typeParameters)}" +
                constructor +
                "$extends {\n$content\n}"

        return if ("QueriesObserverOptimisticResult<TCombinedResult>" in result) {
            result + "\n\n" + QUERIES_OBSERVER_OPTIMISTIC_RESULT_CODE
        } else result
    }
}
