// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * An event emitter can be used to create and manage an [Event] for others
 * to subscribe to. One emitter always owns one event.
 *
 * Use this class if you want to provide event from within your extension, for instance
 * inside a [TextDocumentContentProvider] or when providing
 * API to other extensions.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EventEmitter)
 */
open external class EventEmitter<T : JsAny?> :
    DisposableLike {
    /**
     * The event listeners can subscribe to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EventEmitter.event)
     */
    var event: Event<T>

    /**
     * Notify all subscribers of the [event][EventEmitter.event]. Failure
     * of one or more listener will not fail this function call.
     *
     * @param data The event object.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EventEmitter.fire)
     */
    fun fire(data: T)

    /**
     * Dispose this object and free resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EventEmitter.dispose)
     */
    override fun dispose()
}
