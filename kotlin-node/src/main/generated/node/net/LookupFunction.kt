// Automatically generated - do not modify!

package node.net

import node.ErrnoException

typealias LookupFunction = (
    hostname: String,
    options: dynamic, /* dns.LookupOneOptions */
    callback: (
        err: ErrnoException?,
        address: String,
        family: Number,
    ) -> Unit,
) -> Unit
