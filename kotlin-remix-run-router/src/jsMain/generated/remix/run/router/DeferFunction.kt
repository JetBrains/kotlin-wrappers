package remix.run.router


typealias DeferFunction = (data: js.core.ReadonlyRecord<String, Any>, init: Any /* number | ResponseInit */ /* use undefined for default */) -> DeferredData
