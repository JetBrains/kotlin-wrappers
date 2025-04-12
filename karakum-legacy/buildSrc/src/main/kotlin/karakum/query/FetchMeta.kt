package karakum.query

// language=TypeScript
internal val FETCH_META_SOURCE = """
interface FetchMeta {
    fetchMore?: {
        direction: FetchDirection;
    };
}
""".trimIndent()

// language=kotlin
internal val FETCH_META_CODE = """
@JsPlainObject
external interface FetchMeta {
    val fetchMore: FetchMore?
    
    @JsPlainObject
    interface FetchMore {
        val direction: FetchDirection
    }
}
""".trimIndent()
