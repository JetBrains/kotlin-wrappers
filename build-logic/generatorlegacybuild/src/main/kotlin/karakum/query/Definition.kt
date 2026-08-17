package karakum.query

import java.io.File

private val DECLARE_KEYWORDS = setOf(
    "export",
    "declare",
)

private val TYPE_KEYWORDS = setOf(
    JsTypeKeyword.CONST,
    JsTypeKeyword.FUNCTION,
    JsTypeKeyword.TYPE,
    JsTypeKeyword.INTERFACE,
    JsTypeKeyword.CLASS,
)

private val SKIPPED_DECLARATIONS = setOf(
    "Optional",
    "WithRequired",

    // internal `thenable` declarations
    "Fulfilled",
    "Rejected",
    "Pending",
    "FulfilledThenable",
    "RejectedThenable",
    "PendingThenable",
    "Thenable",
    "pendingThenable",
    "tryResolveSync",

    // `streamedQuery` internals (converted manually)
    "BaseStreamedQueryParams",
    "SimpleStreamedQueryParams",
    "ReducibleStreamedQueryParams",

    // react `queryOptions`, `mutationOptions`, `infiniteQueryOptions`
    "queryOptions",
    "mutationOptions",
    "infiniteQueryOptions",
    "UnusedSkipTokenOptions",
    "UnusedSkipTokenInfiniteOptions",
    "DefinedInitialDataOptions",
    "UndefinedInitialDataOptions",
    "DefinedInitialDataInfiniteOptions",
    "UndefinedInitialDataInfiniteOptions",

    // react `suspense` internals
    "defaultThrowOnError",
    "ensureSuspenseTimers",
    "fetchOptimistic",
    "shouldSuspend",
    "willFetch",

    // react `errorBoundaryUtils` internals
    "ensurePreventErrorBoundaryRetry",
    "getHasError",
    "useClearResetErrorBoundary",

    // react `useQueries` and `useSuspenseQueries`
    "useQueries",
    "useSuspenseQueries",
    "GetDefinedOrUndefinedQueryResult",
    "GetUseQueryOptionsForUseQueries",
    "GetUseQueryResult",
    "GetUseSuspenseQueryOptions",
    "GetUseSuspenseQueryResult",
    "MAXIMUM_DEPTH",
    "MAXIMUM_DEPTH_2",
    "QueriesOptions",
    "QueriesResults",
    "SkipTokenForUseQueries",
    "SkipTokenForUseQueries_2",
    "UseQueryOptionsForUseQueries",
    "SuspenseQueriesOptions",
    "SuspenseQueriesResults",
)

// tsup dts rollup gives the `_2` suffix to mutation action types
// and keeps query action types (previously `Action$1` etc.) unsuffixed
private val MUTATION_ACTION_TYPES = setOf(
    "ContinueAction",
    "ErrorAction",
    "FailedAction",
    "PauseAction",
    "SuccessAction",
)

private fun String.fixActionNames(): String =
    MUTATION_ACTION_TYPES.fold(this) { content, name ->
        // `X_2` becomes `X_1_2` in the first step and is restored to `X` in the second
        content
            .replace(name, "${name}_1")
            .replace("${name}_1_2", name)
    }

