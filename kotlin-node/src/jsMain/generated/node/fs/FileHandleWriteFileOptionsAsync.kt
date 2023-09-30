package node.fs

import node.events.Abortable


external interface FileHandleWriteFileAsyncOptions : ObjectEncodingOptions, FlagAndOpenMode, Abortable
