package karakum.query

class Property(
    override val source: String,
    private val isVar: Boolean,
) : Member() {
    private val type: String by lazy {
        kotlinType(source.substringAfter(": "), name)
            .fixDefaultOptions()
    }

    override fun toCode(): String {
        if (name == "children" && type == "react.ReactNode")
            return "override var children: react.ReactNode?"

        val optional = source.startsWith("$name?: ")
                && type != "Void"
                && type != "Any?"
        val typeDeclaration = if (optional && (") -> " in type || !type.endsWith(">?"))) {
            if (type.startsWith("(")) "($type)?" else "$type?"
        } else type

        return "$modifiers ${if (isVar) "var" else "val"} ${safeName(name)}: $typeDeclaration"
    }
}
