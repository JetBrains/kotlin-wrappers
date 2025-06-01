// Automatically generated - do not modify!

package web.mediastreams

import web.errors.DOMException
import kotlin.js.definedExternally

/**
 * The **`OverconstrainedError`** interface of the Media Capture and Streams API indicates that the set of desired capabilities for the current MediaStreamTrack cannot currently be met.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError)
 */
open external class OverconstrainedError(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError/constraint)
     */
    val constraint: String,
    message: String = definedExternally,
) : DOMException