fun toDeclarations(
    definitionFile: File,
): List<Declaration> {
    val fixAction = definitionFile.name == "mutation.d.ts"

    val content = definitionFile.readText()
        .splitToSequence("\n")
        .map { line ->
            if (line.startsWith("export declare ")) line.removePrefix("export ") else line
        }
        .filter { !it.startsWith("export ") }
        .joinToString("\n") { line ->
            when {
                line.startsWith("declare interface ") || line.startsWith("declare type ")
                    -> line.removePrefix("declare ")

                else -> line
            }
        }
        .replace("Action_alias_1", "Action_1")
        .fixActionNames()
        .replace("MutationObserver_2", "MutationObserver")
        .replace("React_2.", "React.")
        .replace("\ntype Listener = (focused: boolean) => void;\n", "\n")
        .replace("Listener_2", "Listener")
        // order matters: the first replace turns `SetupFn_2` into `FocusManagerSetupFn_2`
        .replace("SetupFn", "FocusManagerSetupFn")
        .replace("FocusManagerSetupFn_2", "OnlineManagerSetupFn")
        .replace("{ queries, context, }", "options")
        .replace("{ ...options }", "options")
        .replace("{ pageParam, ...options }", "options")
        .replace("{ refetchPage, ...options }", "options")
        .replace("{ refetchPage, ...options }", "options")
        .replace(
            "const useQueryClient: (queryClient?: QueryClient) => QueryClient",
            "function useQueryClient(queryClient?: QueryClient): QueryClient",
        )
        .replace(
            "Omit<MutationObserverOptions<TData, TError, TVariables, TContext>, '_defaulted' | 'variables'>",
            "MutationObserverOptions<TData, TError, TVariables, TContext>",
        )
        .replace(
            "getQueryData<TQueryFnData = unknown, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>>(queryKey: TTaggedQueryKey): TInferredQueryFnData | undefined;",
            "getQueryData<TQueryFnData>(queryKey: QueryKey): TQueryFnData | undefined;",
        )
        .replace(
            "setQueryData<TQueryFnData = unknown, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>>(queryKey: TTaggedQueryKey, updater: Updater<NoInfer<TInferredQueryFnData> | undefined, NoInfer<TInferredQueryFnData> | undefined>, options?: SetDataOptions): NoInfer<TInferredQueryFnData> | undefined;",
            "setQueryData<TQueryFnData>(queryKey: QueryKey, updater: Updater<TQueryFnData | undefined, TQueryFnData | undefined>, options?: SetDataOptions): TQueryFnData | undefined;",
        )
        .replace(
            "setQueriesData<TQueryFnData, TQueryFilters extends QueryFilters<any> = QueryFilters>(filters: TQueryFilters, updater: Updater<NoInfer<TQueryFnData> | undefined, NoInfer<TQueryFnData> | undefined>, options?: SetDataOptions): Array<[QueryKey, TQueryFnData | undefined]>;",
            "setQueriesData<TQueryFnData, TQueryFilters extends QueryFilters<*>>(filters: TQueryFilters, updater: Updater<TQueryFnData?, TQueryFnData?>, options?: SetDataOptions): ReadonlyArray<Tuple2<QueryKey, TQueryFnData?>>;",
        )
        .replace(
            "getQueriesData<TQueryFnData = unknown, TQueryFilters extends QueryFilters<any> = QueryFilters>(filters: TQueryFilters): Array<[QueryKey, TQueryFnData | undefined]>;",
            "getQueriesData<TQueryFnData, TQueryFilters extends QueryFilters<*>>(filters: TQueryFilters): ReadonlyArray<Tuple2<QueryKey, TQueryFnData?>>;",
        )
        .replace(
            "getQueryState<TQueryFnData = unknown, TError = DefaultError, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>, TInferredError = InferErrorFromTag<TError, TTaggedQueryKey>>(queryKey: TTaggedQueryKey): QueryState<TInferredQueryFnData, TInferredError> | undefined;",
            "getQueryState<TQueryFnData, TError>(queryKey: QueryKey): QueryState<TQueryFnData, TError> | undefined;",
        )
        .replace(
            "removeQueries<TQueryFnData = unknown, TError = DefaultError, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>, TInferredError = InferErrorFromTag<TError, TTaggedQueryKey>>(filters?: QueryFilters<TInferredQueryFnData, TInferredError, TInferredQueryFnData, TTaggedQueryKey>): void;",
            "removeQueries<TQueryFilters extends QueryFilters<*>>(filters?: TQueryFilters): void;",
        )
        .replace(
            "resetQueries<TQueryFnData = unknown, TError = DefaultError, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>, TInferredError = InferErrorFromTag<TError, TTaggedQueryKey>>(filters?: QueryFilters<TInferredQueryFnData, TInferredError, TInferredQueryFnData, TTaggedQueryKey>, options?: ResetOptions): Promise<void>;",
            "resetQueries<TQueryFilters extends QueryFilters<*>>(filters?: TQueryFilters, options?: ResetOptions): Promise<void>;",
        )
        .replace(
            "cancelQueries<TQueryFnData = unknown, TError = DefaultError, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>, TInferredError = InferErrorFromTag<TError, TTaggedQueryKey>>(filters?: QueryFilters<TInferredQueryFnData, TInferredError, TInferredQueryFnData, TTaggedQueryKey>, cancelOptions?: CancelOptions): Promise<void>;",
            "cancelQueries<TQueryFilters extends QueryFilters<*>>(filters?: TQueryFilters, cancelOptions?: CancelOptions): Promise<void>;",
        )
        .replace(
            "invalidateQueries<TQueryFnData = unknown, TError = DefaultError, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>, TInferredError = InferErrorFromTag<TError, TTaggedQueryKey>>(filters?: InvalidateQueryFilters<TInferredQueryFnData, TInferredError, TInferredQueryFnData, TTaggedQueryKey>, options?: InvalidateOptions): Promise<void>;",
            "invalidateQueries<TInvalidateQueryFilters extends InvalidateQueryFilters<*>>(filters?: TInvalidateQueryFilters, options?: InvalidateOptions): Promise<void>;",
        )
        .replace(
            "refetchQueries<TQueryFnData = unknown, TError = DefaultError, TTaggedQueryKey extends QueryKey = QueryKey, TInferredQueryFnData = InferDataFromTag<TQueryFnData, TTaggedQueryKey>, TInferredError = InferErrorFromTag<TError, TTaggedQueryKey>>(filters?: RefetchQueryFilters<TInferredQueryFnData, TInferredError, TInferredQueryFnData, TTaggedQueryKey>, options?: RefetchOptions): Promise<void>;",
            "refetchQueries<TRefetchQueryFilters extends RefetchQueryFilters<*>>(filters?: TRefetchQueryFilters, options?: RefetchOptions): Promise<void>;",
        )
        .replace(
            "isMutating<TMutationFilters extends MutationFilters<any, any> = MutationFilters>(filters?: TMutationFilters): number;",
            "isMutating<TMutationFilters extends MutationFilters<*, *, *, *> = MutationFilters>(filters?: TMutationFilters): number;",
        )
        .replace(" QueryFilters<any>", " QueryFilters<*>")
        .replace("\n    isDataEqual?: (oldData: TData | undefined, newData: TData) => boolean;\n", "\n")
        .replace(OPTIMISTIC_RESULT, "QueriesObserverOptimisticResult<TCombinedResult>")
        .replace(
            "type QueryPersister<T = unknown, TQueryKey extends QueryKey = QueryKey, TPageParam = never> = [TPageParam] extends [never] ? (queryFn: QueryFunction<T, TQueryKey, never>, context: QueryFunctionContext<TQueryKey>, query: Query) => T | Promise<T> : (queryFn: QueryFunction<T, TQueryKey, TPageParam>, context: QueryFunctionContext<TQueryKey>, query: Query) => T | Promise<T>;",
            "type QueryPersister<T = unknown, TQueryKey extends QueryKey = QueryKey, TPageParam> = (queryFn: QueryFunction<T, TQueryKey, TPageParam>, context: QueryFunctionContext<TQueryKey>, query: Query) => T | Promise<T>;",
        )
        .replace(
            """
            type QueryFunctionContext<TQueryKey extends QueryKey = QueryKey, TPageParam = never> = [TPageParam] extends [never] ? {
                client: QueryClient;
                queryKey: TQueryKey;
                signal: AbortSignal;
                meta: QueryMeta | undefined;
                pageParam?: unknown;
                /**
                 * @deprecated
                 * if you want access to the direction, you can add it to the pageParam
                 */
                direction?: unknown;
            } : {
                client: QueryClient;
                queryKey: TQueryKey;
                signal: AbortSignal;
                pageParam: TPageParam;
                /**
                 * @deprecated
                 * if you want access to the direction, you can add it to the pageParam
                 */
                direction: FetchDirection;
                meta: QueryMeta | undefined;
            };
            """.trimIndent(),
            """
            interface QueryFunctionContext<TQueryKey extends QueryKey = QueryKey, TPageParam> {
                client: QueryClient;
                queryKey: TQueryKey;
                signal: AbortSignal;
                pageParam: TPageParam | undefined;
                meta: QueryMeta | undefined;
            }
            """.trimIndent(),
        )
        .replace(
            "interface ObserverFetchOptions extends FetchOptions",
            "interface ObserverFetchOptions<TData> extends FetchOptions<TData>",
        )
        // TODO: check
        .replace("    get meta(): ", "    meta: ")
        .replace("    get promise(): ", "    promise: ")
        .replace("    get queryType(): \"infinite\" | undefined;", "    queryType?: 'infinite';")
        .replace("    get resetState(): ", "    resetState: ")
        .replace(
            """
            declare const environmentManager:
            """.trimIndent(),
            """
            declare const environmentManager: EnvironmentManager;
            declare abstract class EnvironmentManager
            """.trimIndent(),
        )
        .replace(
            """
            type ManagedTimerId = number | {
                [Symbol.toPrimitive]: () => number;
            };
            """.trimIndent(),
            "type ManagedTimerId = number;",
        )
        .replace(
            "type TimeoutProvider<TTimerId extends ManagedTimerId = ManagedTimerId> = {",
            "interface TimeoutProvider<TTimerId extends ManagedTimerId> {",
        )
        .replace(
            "TimeoutManager implements Omit<TimeoutProvider, 'name'>",
            "TimeoutManager implements TimeoutProvider",
        )
        // TEMP
        .replace(" & {\n        manual: boolean;\n    }", "")
        .replace(
            """
            subscribe: Subscribable<InfiniteQueryObserverListener<TData, TError>>['subscribe'];
            """.trimIndent(),
            """
            subscribe: (listener?: InfiniteQueryObserverListener<TData, TError>) -> () -> Unit
            """.trimIndent(),
        )
        .replace(
            """
            getCurrentResult: ReplaceReturnType<QueryObserver<TQueryFnData, TError, TData, InfiniteData<TQueryFnData, TPageParam>, TQueryKey>['getCurrentResult'], InfiniteQueryObserverResult<TData, TError>>;
            """.trimIndent(),
            """
            getCurrentResult: () -> InfiniteQueryObserverResult<TData, TError>
            """.trimIndent(),
        )
        .replace(
            """
            protected fetch: ReplaceReturnType<QueryObserver<TQueryFnData, TError, TData, InfiniteData<TQueryFnData, TPageParam>, TQueryKey>['fetch'], Promise<InfiniteQueryObserverResult<TData, TError>>>;
            """.trimIndent(),
            """
            protected fetch: (fetchOptions: ObserverFetchOptions) -> Promise<InfiniteQueryObserverResult<TData, TError>>
            """.trimIndent(),
        )
        .replace("type dataTagSymbol = typeof dataTagSymbol;", "")
        .replace("type dataTagErrorSymbol = typeof dataTagErrorSymbol;", "")
        .replace("Query<unknown, Error, unknown, readonly unknown[]>[]", "Query<unknown, Error, unknown, QueryKey>[]")
        .replace(
            "QueryObserver<unknown, Error, unknown, unknown, readonly unknown[]>[]",
            "QueryObserver<unknown, Error, unknown, unknown, QueryKey>[]",
        )
        .replace(
            "function defaultshouldRedactErrors(_: unknown): boolean;",
            "function defaultShouldRedactErrors(error: unknown): boolean;",
        )
        .replace(
            "type StreamedQueryParams<TQueryFnData, TData, TQueryKey extends QueryKey> = SimpleStreamedQueryParams<TQueryFnData, TQueryKey> | ReducibleStreamedQueryParams<TQueryFnData, TData, TQueryKey>;",
            """
                type RefetchMode = 'append' | 'reset' | 'replace';

                interface StreamedQueryParams<TQueryFnData, TData, TQueryKey extends QueryKey> {
                    streamFn: (QueryFunctionContext<TQueryKey, *>) => AsyncIterable<TQueryFnData>
                    refetchMode?: RefetchMode
                    reducer?: (acc: TData, chunk: TQueryFnData) => TData
                    initialValue?: TData
                }
            """.trimIndent(),
        )
        .replace(
            """
                declare function streamedQuery<TQueryFnData = unknown, TData = Array<TQueryFnData>, TQueryKey extends QueryKey = QueryKey>({ streamFn, refetchMode, reducer, initialValue, }: StreamedQueryParams<TQueryFnData, TData, TQueryKey>): QueryFunction<TData, TQueryKey>;
            """.trimIndent(),
            """
                declare function streamedQuery<TQueryFnData, TData, TQueryKey extends QueryKey>(options: StreamedQueryParams<TQueryFnData, TData, TQueryKey>): QueryFunction<Array<TQueryFnData>, TQueryKey, *>
            """.trimIndent(),
        )
        .replace(
            "shouldThrowError<T extends (...args: Array<any>) => boolean>",
            "shouldThrowError<T extends Function<Boolean>>",
        )
        .replace(
            Regex("""type (\w+? = \{\n.+?\n});""", RegexOption.DOT_MATCHES_ALL),
            "interface $1",
        )
        .replace(
            """
                type MutationKey = Register extends {
                    mutationKey: infer TMutationKey;
                } ? TMutationKey extends Array<unknown> ? TMutationKey : TMutationKey extends Array<unknown> ? TMutationKey : ReadonlyArray<unknown> : ReadonlyArray<unknown>;
            """.trimIndent(),
            "type MutationKey = ReadonlyArray<unknown>;",
        )
        .replace(
            """
                type MutationMeta = Register extends {
                    mutationMeta: infer TMutationMeta;
                } ? TMutationMeta extends Record<string, unknown> ? TMutationMeta : Record<string, unknown> : Record<string, unknown>;
            """.trimIndent(),
            "type MutationMeta = Record<string, unknown>",
        )
        .replace(
            "queryKey?: TQueryKey | TuplePrefixes<TQueryKey>",
            "queryKey?: TQueryKey",
        )

    return getBlocks(content.split("\n"))
        .asSequence()
        .mapNotNull { (keyword, source) ->
            when (keyword) {
                JsTypeKeyword.CONST -> Const(source)
                JsTypeKeyword.FUNCTION -> Function(source)
                JsTypeKeyword.TYPE -> Type(source, fixAction)
                JsTypeKeyword.INTERFACE -> Interface(source, fixAction)
                JsTypeKeyword.CLASS -> Class(source)
                else -> null
            }
        }
        .filter { it.name !in SKIPPED_DECLARATIONS }
        .toList()
}

private fun getBlocks(
    lines: List<String>,
): List<Pair<String, String>> {
    val result = mutableListOf<Pair<String, String>>()

    var index = 0
    while (index < lines.size) {
        val line = lines[index]

        val key = line.substringBefore(" ")
        if (key in DECLARE_KEYWORDS || key in TYPE_KEYWORDS) {
            val keyword = TYPE_KEYWORDS
                .firstOrNull { "$it " in line }

            when (keyword) {
                JsTypeKeyword.CONST,
                JsTypeKeyword.FUNCTION,
                    -> result.add(keyword to line)

                JsTypeKeyword.INTERFACE,
                JsTypeKeyword.CLASS,
                JsTypeKeyword.TYPE,
                    -> {
                    val startIndex = index

                    var depth = 0
                    while (true) {
                        depth += lines[index].count { it == '{' }
                        depth -= lines[index].count { it == '}' }

                        if (depth == 0) {
                            break
                        }

                        index++
                    }

                    val body = lines.subList(startIndex, index + 1).joinToString("\n")
                    result.add(keyword to body)
                }
            }
        }

        index++
    }

    return result.toList()
}
