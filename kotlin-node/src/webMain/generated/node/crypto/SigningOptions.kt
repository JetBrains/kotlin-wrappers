// Automatically generated - do not modify!

package node.crypto

sealed external interface SigningOptions {
    /**
     * @see crypto.constants.RSA_PKCS1_PADDING
     */
    var padding: Double?
    var saltLength: Double?
    var dsaEncoding: DSAEncoding?
    var context: Any? // ArrayBuffer | NodeJS.ArrayBufferView | undefined
}
