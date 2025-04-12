package karakum.cesium

internal const val CONSTRUCTOR_OPTIONS: String = "ConstructorOptions"

internal class Constructor(
    override val source: Definition,
) : Member() {
    override val name: String
        get() = TODO()

    override val static: Boolean = false

    val parameters = source.body
        .splitToSequence(", ")
        .filter { it.isNotEmpty() }
        .map(::Parameter)
        .toList()

    val hiddenOptions: Boolean by lazy {
        hasHiddenOptions()
    }

    val hasParameters: Boolean by lazy {
        parameters.size > 1 || (parameters.size == 1 && !hiddenOptions)
    }

    override fun toCode(): String =
        parameters
            .dropLast(if (hiddenOptions) 1 else 0)
            .toCode(multilinePreferred = true)
            .takeIf { it.isNotEmpty() }
            ?.let { "constructor$it" }
            ?: ""

    private companion object {
        fun Constructor.hasHiddenOptions(): Boolean {
            parameters.lastOrNull()
                ?.takeIf { it.name == "options" }
                ?.takeIf { it.optional }
                ?.takeIf { it.type.endsWith(CONSTRUCTOR_OPTIONS) }
                ?: return false

            val klass = parent as Class

            val options = sequenceOf(klass, klass.companion)
                .filterNotNull()
                .flatMap { it.members.asSequence() }
                .filterIsInstance<SimpleType>()
                .single { it.name == CONSTRUCTOR_OPTIONS }

            val mutablePropertyNames = klass.members
                .asSequence()
                .filterIsInstance<Property>()
                .filterNot { it.readOnly }
                .map { it.name }
                .toSet()

            return options.parameterNames
                .all { it in mutablePropertyNames }
        }
    }
}
