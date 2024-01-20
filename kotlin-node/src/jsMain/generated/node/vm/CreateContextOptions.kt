// Generated by Karakum - do not modify it manually!


package node.vm


sealed external interface CreateContextOptions {
    /**
     * Human-readable name of the newly created context.
     * @default 'VM Context i' Where i is an ascending numerical index of the created context.
     */
    var name: String?

    /**
     * Corresponds to the newly created context for display purposes.
     * The origin should be formatted like a `URL`, but with only the scheme, host, and port (if necessary),
     * like the value of the `url.origin` property of a URL object.
     * Most notably, this string should omit the trailing slash, as that denotes a path.
     * @default ''
     */
    var origin: String?
    var codeGeneration: (CreateContextOptionsCodeGeneration)?

    /**
     * If set to `afterEvaluate`, microtasks will be run immediately after the script has run.
     */
    var microtaskMode: String /* "afterEvaluate" */?
}