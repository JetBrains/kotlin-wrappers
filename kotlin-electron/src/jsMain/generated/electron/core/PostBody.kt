package electron.core


external interface PostBody {
// Docs: https://electronjs.org/docs/api/structures/post-body
    /**
     * The boundary used to separate multiple parts of the message. Only valid when
     * `contentType` is `multipart/form-data`.
     */
    var boundary: String?

    /**
     * The `content-type` header used for the data. One of
     * `application/x-www-form-urlencoded` or `multipart/form-data`. Corresponds to the
     * `enctype` attribute of the submitted HTML form.
     */
    var contentType: String

    /**
     * The post data to be sent to the new window.
     */
    var data: Array<Any /* (UploadRawData) | (UploadFile) */>
}
