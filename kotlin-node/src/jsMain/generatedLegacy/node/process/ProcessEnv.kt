// Automatically generated - do not modify!

package node.process

import node.Dict

sealed external interface ProcessEnv : Dict<String> {
    /**
     * Can be used to change the default timezone at runtime
     */
    var TZ: String?
}
