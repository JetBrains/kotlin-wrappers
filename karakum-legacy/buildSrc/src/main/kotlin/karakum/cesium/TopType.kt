package karakum.cesium

internal class TopType(
    override val source: Definition,
) : Declaration() {
    override val name: String =
        source.defaultName

    override fun toCode(): String {
        val bodySource = typeDeclaration(source.body, true)
        val body = when (name) {
            "HeadingPitchRollValues",
            "DirectionUp",
                -> bodySource.replaceFirst(name, "$name : ${CameraOrientation.name}")

            else -> bodySource
        }

        return DEFAULT_PACKAGE +
                source.doc() +
                "\n" +
                body
    }

    companion object {
        const val PREFIX = "export type "
    }
}
