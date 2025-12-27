// Automatically generated - do not modify!

package node.process

sealed external interface EmitWarningOptions {
    /**
     * When `warning` is a `string`, `type` is the name to use for the _type_ of warning being emitted.
     *
     * @default 'Warning'
     */
    var type: String?

    /**
     * A unique identifier for the warning instance being emitted.
     */
    var code: String?

    /**
     * When `warning` is a `string`, `ctor` is an optional function used to limit the generated stack trace.
     *
     * @default process.emitWarning
     */
    var ctor: Function<*>?

    /**
     * Additional text to include with the error.
     */
    var detail: String?
}
