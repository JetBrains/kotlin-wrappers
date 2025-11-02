// Automatically generated - do not modify!

package web.mediastreams

import web.errors.DOMException
import kotlin.js.definedExternally

/**
 * The **`OverconstrainedError`** interface of the Media Capture and Streams API indicates that the set of desired capabilities for the current MediaStreamTrack cannot currently be met. When this event is thrown on a MediaStreamTrack, it is muted until either the current constraints can be established or until satisfiable constraints are applied.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError)
 */
open external class OverconstrainedError(
    /**
     * The **`constraint`** read-only property of the OverconstrainedError interface returns the constraint that was supplied in the constructor, meaning the constraint that was not satisfied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError/constraint)
     */
    val constraint: String,
    message: String = definedExternally,
) : DOMException
