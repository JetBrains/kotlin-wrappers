// Automatically generated - do not modify!

package tanstack.query.core

external interface DefaultHydrateOptions {
    var deserializeData: TransformerFn?
    var queries: QueryOptions<*, *, *, *, *>?
    var mutations: MutationOptions<*, DefaultError, *, *>?
}

external interface HydrateOptions {
    var defaultOptions: DefaultHydrateOptions?
}
