package karakum.query

private val SKIPPED_INTERFACES = setOf(
    "AnyDataTag",
)

private enum class InterfaceType {
    PROPS,
    JSO,

    ;
}

class Interface(
    override val source: String,
    fixAction: Boolean,
) : TypeBase() {
    override val name: String =
        getTypeName(source, JsTypeKeyword.INTERFACE, fixAction)

    override val openByDefault: Boolean = false

    private val type: InterfaceType by lazy {
        when {
            name.endsWith("Props")
                -> InterfaceType.PROPS

            else -> InterfaceType.JSO
        }
    }

    override val immutable: Boolean
        get() = super.immutable || type == InterfaceType.JSO

    override fun toCode(): String {
        if (name in SKIPPED_INTERFACES)
            return ""

        val extends = parentType?.let {
            val parent = it
                .replace("BaseResult<", "Result<")
                .replace(
                    "FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey>",
                    "FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, Void>",
                )

            ":\n$parent"
        } ?: ""

        when (name) {
            "QueryMeta",
            "MutationMeta",
                -> {
                return "external interface $name : Record<String, Any>"
            }

            "FetchMeta" -> {
                check(source == FETCH_META_SOURCE)
                return FETCH_META_CODE
            }

            "HydrateOptions" -> {
                check(source == HYDRATE_OPTIONS_SOURCE)
                return HYDRATE_OPTIONS_CODE
            }
        }

        val body = when {
            name.startsWith("MutationObserver")
                -> content.replaceFirst("status: QueryStatus", "status: MutationStatus")

            name.startsWith("NotifyEvent")
                -> content.replaceFirst("type: Type /*", "type: NotifyEventType /*")

            name.startsWith("UseSuspense") || name.startsWith("UsePrefetch")
                -> "/* $content */"

            else -> content
        }

        val annotations = when (type) {
            InterfaceType.PROPS,
                -> ""

            InterfaceType.JSO,
                -> "@JsPlainObject\n"
        }
        return "${annotations}external interface $name ${formatParameters(typeParameters)} $extends {\n$body\n}"
    }
}
