package karakum.query

// language=TypeScript
internal val HYDRATE_OPTIONS_SOURCE = """
interface HydrateOptions {
    defaultOptions?: {
        deserializeData?: TransformerFn;
        queries?: QueryOptions;
        mutations?: MutationOptions<unknown, DefaultError, unknown, unknown>;
    };
}
""".trimIndent()

// language=kotlin
internal val HYDRATE_OPTIONS_CODE = """
@JsPlainObject
external interface DefaultHydrateOptions {
    val deserializeData: TransformerFn?
    val queries: QueryOptions<*, *, *, *, *>?
    val mutations: MutationOptions<*, DefaultError, *, *>?
}    

@JsPlainObject
external interface HydrateOptions {
    val defaultOptions: DefaultHydrateOptions?
}
""".trimIndent()
