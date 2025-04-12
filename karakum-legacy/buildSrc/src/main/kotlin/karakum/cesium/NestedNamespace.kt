package karakum.cesium

internal class NestedNamespace(
    override val source: Definition,
) : Member() {
    override val name: String =
        source.defaultName

    override val static: Boolean = true

    override fun toCode(): String =
        Namespace(source)
            .also { it.parentName = parent.name }
            .toCode(false)
}
