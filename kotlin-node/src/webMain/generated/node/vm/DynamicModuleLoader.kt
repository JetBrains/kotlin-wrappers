// Automatically generated - do not modify!

package node.vm

import node.module.ImportAttributes
import node.module.ImportPhase

typealias DynamicModuleLoader<T> = (specifier: String, referrer: T, importAttributes: ImportAttributes, phase: ImportPhase) -> js.promise.PromiseResult<Module>
