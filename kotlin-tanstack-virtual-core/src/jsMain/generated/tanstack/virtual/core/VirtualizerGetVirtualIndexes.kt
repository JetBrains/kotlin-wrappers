// Automatically generated - do not modify!

package tanstack.virtual.core

external interface VirtualizerGetVirtualIndexes {
    operator fun invoke(): js.array.ReadonlyArray<Double>

    fun updateDeps(
        newDeps: js.array.Tuple5<(range: Range) -> js.array.ReadonlyArray<Double>, Double, Double, Double?, Double?>,
    )
}
