package karakum.cesium

internal class Class(
    source: Definition,
) : TypeBase(source) {
    override val typeName: String = "class"

    override val open: Boolean
        get() = !abstract

    override var companion: HasMembers? = null

    companion object {
        const val PREFIX = "export class "
    }
}
