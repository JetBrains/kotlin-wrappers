// Automatically generated - do not modify!

package web.gpu

import js.core.UInt53
import js.serialization.Serializable

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage)
 */
external class GPUCompilationMessage
private constructor() :
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/length)
     */
    val length: UInt53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/lineNum)
     */
    val lineNum: UInt53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/linePos)
     */
    val linePos: UInt53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/message)
     */
    val message: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/offset)
     */
    val offset: UInt53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/type)
     */
    val type: GPUCompilationMessageType
}
