// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

external interface QueryFilters {
    var active: Boolean
    var exact: Boolean
    var inactive: Boolean
    var predicate: (query: Query<*, *, *, *>) -> Boolean
    var queryKey: QueryKey
    var stale: Boolean
    var fetching: Boolean
}

external interface MutationFilters {
    var exact: Boolean
    var predicate: (mutation: Mutation<*, *, *, *>) -> Boolean
    var mutationKey: MutationKey
    var fetching: Boolean
}

typealias DataUpdateFunction<TInput, TOutput> = (input: TInput) -> TOutput

typealias Updater<TInput, TOutput> = Union /* TOutput | DataUpdateFunction<TInput, TOutput> */

typealias QueryStatusFilter = Union /* 'all' | 'active' | 'inactive' | 'none' */

external val isServer: Boolean

external fun noop(): Nothing?

external fun <TInput, TOutput> functionalUpdate(
    updater: Updater<TInput, TOutput>,
    input: TInput,
): TOutput

external fun isValidTimeout(value: Any): Boolean /* value is number */

external fun <T : QueryKey> ensureQueryKeyArray(value: T): EnsuredQueryKey<T>

external fun <T> difference(
    array1: Array<out T>,
    array2: Array<out T>,
): Array<out T>

external fun <T> replaceAt(
    array: Array<out T>,
    index: Number,
    value: T,
): Array<out T>

external fun timeUntilStale(
    updatedAt: Number,
    staleTime: Number = definedExternally,
): Number

external fun <TOptions : QueryOptions<*, *, *, TQueryKey>, TQueryKey : QueryKey> parseQueryArgs(
    arg1: dynamic,
    arg2: dynamic = definedExternally,
    arg3: TOptions = definedExternally,
): TOptions

external fun <TOptions : MutationOptions<*, *, *, *>> parseMutationArgs(
    arg1: dynamic,
    arg2: dynamic = definedExternally,
    arg3: TOptions = definedExternally,
): TOptions

external fun <TFilters : QueryFilters, TOptions> parseFilterArgs(
    arg1: dynamic = definedExternally,
    arg2: dynamic = definedExternally,
    arg3: TOptions = definedExternally,
): dynamic

external fun mapQueryStatusFilter(
    active: Boolean = definedExternally,
    inactive: Boolean = definedExternally,
): QueryStatusFilter

external fun matchQuery(
    filters: QueryFilters,
    query: Query<*, *, *, *>,
): Boolean

external fun matchMutation(
    filters: MutationFilters,
    mutation: Mutation<*, *, *, *>,
): Boolean

external fun <TQueryKey : QueryKey> hashQueryKeyByOptions(
    queryKey: TQueryKey,
    options: QueryOptions<*, *, *, TQueryKey> = definedExternally,
): String

external fun hashQueryKey(queryKey: QueryKey): String

external fun stableValueHash(value: Any): String

external fun partialMatchKey(
    a: QueryKey,
    b: QueryKey,
): Boolean

external fun partialDeepEqual(
    a: Any,
    b: Any,
): Boolean

external fun <T> replaceEqualDeep(
    a: dynamic,
    b: T,
): T

external fun <T> shallowEqualObjects(
    a: T,
    b: T,
): Boolean

external fun isPlainObject(o: Any): Boolean /* o is Object */

external fun isQueryKey(value: Any): Boolean /* value is QueryKey */

external fun isError(value: Any): Boolean /* value is Error */

external fun sleep(timeout: Number): kotlin.js.Promise<Unit>

external fun scheduleMicrotask(callback: () -> Unit)
