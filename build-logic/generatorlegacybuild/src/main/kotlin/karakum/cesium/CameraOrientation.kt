package karakum.cesium

// language=Kotlin
private const val CODE: String = """
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface CameraOrientation
"""

internal object CameraOrientation : Declaration() {
    override val name: String = "CameraOrientation"

    override val source: Definition
        get() = throw UnsupportedOperationException()

    override fun toCode(): String = CODE.removePrefix("\n")
}
