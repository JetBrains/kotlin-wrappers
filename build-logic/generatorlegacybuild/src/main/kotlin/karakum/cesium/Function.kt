package karakum.cesium

internal class Function(
    override val source: Definition,
) : Declaration(), ITop {
    override val name = source.parseFunctionName()

    override fun toCode(): String {
        val code = source.toMethodMembers()
            .map { it.toCode() }
            .joinToString("\n\n")

        return if (code.startsWith("/")) {
            DEFAULT_PACKAGE + code
        } else {
            code
        }
    }

    companion object {
        const val PREFIX = "export function "
    }
}
