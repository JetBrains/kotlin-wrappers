// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.events

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Event {
    companion object {
        @JsValue("OCSPRequest")
        val OCSP_REQUEST: OCSP_REQUEST

        @JsValue("OCSPResponse")
        val OCSP_RESPONSE: OCSP_RESPONSE

        @JsValue("SIGCONT")
        val SIGCONT: SIGCONT

        @JsValue("SIGINT")
        val SIGINT: SIGINT

        @JsValue("SIGTSTP")
        val SIGTSTP: SIGTSTP

        @JsValue("abort")
        val ABORT: ABORT

        @JsValue("aborted")
        val ABORTED: ABORTED

        @JsValue("altsvc")
        val ALTSVC: ALTSVC

        @JsValue("beforeExit")
        val BEFORE_EXIT: BEFORE_EXIT

        @JsValue("change")
        val CHANGE: CHANGE

        @JsValue("checkContinue")
        val CHECK_CONTINUE: CHECK_CONTINUE

        @JsValue("checkExpectation")
        val CHECK_EXPECTATION: CHECK_EXPECTATION

        @JsValue("clientError")
        val CLIENT_ERROR: CLIENT_ERROR

        @JsValue("close")
        val CLOSE: CLOSE

        @JsValue("connect")
        val CONNECT: CONNECT

        @JsValue("connection")
        val CONNECTION: CONNECTION

        @JsValue("continue")
        val CONTINUE: CONTINUE

        @JsValue("data")
        val DATA: DATA

        @JsValue("disconnect")
        val DISCONNECT: DISCONNECT

        @JsValue("drain")
        val DRAIN: DRAIN

        @JsValue("drop")
        val DROP: DROP

        @JsValue("dropRequest")
        val DROP_REQUEST: DROP_REQUEST

        @JsValue("end")
        val END: END

        @JsValue("error")
        val ERROR: ERROR

        @JsValue("exit")
        val EXIT: EXIT

        @JsValue("finish")
        val FINISH: FINISH

        @JsValue("fork")
        val FORK: FORK

        @JsValue("frameError")
        val FRAME_ERROR: FRAME_ERROR

        @JsValue("goaway")
        val GOAWAY: GOAWAY

        @JsValue("headers")
        val HEADERS: HEADERS

        @JsValue("history")
        val HISTORY: HISTORY

        @JsValue("information")
        val INFORMATION: INFORMATION

        @JsValue("inspectorNotification")
        val INSPECTOR_NOTIFICATION: INSPECTOR_NOTIFICATION

        @JsValue("keylog")
        val KEYLOG: KEYLOG

        @JsValue("line")
        val LINE: LINE

        @JsValue("listening")
        val LISTENING: LISTENING

        @JsValue("localSettings")
        val LOCAL_SETTINGS: LOCAL_SETTINGS

        @JsValue("lookup")
        val LOOKUP: LOOKUP

        @JsValue("message")
        val MESSAGE: MESSAGE

        @JsValue("messageerror")
        val MESSAGE_ERROR: MESSAGE_ERROR

        @JsValue("multipleResolves")
        val MULTIPLE_RESOLVES: MULTIPLE_RESOLVES

        @JsValue("newSession")
        val NEW_SESSION: NEW_SESSION

        @JsValue("online")
        val ONLINE: ONLINE

        @JsValue("open")
        val OPEN: OPEN

        @JsValue("origin")
        val ORIGIN: ORIGIN

        @JsValue("pause")
        val PAUSE: PAUSE

        @JsValue("ping")
        val PING: PING

        @JsValue("pipe")
        val PIPE: PIPE

        @JsValue("push")
        val PUSH: PUSH

        @JsValue("readable")
        val READABLE: READABLE

        @JsValue("ready")
        val READY: READY

        @JsValue("rejectionHandled")
        val REJECTION_HANDLED: REJECTION_HANDLED

        @JsValue("remoteSettings")
        val REMOTE_SETTINGS: REMOTE_SETTINGS

        @JsValue("request")
        val REQUEST: REQUEST

        @JsValue("reset")
        val RESET: RESET

        @JsValue("resize")
        val RESIZE: RESIZE

        @JsValue("response")
        val RESPONSE: RESPONSE

        @JsValue("resume")
        val RESUME: RESUME

        @JsValue("resumeSession")
        val RESUME_SESSION: RESUME_SESSION

        @JsValue("secureConnect")
        val SECURE_CONNECT: SECURE_CONNECT

        @JsValue("secureConnection")
        val SECURE_CONNECTION: SECURE_CONNECTION

        @JsValue("session")
        val SESSION: SESSION

        @JsValue("sessionError")
        val SESSION_ERROR: SESSION_ERROR

        @JsValue("setup")
        val SETUP: SETUP

        @JsValue("socket")
        val SOCKET: SOCKET

        @JsValue("spawn")
        val SPAWN: SPAWN

        @JsValue("stream")
        val STREAM: STREAM

        @JsValue("streamClosed")
        val STREAM_CLOSED: STREAM_CLOSED

        @JsValue("timeout")
        val TIMEOUT: TIMEOUT

        @JsValue("tlsClientError")
        val TLS_CLIENT_ERROR: TLS_CLIENT_ERROR

        @JsValue("trailers")
        val TRAILERS: TRAILERS

        @JsValue("uncaughtException")
        val UNCAUGHT_EXCEPTION: UNCAUGHT_EXCEPTION

        @JsValue("uncaughtExceptionMonitor")
        val UNCAUGHT_EXCEPTION_MONITOR: UNCAUGHT_EXCEPTION_MONITOR

        @JsValue("unhandledRejection")
        val UNHANDLED_REJECTION: UNHANDLED_REJECTION

        @JsValue("unknownProtocol")
        val UNKNOWN_PROTOCOL: UNKNOWN_PROTOCOL

        @JsValue("unpipe")
        val UNPIPE: UNPIPE

        @JsValue("upgrade")
        val UPGRADE: UPGRADE

        @JsValue("wantTrailers")
        val WANT_TRAILERS: WANT_TRAILERS

        @JsValue("warning")
        val WARNING: WARNING

        @JsValue("worker")
        val WORKER: WORKER
    }

    sealed interface OCSP_REQUEST
    sealed interface OCSP_RESPONSE : EventType
    sealed interface SIGCONT : EventType
    sealed interface SIGINT : EventType
    sealed interface SIGTSTP : EventType
    sealed interface ABORT : EventType
    sealed interface ABORTED : EventType
    sealed interface ALTSVC : EventType
    sealed interface BEFORE_EXIT : EventType
    sealed interface CHANGE : EventType
    sealed interface CHECK_CONTINUE : EventType
    sealed interface CHECK_EXPECTATION : EventType
    sealed interface CLIENT_ERROR : EventType
    sealed interface CLOSE : EventType
    sealed interface CONNECT : EventType
    sealed interface CONNECTION : EventType
    sealed interface CONTINUE : EventType
    sealed interface DATA : EventType
    sealed interface DISCONNECT : EventType
    sealed interface DRAIN : EventType
    sealed interface DROP : EventType
    sealed interface DROP_REQUEST : EventType
    sealed interface END : EventType
    sealed interface ERROR : EventType
    sealed interface EXIT : EventType
    sealed interface FINISH : EventType
    sealed interface FORK : EventType
    sealed interface FRAME_ERROR : EventType
    sealed interface GOAWAY : EventType
    sealed interface HEADERS : EventType
    sealed interface HISTORY : EventType
    sealed interface INFORMATION : EventType
    sealed interface INSPECTOR_NOTIFICATION : EventType
    sealed interface KEYLOG : EventType
    sealed interface LINE : EventType
    sealed interface LISTENING : EventType
    sealed interface LOCAL_SETTINGS : EventType
    sealed interface LOOKUP : EventType
    sealed interface MESSAGE : EventType
    sealed interface MESSAGE_ERROR : EventType
    sealed interface MULTIPLE_RESOLVES : EventType
    sealed interface NEW_SESSION : EventType
    sealed interface ONLINE : EventType
    sealed interface OPEN : EventType
    sealed interface ORIGIN : EventType
    sealed interface PAUSE : EventType
    sealed interface PING : EventType
    sealed interface PIPE : EventType
    sealed interface PUSH : EventType
    sealed interface READABLE : EventType
    sealed interface READY : EventType
    sealed interface REJECTION_HANDLED : EventType
    sealed interface REMOTE_SETTINGS : EventType
    sealed interface REQUEST : EventType
    sealed interface RESET : EventType
    sealed interface RESIZE : EventType
    sealed interface RESPONSE : EventType
    sealed interface RESUME : EventType
    sealed interface RESUME_SESSION : EventType
    sealed interface SECURE_CONNECT : EventType
    sealed interface SECURE_CONNECTION : EventType
    sealed interface SESSION : EventType
    sealed interface SESSION_ERROR : EventType
    sealed interface SETUP : EventType
    sealed interface SOCKET : EventType
    sealed interface SPAWN : EventType
    sealed interface STREAM : EventType
    sealed interface STREAM_CLOSED : EventType
    sealed interface TIMEOUT : EventType
    sealed interface TLS_CLIENT_ERROR : EventType
    sealed interface TRAILERS : EventType
    sealed interface UNCAUGHT_EXCEPTION : EventType
    sealed interface UNCAUGHT_EXCEPTION_MONITOR : EventType
    sealed interface UNHANDLED_REJECTION : EventType
    sealed interface UNKNOWN_PROTOCOL : EventType
    sealed interface UNPIPE : EventType
    sealed interface UPGRADE : EventType
    sealed interface WANT_TRAILERS : EventType
    sealed interface WARNING : EventType
    sealed interface WORKER : EventType
}
