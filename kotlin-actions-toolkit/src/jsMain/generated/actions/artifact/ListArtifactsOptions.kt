// Automatically generated - do not modify!

package actions.artifact

import js.objects.JsPlainObject

@JsPlainObject
external interface ListArtifactsOptions {
    /**
     * Filter the workflow run's artifacts to the latest by name
     * In the case of reruns, this can be useful to avoid duplicates
     */
    val latest: Boolean?
}
