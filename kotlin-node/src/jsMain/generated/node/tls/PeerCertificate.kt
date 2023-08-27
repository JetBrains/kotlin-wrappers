package node.tls

import node.buffer.Buffer


sealed external interface PeerCertificate {
    /**
     * `true` if a Certificate Authority (CA), `false` otherwise.
     * @since v18.13.0
     */
    var ca: Boolean

    /**
     * The DER encoded X.509 certificate data.
     */
    var raw: Buffer

    /**
     * The certificate subject.
     */
    var subject: Certificate

    /**
     * The certificate issuer, described in the same terms as the `subject`.
     */
    var issuer: Certificate

    /**
     * The date-time the certificate is valid from.
     */
    var valid_from: String

    /**
     * The date-time the certificate is valid to.
     */
    var valid_to: String

    /**
     * The certificate serial number, as a hex string.
     */
    var serialNumber: String

    /**
     * The SHA-1 digest of the DER encoded certificate.
     * It is returned as a `:` separated hexadecimal string.
     */
    var fingerprint: String

    /**
     * The SHA-256 digest of the DER encoded certificate.
     * It is returned as a `:` separated hexadecimal string.
     */
    var fingerprint256: String

    /**
     * The SHA-512 digest of the DER encoded certificate.
     * It is returned as a `:` separated hexadecimal string.
     */
    var fingerprint512: String

    /**
     * The extended key usage, a set of OIDs.
     */
    var ext_key_usage: js.core.ReadonlyArray<String>?

    /**
     * A string containing concatenated names for the subject,
     * an alternative to the `subject` names.
     */
    var subjectaltname: String?

    /**
     * An array describing the AuthorityInfoAccess, used with OCSP.
     */
    var infoAccess: node.Dict<js.core.ReadonlyArray<String>>?

    /**
     * For RSA keys: The RSA bit size.
     *
     * For EC keys: The key size in bits.
     */
    var bits: Double?

    /**
     * The RSA exponent, as a string in hexadecimal number notation.
     */
    var exponent: String?

    /**
     * The RSA modulus, as a hexadecimal string.
     */
    var modulus: String?

    /**
     * The public key.
     */
    var pubkey: Buffer?

    /**
     * The ASN.1 name of the OID of the elliptic curve.
     * Well-known curves are identified by an OID.
     * While it is unusual, it is possible that the curve
     * is identified by its mathematical properties,
     * in which case it will not have an OID.
     */
    var asn1Curve: String?

    /**
     * The NIST name for the elliptic curve,if it has one
     * (not all well-known curves have been assigned names by NIST).
     */
    var nistCurve: String?
}
