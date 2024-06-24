// Automatically generated - do not modify!

package typescript

/** @deprecated */
sealed external interface UpdateBundleProject<T : BuilderProgram> : InvalidatedProjectBase {
    override val kind: InvalidatedProjectKind.UpdateBundle
    fun emit(
        writeFile: WriteFileCallback = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): Any? /* EmitResult | BuildInvalidedProject<T> | undefined */
}
