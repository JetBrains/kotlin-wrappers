package karakum.cesium

internal class Class(
    source: Definition,
) : TypeBase(source) {
    override val typeName: String = "class"

    override val open: Boolean
        get() = !abstract

    override var companion: HasMembers? = null

    override fun toCode(): String {
        var code = super.toCode()
        if (name.endsWith("TerrainProvider"))
            code = code
                .replace(
                    "override val errorEvent: DefaultEvent",
                    "override val errorEvent: Event<ErrorEventPayload>",
                )
                .replace(
                    "override var errorEvent: DefaultEvent",
                    "override var errorEvent: Event<ErrorEventPayload>",
                )

        return code
    }

    companion object {
        const val PREFIX = "export class "
    }
}
