package karakum.cesium

internal class Namespace(
    source: Definition,
) : TypeBase(source) {
    var parentName: String? = null

    override val docName: String
        get() = if (parentName != null) {
            "$parentName.${super.docName}"
        } else {
            super.docName
        }

    override val typeName: String = "object"
    override val companion: HasMembers? = null
    override val staticBody: Boolean = true

    override fun toCode(): String {
        if (name == "ITwinPlatform") {
            return "external object " +
                    source.body
                        .replace(" enum ", " interface ")
                        .replace(": string | undefined;", ": String?")
                        .replace(": string | Resource;", ": Resource")
        }

        return super.toCode()
    }

    companion object {
        const val PREFIX = "export namespace "
    }
}
