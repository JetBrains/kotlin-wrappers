package node.fs


sealed external interface StatSyncFn : Function {

    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(path: PathLike, options: Nothing? = definedExternally): Stats


    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(path: PathLike, options: StatSyncFnSimpleOptions = definedExternally): Stats?


    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(path: PathLike, options: StatSyncFnBigIntOptions): BigIntStats?


    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(path: PathLike, options: StatSyncFnSimpleThrowIfNoEntryOptions = definedExternally): Stats


    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(path: PathLike, options: StatSyncFnBigIntThrowIfNoEntryOptions): BigIntStats


    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(path: PathLike, options: StatSyncFnOptions): Any /* Stats | BigIntStats */


    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(
        path: PathLike,
        options: StatSyncOptions = definedExternally,
    ): (Any /* Stats | BigIntStats | undefined */)?

}
