package karakum.browser

private val MUTABLE_SET_LIKE_OVERRIDES = """
override val size: Int

override fun add(value: -T-)
override fun clear()
override fun delete(value: -T-): Boolean
override fun entries(): JsIterator<Tuple2<-T-, -T->>
override fun forEach(action: (value: -T-) -> Unit)
override fun has(key: -T-): Boolean
override fun keys(): JsIterator<-T->
override fun values(): JsIterator<-T->
""".trimIndent()

internal fun mutableSetLikeOverrides(
    typeParameter: String,
): String =
    MUTABLE_SET_LIKE_OVERRIDES
        .replace("-T-", typeParameter)
