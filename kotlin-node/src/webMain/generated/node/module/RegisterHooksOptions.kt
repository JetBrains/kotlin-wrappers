// Automatically generated - do not modify!

package node.module

sealed external interface RegisterHooksOptions {
    /**
     * See [load hook](https://nodejs.org/docs/latest-v24.x/api/module.html#loadurl-context-nextload).
     * @default undefined
     */
    var load: LoadHookSync?

    /**
     * See [resolve hook](https://nodejs.org/docs/latest-v24.x/api/module.html#resolvespecifier-context-nextresolve).
     * @default undefined
     */
    var resolve: ResolveHookSync?
}
