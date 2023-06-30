package electron


external interface InsertCSSOptions {
    /**
     * Can be either 'user' or 'author'. Sets the cascade origin of the inserted
     * stylesheet. Default is 'author'.
     */
    var cssOrigin: String?
}
