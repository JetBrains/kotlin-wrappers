package remix.run.router


/**
 * Result from a loader or action - potentially successful or unsuccessful
 */
typealias DataResult = Any /* SuccessResult | DeferredResult | RedirectResult | ErrorResult */
