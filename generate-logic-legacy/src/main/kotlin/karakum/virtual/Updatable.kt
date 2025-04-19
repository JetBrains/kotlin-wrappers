package karakum.virtual

import karakum.common.ConversionResult

// language=kotlin
private const val UPDATABLE_CODE = """
external interface Updatable<T, D>{
    @JsNativeInvoke
    operator fun invoke(): T
    
    fun updateDeps(newDeps: D)
}
"""

internal val UPDATABLE = ConversionResult(
    name = "Updatable",
    body = UPDATABLE_CODE,
)
