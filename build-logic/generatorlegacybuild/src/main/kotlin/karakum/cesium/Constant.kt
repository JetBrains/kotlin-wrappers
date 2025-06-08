package karakum.cesium

internal class Constant(
    override val source: Definition,
) : Member() {
    override val name: String
        get() = TODO()

    override val static = false

    override fun toCode(): String {
        val body = source.body
        val name: String
        val type: String
        if (": " in body) {
            name = body.substringBefore(": ")
            type = kotlinType(source.body.substringAfter(": "))
        } else {
            val (sourceName, sourceType) = body.split(" = ")
            checkNotNull(sourceType.toDoubleOrNull()) {
                "Non-number source type isn't supported"
            }
            name = sourceName
            type = "Double"
        }

        return source.doc() + "\n" +
                "val $name: $type"
    }
}
