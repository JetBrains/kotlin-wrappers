package karakum.cesium

internal class Class(
    source: Definition,
) : TypeBase(source) {
    override val typeName: String = "class"
    override var companion: HasMembers? = null

    companion object {
        const val PREFIX = "export class "
    }
}
