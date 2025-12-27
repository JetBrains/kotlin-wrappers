// Automatically generated - do not modify!

package node.test.reporters

import node.stream.Transform

sealed external interface ReporterConstructorWrapper<T : Transform> {
    // new (...args: ConstructorParameters<T>): InstanceType<T>;
    operator fun invoke(vararg args: Any? /* ConstructorParameters<JsClass<T>> */): T
}
