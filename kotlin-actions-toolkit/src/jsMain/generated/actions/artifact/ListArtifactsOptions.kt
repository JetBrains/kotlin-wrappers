// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface ListArtifactsOptions {
    /**
     * Filter the workflow run's artifacts to the latest by name
     * In the case of reruns, this can be useful to avoid duplicates
     */
    var latest: Boolean?
}
