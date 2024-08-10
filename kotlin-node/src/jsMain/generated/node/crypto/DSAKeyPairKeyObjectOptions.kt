// Generated by Karakum - do not modify it manually!

package node.crypto

sealed external interface DSAKeyPairKeyObjectOptions {
    /**
     * Key size in bits
     */
    var modulusLength: Double

    /**
     * Size of q in bits
     */
    var divisorLength: Double
}
