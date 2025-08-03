package web.file

import web.blob.Blob
import web.dom.document
import web.html.HtmlTagName
import web.url.URL.Companion.createObjectURL

object Files {
    /**
     * Downloads the given content as a file.
     * By default, the file is directly downloaded to the default download
     * directory of the browser. If you want to select the download location via a file selector,
     * then you have to configure that behaviour in your browser settings.
     * @param content - The file content.
     * @param fileName - The proposed filename.
     */
    fun downloadFile(
        content: Blob,
        fileName: String,
    ) {
        val anchor = document.createElement(HtmlTagName.a)
        anchor.href = createObjectURL(content)
        anchor.download = fileName
        anchor.style.visibility = "hidden"
        document.body.appendChild(anchor)

        anchor.click()
        anchor.remove()
    }
}
