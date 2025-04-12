package karakum.query

abstract class TypeBase : Declaration() {
    abstract val openByDefault: Boolean

    protected val typeParameters: List<String> by lazy {
        var body = source
            .substringBefore(" {")

        if ("$name extends " in body) {
            return@lazy emptyList<String>()
        }

        if ("> extends " in body) {
            body = body.substringBefore("> extends ") + ">"
        }

        parseTypeParameters(body)
    }

    protected val parentType: String? by lazy {
        getParentType(
            name = name,
            source = source,
        )
    }

    val parentName: String? by lazy {
        parentType?.substringBefore("<")
    }

    open val immutable: Boolean by lazy {
        name.endsWith("Result") || name == "MutationState"
    }

    val members: List<Member> by lazy {
        val body = source.substringAfter("\n")
            .substringBeforeLast("\n")

        if (body != "}") {
            body.replace(HYDRATION_BOUNDARY_OPTIONS_SOURCE, HYDRATION_BOUNDARY_OPTIONS_REPLACEMENT)
                .splitToSequence("\n")
                .map { it.removePrefix("    ") }
                .map { it.removeSuffix(";") }
                .mapNotNull { member(it, openByDefault, immutable) }
                .toList()
        } else emptyList()
    }

    val content: String by lazy {
        members.asSequence()
            .filter { it !is Constructor }
            .map { it.toCode() }
            .joinToString("\n")
    }
}

private fun getParentType(
    name: String,
    source: String,
): String? {
    if (name.endsWith("Props"))
        return when (name) {
            "QueryClientProviderProps",
            "HydrationBoundaryProps",
                -> "react.PropsWithChildren"

            "QueryErrorResetBoundaryProps",
                -> "react.Props"

            else -> TODO("No parent type for `$name`")
        }

    val line = source.substringBefore(" {")
    if (" extends " !in line)
        return null

    var type = if ("$name<" in line) {
        line.substringAfterLast("> extends ", "")
            .takeIf { it.isNotEmpty() }
            ?: return null
    } else {
        line.substringAfterLast(" extends ")
    }

    if (type.startsWith("Omit<") || type.startsWith("OmitKeyof<") || type.startsWith("WithRequired<"))
        type = type
            .removePrefix("Omit<")
            .removePrefix("OmitKeyof<")
            .removePrefix("WithRequired<")
            .removePrefix("Omit<")
            .substringBefore(", '")

    if (type == "Subscribable")
        type = "Subscribable<Listener>"

    if (type.startsWith("QueryObserver<") && type.count { it == ',' } == 3) {
        type = type.removeSuffix(">") + ", QueryKey>"
    }

    if (type.startsWith("QueryObserverOptions<") && type.count { it == ',' } == 4) {
        type = type.removeSuffix(">") + ", Any?>"
    }

    return type
}

private fun member(
    source: String,
    open: Boolean,
    optionsMode: Boolean,
): Member? {
    if (source == "#private")
        return null

    if (source.startsWith("private ") || source.startsWith(" ") || source.startsWith("/"))
        return null

    if (source.startsWith("constructor("))
        return Constructor(source)

    val i1 = source.indexOf(":")
    val i2 = source.indexOf("(")
    return if (i1 != -1 && (i2 == -1 || (i1 < i2))) {
        Property(
            source = source.removePrefix("readonly "),
            isVar = !optionsMode && !source.startsWith("readonly "),
        )
    } else {
        Method(source)
    }.also { it.open = open }
}
