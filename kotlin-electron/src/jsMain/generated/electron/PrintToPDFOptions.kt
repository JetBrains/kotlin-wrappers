package electron


external interface PrintToPDFOptions {
    /**
     * Paper orientation.`true` for landscape, `false` for portrait. Defaults to false.
     */
    var landscape: Boolean?

    /**
     * Whether to display header and footer. Defaults to false.
     */
    var displayHeaderFooter: Boolean?

    /**
     * Whether to print background graphics. Defaults to false.
     */
    var printBackground: Boolean?

    /**
     * Scale of the webpage rendering. Defaults to 1.
     */
    var scale: Double?

    /**
     * Specify page size of the generated PDF. Can be `A0`, `A1`, `A2`, `A3`, `A4`,
     * `A5`, `A6`, `Legal`, `Letter`, `Tabloid`, `Ledger`, or an Object containing
     * `height` and `width` in inches. Defaults to `Letter`.
     */
    var pageSize: Any /* (string) | (Size) */?
    var margins: Margins?

    /**
     * Paper ranges to print, e.g., '1-5, 8, 11-13'. Defaults to the empty string,
     * which means print all pages.
     */
    var pageRanges: String?

    /**
     * HTML template for the print header. Should be valid HTML markup with following
     * classes used to inject printing values into them: `date` (formatted print date),
     * `title` (document title), `url` (document location), `pageNumber` (current page
     * number) and `totalPages` (total pages in the document). For example, `<span
     * class=title></span>` would generate span containing the title.
     */
    var headerTemplate: String?

    /**
     * HTML template for the print footer. Should use the same format as the
     * `headerTemplate`.
     */
    var footerTemplate: String?

    /**
     * Whether or not to prefer page size as defined by css. Defaults to false, in
     * which case the content will be scaled to fit the paper size.
     */
    var preferCSSPageSize: Boolean?
}
