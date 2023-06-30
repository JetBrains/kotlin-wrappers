package electron


external interface Opts {
    /**
     *  Keep the page hidden instead of visible. Default is `false`.
     */
    var stayHidden: Boolean?

    /**
     *  Keep the system awake instead of allowing it to sleep. Default is `false`.
     */
    var stayAwake: Boolean?
}
