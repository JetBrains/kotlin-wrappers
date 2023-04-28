@file:JsModule("react-router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.RouterState
import remix.run.router.TrackedPromise

/* import * as React from "react"; */

/* import type { AgnosticRouteMatch, AgnosticIndexRouteObject, AgnosticNonIndexRouteObject, History, Location, RelativeRoutingType, Router, StaticHandlerContext, To, TrackedPromise, LazyRouteFunction } from "@remix-run/router"; */

/* import type { Action as NavigationType } from "@remix-run/router"; */


@JsName("UNSAFE_DataRouterContext")
external val DataRouterContext: react.Context<DataRouterContextObject?>


@JsName("UNSAFE_DataRouterStateContext")
external val DataRouterStateContext: react.Context</* import("@remix-run/router") */ RouterState?>


external val AwaitContext: react.Context<TrackedPromise?>


@JsName("UNSAFE_NavigationContext")
external val NavigationContext: react.Context<NavigationContextObject>


@JsName("UNSAFE_LocationContext")
external val LocationContext: react.Context<LocationContextObject>


@JsName("UNSAFE_RouteContext")
external val RouteContext: react.Context<RouteContextObject>


external val RouteErrorContext: react.Context<Any?>

/* export {}; */
