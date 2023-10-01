package node.fs

import node.events.Abortable


sealed external interface FileHandleWriteFileAsyncOptions : ObjectEncodingOptions, FlagAndOpenMode, Abortable
