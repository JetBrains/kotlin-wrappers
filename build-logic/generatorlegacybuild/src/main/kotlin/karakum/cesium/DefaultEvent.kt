package karakum.cesium

private const val CODE: String = """
typealias DefaultEvent = Event<() -> Unit>
"""

internal object DefaultEvent : Declaration() {
    override val name: String = "DefaultEvent"

    override val source: Definition
        get() = throw UnsupportedOperationException()

    override fun toCode(): String = CODE.removePrefix("\n")
}
