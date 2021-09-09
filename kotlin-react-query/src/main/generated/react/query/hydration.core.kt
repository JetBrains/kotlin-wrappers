// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

external interface DehydrateOptions {
    var dehydrateMutations: Boolean
    var dehydrateQueries: Boolean
    var shouldDehydrateMutation: ShouldDehydrateMutationFunction
    var shouldDehydrateQuery: ShouldDehydrateQueryFunction
}

external interface DefaultHydrateOptions {
    var queries: QueryOptions<*, *, *, *>
    var mutations: MutationOptions<*, *, *, *>
}

external interface HydrateOptions {
    var defaultOptions: DefaultHydrateOptions
}

external interface DehydratedMutation {
    var mutationKey: MutationKey
    var state: MutationState<*, *, *, *>
}

external interface DehydratedQuery {
    var queryHash: String
    var queryKey: QueryKey
    var state: QueryState<*, *>
}

external interface DehydratedState {
    var mutations: Array<out DehydratedMutation>
    var queries: Array<out DehydratedQuery>
}

typealias ShouldDehydrateQueryFunction = (query: Query<*, *, *, *>) -> Boolean

typealias ShouldDehydrateMutationFunction = (mutation: Mutation<*, *, *, *>) -> Boolean

external fun dehydrate(
    client: QueryClient,
    options: DehydrateOptions = definedExternally,
): DehydratedState

external fun hydrate(
    client: QueryClient,
    dehydratedState: dynamic,
    options: HydrateOptions = definedExternally,
)
