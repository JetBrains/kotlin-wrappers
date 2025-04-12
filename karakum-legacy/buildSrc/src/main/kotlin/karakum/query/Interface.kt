package karakum.query

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
        val extends = parentType?.let {
            ":\n${it.replace("BaseResult<", "Result<")}"
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

            name.startsWith("UseSuspense")
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
