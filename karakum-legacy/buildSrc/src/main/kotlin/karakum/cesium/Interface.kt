package karakum.cesium

internal class Interface(
    source: Definition,
) : TypeBase(source) {
    override val typeName: String = "interface"
    override var companion: HasMembers? = null

    override fun toCode(): String {
        val code = super.toCode()
        return when (name) {
            PACKABLE -> applyPackableFixes(code)
            else -> code
        }
    }

    companion object {
        const val PREFIX = "export interface "
    }
}
