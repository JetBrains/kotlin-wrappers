@file:JsModule("react-router/context")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.RouterState
import remix.run.router.TrackedPromise

/* import * as React from "react"; */

/* import type { AgnosticRouteMatch, AgnosticIndexRouteObject, AgnosticNonIndexRouteObject, History, Location, Router, StaticHandlerContext, To, TrackedPromise } from "@remix-run/router"; */

/* import type { Action as NavigationType } from "@remix-run/router"; */

external val DataRouterContext: react.Context<DataRouterContextObject?>

external val DataRouterStateContext: react.Context</* import("@remix-run/router") */ RouterState?>

external val AwaitContext: react.Context<TrackedPromise?>

external val NavigationContext: react.Context<NavigationContextObject>

external val LocationContext: react.Context<LocationContextObject>

external val RouteContext: react.Context<RouteContextObject>

external val RouteErrorContext: react.Context<Any?>

/* export {}; */
