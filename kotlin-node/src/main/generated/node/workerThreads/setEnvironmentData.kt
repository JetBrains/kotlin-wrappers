// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")
@file:JsNonModule

package node.workerThreads

/**
 * The `worker.setEnvironmentData()` API sets the content of`worker.getEnvironmentData()` in the current thread and all new `Worker`instances spawned from the current context.
 * @since v15.12.0, v14.18.0
 * @param key Any arbitrary, cloneable JavaScript value that can be used as a {Map} key.
 * @param value Any arbitrary, cloneable JavaScript value that will be cloned and passed automatically to all new `Worker` instances. If `value` is passed as `undefined`, any previously set value
 * for the `key` will be deleted.
 */
external fun setEnvironmentData(
    key: Serializable,
    value: Serializable,
)
