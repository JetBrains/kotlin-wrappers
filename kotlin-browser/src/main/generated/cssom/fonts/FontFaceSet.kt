// Automatically generated - do not modify!

package cssom.fonts

import kotlinx.js.ReadonlyArray
import web.events.EventTarget
import kotlin.js.Promise

sealed external class FontFaceSet :
    EventTarget {
    val ready: Promise<FontFaceSet>
    val status: FontFaceSetLoadStatus
    fun check(
        font: String,
        text: String = definedExternally,
    ): Boolean

    fun load(
        font: String,
        text: String = definedExternally,
    ): Promise<ReadonlyArray<FontFace>>

    fun forEach(action: (item: FontFace) -> Unit)
}
