// Automatically generated - do not modify!

package node.crypto

sealed external interface SigningOptions {
    /**
     * @See crypto.constants.RSA_PKCS1_PADDING
     */
    var padding: Number?
    var saltLength: Number?
    var dsaEncoding: DSAEncoding?
}
