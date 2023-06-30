package electron.core


external interface ImportCertificateOptions {
    /**
     * Path for the pkcs12 file.
     */
    var certificate: String

    /**
     * Passphrase for the certificate.
     */
    var password: String
}
