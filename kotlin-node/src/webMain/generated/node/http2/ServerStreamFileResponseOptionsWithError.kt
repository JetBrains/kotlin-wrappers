// Automatically generated - do not modify!

package node.http2

sealed external interface ServerStreamFileResponseOptionsWithError : ServerStreamFileResponseOptions {
    var onError: ((err: node.ErrnoException) -> Unit)?
}
